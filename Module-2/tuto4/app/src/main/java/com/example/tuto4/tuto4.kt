package com.example.tuto4

fun determineCategory(age: Int): String {
    return when {
        age < 13 -> "Enfant"
        age in 13..19 -> "Adolescent"
        age in 20..64 -> "Adulte"
        else -> "Sénior"
    }
}

fun printName(name: String?) {
    println(name?.uppercase() ?: "Nom inconnu")
}

class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Je m'appelle $name et j'ai $age ans.")
    }
}

open class Animal(val species: String) {
    open fun sound() {
        println("Cet animal fait un bruit.")
    }
}

class Dog : Animal("Chien") {
    override fun sound() {
        println("Woof woof!")
    }
}

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    val sum = calculate(5, 10) { a, b -> a + b }
    println("Somme : $sum")
}