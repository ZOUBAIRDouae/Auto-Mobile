package com.example.vm_retrofit_coroutine

import retrofit2.http.GET

interface ApiService {
    @GET("todos/1")
    suspend fun getTodo(): Todo
}