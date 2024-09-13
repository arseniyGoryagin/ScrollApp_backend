package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Comment (
    val text : String,
    var user : User? = null
)