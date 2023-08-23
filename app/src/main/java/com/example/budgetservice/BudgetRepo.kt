package com.example.budgetservice

import java.math.BigDecimal
import java.time.Year

interface BudgetRepo {
    fun getAll(): List<Budget>
}

data class Budget(val yearMonth: String, val amount: BigDecimal)
