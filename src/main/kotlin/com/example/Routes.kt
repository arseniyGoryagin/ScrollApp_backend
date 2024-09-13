package com.example

import com.example.CommentsService.CommentsServiceImpl
import com.example.CommentsService.CommentsService
import com.example.services.PostService.PostService
import com.example.services.PostService.PostServiceImpl
import com.example.services.UserService.UserService
import com.example.services.UserService.UserServiceImpl
import com.example.model.Comment
import com.example.model.Post
import com.example.model.User
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Routing.posts(userService: UserService = UserServiceImpl(), postService: PostService = PostServiceImpl(), commentsService: CommentsService = CommentsServiceImpl()){



    get("posts") {

        val count = call.queryParameters["limit"]?.toIntOrNull() ?: 10

        // generate posts

        val posts : MutableList<Post> = mutableListOf()


        repeat(count){
            val user = userService.generateUser()
            val post = postService.generatePost().apply {
                this.user = user
            }
            posts.add(post)
        }

        call.respond(posts)
    }


    get("comments") {

        val count = call.queryParameters["limit"]?.toIntOrNull() ?: 10


        val comments : MutableList<Comment> = mutableListOf()


        repeat(count){

            val user : User = userService.generateUser()

            val comment : Comment = commentsService.generateComment().apply {
                this.user = user
            }
            comments.add(comment)
        }

        println(comments)

        call.respond(comments)
    }


}