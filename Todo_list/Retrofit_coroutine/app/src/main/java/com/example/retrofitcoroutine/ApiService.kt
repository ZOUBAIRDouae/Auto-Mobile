package com.example.retrofitcoroutine

import retrofit2.http.GET

interface ApiService {
    @GET("todos/1")
    suspend fun getTodo(): Todo  // ✅ Fonction suspendue
}