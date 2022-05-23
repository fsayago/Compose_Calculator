package com.example.composecalculator

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Substract: CalculatorOperation("-")
    object Multuply: CalculatorOperation("*")
    object Divide: CalculatorOperation("/")
}
