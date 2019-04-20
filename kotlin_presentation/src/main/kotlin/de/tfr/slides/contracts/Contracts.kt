package de.tfr.slides.contracts

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

open class Animal(var isAlive: Boolean)

class Unicorn : Animal(true){
    fun doMagicPoop() = print("🌈✨")
}

@ExperimentalContracts
fun Animal.isMagical() : Boolean{
    contract {
        returns(true) implies (this@isMagical is Unicorn)
    }
    return this is Unicorn && isAlive
}

@ExperimentalContracts
fun main() {
    val babyUnicorn : Animal = Unicorn()
    if (babyUnicorn.isMagical()) {
        babyUnicorn.doMagicPoop()
    }
}