package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Post (
    var user: User? = null,
    val likes : Long,
    val postId : Long,
    val caption : String,
    val imgUrl : String,
)