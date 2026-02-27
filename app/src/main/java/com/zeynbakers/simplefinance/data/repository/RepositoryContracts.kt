package com.zeynbakers.simplefinance.data.repository

import com.zeynbakers.simplefinance.domain.model.CreditAccountSnapshot
import com.zeynbakers.simplefinance.domain.model.DailyClosingInput
import com.zeynbakers.simplefinance.domain.model.DailyClosingResult
import com.zeynbakers.simplefinance.domain.model.InventoryDeltaInput
import com.zeynbakers.simplefinance.domain.model.InventoryDeltaResult
import com.zeynbakers.simplefinance.domain.model.SupplierLedgerSnapshot

interface DailyClosingRepository {
    suspend fun save(input: DailyClosingInput, result: DailyClosingResult)
    suspend fun listRecent(limit: Int): List<DailyClosingResult>
}

interface InventoryRepository {
    suspend fun save(input: InventoryDeltaInput, result: InventoryDeltaResult)
    suspend fun latest(): InventoryDeltaResult?
}

interface CreditRepository {
    suspend fun upsert(snapshot: CreditAccountSnapshot)
    suspend fun listOpenAccounts(): List<CreditAccountSnapshot>
}

interface SupplierRepository {
    suspend fun upsert(snapshot: SupplierLedgerSnapshot)
    suspend fun listLedgers(): List<SupplierLedgerSnapshot>
}

interface BackupRepository {
    suspend fun exportJson(): String
    suspend fun exportCsv(): String
    suspend fun restore(payload: String): RestoreResult
}

sealed interface RestoreResult {
    data object Success : RestoreResult
    data class Failure(val reason: String) : RestoreResult
}

