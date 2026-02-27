# Domain Formula Specification

All money values are represented in minor units (`Long`) to avoid floating-point precision issues.

## Daily Closing

Definitions:

- `openingBalance = openingCash + openingMpesa`
- `actualRevenue = (cashInHand + mpesaBalance) - openingBalance`
- `expectedRevenue = stockPurchased + expenses + targetMarginContribution`
- `variance = actualRevenue - expectedRevenue`
- `variancePercent = variance / max(expectedRevenue, 1)`
- `estimatedProfit = actualRevenue - expenses - stockPurchased`

Notes:

- `targetMarginContribution` is configurable in settings (default `0` for V1).
- Negative variance means underperformance versus expected.

## Inventory Delta

Definitions:

- `bookClosingStock = openingStock + purchases - recordedCostOfGoodsSold`
- `shrinkage = bookClosingStock - closingStock`
- `shrinkagePercent = shrinkage / max(bookClosingStock, 1)`

Notes:

- Positive shrinkage indicates missing stock relative to book value.

## Supplier Outstanding

Definitions:

- `outstanding = totalOrdered - totalPaid`
- Clamp lower bound to `0` if overpaid values are disallowed by validation.

## Credit Risk

Definitions:

- `amountOwed` tracked per customer.
- `daysPastDue = max(todayEpochDay - dueEpochDay, 0)`
- Aging buckets:
- `0` days
- `1-7` days
- `8-30` days
- `31+` days

## Rounding and Formatting

- Formula outputs stay in minor units.
- Percent values are stored as decimal fractions (`0.05` for 5 percent).
- Formatting to currency or percent is done in `core/formatting`.

## Validation Rules

- Monetary inputs must be zero or positive.
- Required daily close fields cannot be blank.
- Closing stock cannot be negative.
- Due dates cannot be missing for credit entries.

