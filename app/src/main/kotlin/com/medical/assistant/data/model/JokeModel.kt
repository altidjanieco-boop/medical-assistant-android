package com.medical.assistant.data.model

import com.google.gson.annotations.SerializedName

// JokeAPI Response Models
data class JokeResponse(
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("category")
    val category: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("joke")
    val joke: String? = null,
    @SerializedName("setup")
    val setup: String? = null,
    @SerializedName("delivery")
    val delivery: String? = null,
    @SerializedName("flags")
    val flags: JokeFlags? = null,
    @SerializedName("id")
    val id: Int,
    @SerializedName("safe")
    val safe: Boolean
)

data class JokeFlags(
    @SerializedName("nsfw")
    val nsfw: Boolean,
    @SerializedName("religious")
    val religious: Boolean,
    @SerializedName("political")
    val political: Boolean,
    @SerializedName("racist")
    val racist: Boolean,
    @SerializedName("sexist")
    val sexist: Boolean,
    @SerializedName("explicit")
    val explicit: Boolean
)

// UI Model
data class JokeUIModel(
    val id: Int,
    val category: String,
    val type: String,
    val jokeText: String,
    val isSafe: Boolean,
    val timestamp: Long = System.currentTimeMillis()
) {
    val displayText: String
        get() = jokeText
}

// Joke Categories
enum class JokeCategory(val apiValue: String, val displayName: String) {
    GENERAL("general", "عام"),
    KNOCK_KNOCK("knock-knock", "نكتة طرق الباب"),
    PROGRAMMING("programming", "البرمجة"),
    MISCELLANEOUS("miscellaneous", "متنوع");

    companion object {
        fun fromApiValue(value: String): JokeCategory {
            return values().find { it.apiValue == value } ?: GENERAL
        }
    }
}
