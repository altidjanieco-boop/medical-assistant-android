package com.medical.assistant.data.api

import com.medical.assistant.data.model.JokeResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface JokeApiService {
    @GET("random")
    suspend fun getRandomJoke(
        @Query("safe-mode") safeMode: Boolean = true
    ): Response<JokeResponse>

    @GET("random")
    suspend fun getRandomJokeByCategory(
        @Query("category") category: String,
        @Query("safe-mode") safeMode: Boolean = true
    ): Response<JokeResponse>

    @GET("categories")
    suspend fun getJokeCategories(): Response<List<String>>
}
