package com.example.services.PostService

import com.example.model.Post

import java.net.http.HttpHeaders


val captions = listOf(
    "Pushing boundaries and redefining possibilities every single day.",
    "Embarking on a journey where every step is a leap towards greatness.",
    "Turning dreams into plans and plans into reality, one day at a time.",
    "Celebrating the moments that make life extraordinary and unforgettable.",
    "Chasing goals and embracing challenges with unyielding determination.",
    "Crafting a story where every chapter is filled with adventure and success.",
    "Harnessing the power of ambition to create a life without limits.",
    "Transforming ordinary days into extraordinary achievements.",
    "Living each day with purpose, passion, and an unwavering drive for excellence.",
    "Reaching for the stars and creating my own constellation of success.",
    "Turning obstacles into opportunities and setbacks into comebacks.",
    "Building a future where dreams are realized and limits are surpassed.",
    "Creating a legacy through every challenge overcome and milestone achieved.",
    "Redefining what’s possible with every new adventure and discovery.",
    "Striving for greatness in everything I do and inspiring others to do the same.",
    "Turning vision into reality with relentless focus and dedication.",
    "Crafting a life of purpose and passion that inspires others to follow.",
    "Embracing the journey with courage, conviction, and a commitment to excellence.",
    "Navigating through life’s challenges with resilience and an eye on the future.",
    "Writing my own success story with every bold decision and daring move.",
    "Transforming aspirations into achievements with unwavering determination.",
    "Living life with a fearless heart and a mind focused on limitless possibilities.",
    "Building a legacy of greatness through perseverance and hard work.",
    "Taking bold steps towards a future filled with boundless opportunities.",
    "Creating a path of success with every innovative idea and daring venture.",
    "Turning dreams into milestones and milestones into lifelong success.",
    "Embracing every moment with the belief that greatness lies ahead.",
    "Navigating the unknown with confidence and a passion for discovery.",
    "Pushing the limits of what’s possible and charting a course for greatness.",
    "Living a life where every challenge is met with determination and courage.",
    "Creating a future where aspirations turn into accomplishments and goals are exceeded."
)



class PostServiceImpl() : PostService {


    override fun generatePost(): Post {

        val likes  : Long = (100..10000).random().toLong()
        val caption : String = captions.random()
        val postId : Long = (1..1000).random().toLong()

        val imgUrl  = "https://loremflickr.com/720/1080?random=${(1..Int.MAX_VALUE).random()}"


        return Post(
            likes = likes,
            caption = caption,
            postId = postId,
            imgUrl = imgUrl
        )


    }





}