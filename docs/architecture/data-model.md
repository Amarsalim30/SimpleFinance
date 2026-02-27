# Data Model (V1)

## Entity List

1. `DailyClosingEntity`
2. `InventorySnapshotEntity`
3. `CreditCustomerEntity`
4. `CreditTransactionEntity`
5. `SupplierEntity`
6. `SupplierTransactionEntity`
7. `SettingsEntity`

## Key Fields

### `DailyClosingEntity`

- `id: Long`
- `businessDayEpochDay: Long`
- `openingCashMinor: Long`
- `openingMpesaMinor: Long`
- `cashInHandMinor: Long`
- `mpesaBalanceMinor: Long`
- `stockPurchasedMinor: Long`
- `expensesMinor: Long`
- `expectedRevenueMinor: Long`
- `actualRevenueMinor: Long`
- `varianceMinor: Long`
- `estimatedProfitMinor: Long`
- `createdAtEpochMs: Long`
- `updatedAtEpochMs: Long`

### `InventorySnapshotEntity`

- `id: Long`
- `businessDayEpochDay: Long`
- `openingStockMinor: Long`
- `purchasesMinor: Long`
- `recordedCostOfGoodsSoldMinor: Long`
- `closingStockMinor: Long`
- `shrinkageMinor: Long`
- `createdAtEpochMs: Long`

### `CreditCustomerEntity`

- `id: Long`
- `name: String`
- `phone: String?`
- `isActive: Boolean`
- `createdAtEpochMs: Long`

### `CreditTransactionEntity`

- `id: Long`
- `customerId: Long`
- `amountMinor: Long`
- `dueEpochDay: Long`
- `settled: Boolean`
- `settledAtEpochMs: Long?`
- `createdAtEpochMs: Long`

### `SupplierEntity`

- `id: Long`
- `name: String`
- `contact: String?`
- `isActive: Boolean`
- `createdAtEpochMs: Long`

### `SupplierTransactionEntity`

- `id: Long`
- `supplierId: Long`
- `orderedMinor: Long`
- `paidMinor: Long`
- `transactionEpochDay: Long`
- `createdAtEpochMs: Long`

### `SettingsEntity`

- `id: Int` (single row, fixed ID)
- `currencyCode: String`
- `pinHash: String?`
- `pinEnabled: Boolean`
- `targetMarginContributionMinor: Long`
- `updatedAtEpochMs: Long`

## Relationship Notes

- `CreditCustomerEntity (1) -> (many) CreditTransactionEntity`
- `SupplierEntity (1) -> (many) SupplierTransactionEntity`

## Migration Policy

- Every schema change must include a Room migration.
- Version-to-version migration tests are required.
- No destructive migration in production builds.

## Retention Policy (V1)

- Keep all financial records indefinitely on-device.
- Export/restore must preserve IDs and timestamps where possible.

