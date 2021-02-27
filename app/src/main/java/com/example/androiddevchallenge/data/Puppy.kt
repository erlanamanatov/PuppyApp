package com.example.androiddevchallenge.data

data class Puppy(
    val id : Int,
    val name: String,
    val breed: String,
    val color: String? = null,
    val age: String? = null,
    val size: String? = null,
    val sex: Sex,
    val description: String? = null,
    val location: String? = null,
    val characteristics: String? = null,
    val health: String? = null,
    val image: Int
)

enum class Sex {
    MALE, FEMALE
}
