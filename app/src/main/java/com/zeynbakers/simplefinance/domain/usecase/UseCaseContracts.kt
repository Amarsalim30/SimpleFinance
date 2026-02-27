package com.zeynbakers.simplefinance.domain.usecase

import com.zeynbakers.simplefinance.domain.engine.CalculationResult
import com.zeynbakers.simplefinance.domain.model.CreditAccountSnapshot
import com.zeynbakers.simplefinance.domain.model.DailyClosingInput
import com.zeynbakers.simplefinance.domain.model.DailyClosingResult
import com.zeynbakers.simplefinance.domain.model.InventoryDeltaInput
import com.zeynbakers.simplefinance.domain.model.InventoryDeltaResult
import com.zeynbakers.simplefinance.domain.model.SupplierLedgerSnapshot

interface CalculateDailyClosingUseCase {
    operator fun invoke(input: DailyClosingInput): CalculationResult<DailyClosingResult>
}

interface CalculateInventoryDeltaUseCase {
    operator fun invoke(input: InventoryDeltaInput): CalculationResult<InventoryDeltaResult>
}

interface CalculateCreditRiskUseCase {
    operator fun invoke(items: List<CreditAccountSnapshot>, todayEpochDay: Long): CalculationResult<CreditRiskSummary>
}

interface CalculateSupplierOutstandingUseCase {
    operator fun invoke(items: List<SupplierLedgerSnapshot>): CalculationResult<SupplierOutstandingSummary>
}

data class CreditRiskSummary(
    val current: Int,
    val oneToSevenDays: Int,
    val eightToThirtyDays: Int,
    val thirtyOnePlusDays: Int,
)

data class SupplierOutstandingSummary(
    val totalOutstandingMinor: Long,
    val supplierCountWithOutstanding: Int,
)

