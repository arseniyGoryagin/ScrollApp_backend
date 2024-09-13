package com.example

import com.example.plugins.*
import io.github.cdimascio.dotenv.dotenv
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*

fun main(args: Array<String>) {

    val dotenv = dotenv()

    val port : Int =dotenv["PORT"]?.toIntOrNull() ?: 8080

    embeddedServer(Netty,host = "0.0.0.0",  port = port, module = Application::module).start(wait = true)
}


fun Application.module() {

    install(ContentNegotiation){
        json()
    }

    configureHTTP()
    configureRouting()
}
