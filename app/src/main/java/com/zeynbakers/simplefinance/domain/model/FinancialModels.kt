package com.zeynbakers.simplefinance.domain.model

typealias MoneyMinor = Long

data class DailyClosingInput(
    val openingCashMinor: MoneyMinor,
    val openingMpesaMinor: MoneyMinor,
    val cashInHandMinor: MoneyMinor,
    val mpesaBalanceMinor: MoneyMinor,
    val stockPurchasedMinor: MoneyMinor,
    val expensesMinor: MoneyMinor,
    val targetMarginContributionMinor: MoneyMinor = 0L,
)

data class DailyClosingResult(
    val expectedRevenueMinor: MoneyMinor,
    val actualRevenueMinor: MoneyMinor,
    val varianceMinor: MoneyMinor,
    val variancePercent: Double,
    val estimatedProfitMinor: MoneyMinor,
)

data class InventoryDeltaInput(
    val openingStockMinor: MoneyMinor,
    val purchasesMinor: MoneyMinor,
    val recordedCostOfGoodsSoldMinor: MoneyMinor,
    val closingStockMinor: MoneyMinor,
)

data class InventoryDeltaResult(
    val bookClosingStockMinor: MoneyMinor,
    val shrinkageMinor: MoneyMinor,
    val shrinkagePercent: Double,
)

data class CreditAccountSnapshot(
    val customerName: String,
    val amountOwedMinor: MoneyMinor,
    val dueEpochDay: Long,
    val lastPaymentEpochDay: Long?,
)

data class SupplierLedgerSnapshot(
    val supplierName: String,
    val totalOrderedMinor: MoneyMinor,
    val totalPaidMinor: MoneyMinor,
    val outstandingMinor: MoneyMinor,
)

