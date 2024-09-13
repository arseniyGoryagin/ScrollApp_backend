package com.example.model

import kotlinx.serialization.Serializable


@Serializable
data class User(
    val username : String,
    val name : String,
    val userId : Long

)