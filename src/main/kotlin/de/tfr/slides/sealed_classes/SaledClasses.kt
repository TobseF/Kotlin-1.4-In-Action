package de.tfr.slides.sealed_classes

sealed class CalculatorAction

class Add(val subtrahend: Int) : CalculatorAction()
class Sub(val minuend: Int) : CalculatorAction()
class Div(val divisor: Int) : CalculatorAction()

fun calculate(value: Int, action: CalculatorAction): Int {
    return when (action) {
        is Add -> value + action.subtrahend
        is Sub -> value + action.minuend
        is Div -> value + action.divisor
    }
}

fun main() {
    println(calculate(41, Add(1)))
}