package com.zeynbakers.simplefinance.core.formatting

interface FinanceFormatter {
    fun currency(minor: Long): String
    fun percent(fraction: Double): String
}

