package com.zeynbakers.simplefinance.domain.engine

sealed interface CalculationResult<out T> {
    data class Success<T>(val value: T) : CalculationResult<T>
    data class ValidationError(val fields: List<FieldIssue>) : CalculationResult<Nothing>
    data class ComputationError(val reason: String) : CalculationResult<Nothing>
}

data class FieldIssue(
    val field: String,
    val message: String,
)

