package de.highlights.delegation


fun main() {
    val pacMan = PacMan()
    pacMan.move()
}

interface IRectangle {
    val x: Int
    val y: Int
}

data class Rectangle(override val x: Int = 0, override val y: Int = 0) : IRectangle

class PacMan : IRectangle by Rectangle(), IMoveAble by MoveAble()

class GameField : IRectangle by Rectangle()

interface IMoveAble {
    fun move()
    fun add(gameObject: IMoveAble)
}

class MoveAble : IMoveAble {

    private val gameObjects = mutableListOf<IMoveAble>()

    override fun add(gameObject: IMoveAble) {
        gameObjects.add(gameObject)
    }

    override fun move() {
        gameObjects.forEach { it.move() }
    }
}


