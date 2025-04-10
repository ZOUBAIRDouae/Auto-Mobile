package com.example.afficher_taches


import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("todos")
    suspend fun getTask(): List<Todo>  // Using the corrected data class Todo
}
