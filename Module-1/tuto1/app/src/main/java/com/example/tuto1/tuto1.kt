package com.example.tuto1


    /*println("Bonjour, Kotlin !")*/

    /*fun main() {
        /*val nom = "Solicode" // Variable immuable
        var age = 5          // Variable mutable

        println("Nom : $nom")
        println("Age : $age")

        age = 6 // Modification possible avec var
        println("Nouvel Age : $age")*/

        /*val entier: Int = 42
        val decimal: Double = 3.14
        val caractere: Char = 'A'
        val chaine: String = "Bonjour"
        val boolean: Boolean = true

        val age = 18

        if (age >= 18) {
            println("Vous êtes majeur.")
        } else {
            println("Vous êtes mineur.")
        }*/

        for (i in 1..5) {
            println("Itération : $i")
        }

        var compteur = 0
        while (compteur < 3) {
            println("Compteur : $compteur")
            compteur++
        }
    }*/


fun addition(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val resultat = addition(4, 5)
    println("Résultat : $resultat")
}





