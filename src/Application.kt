package com.yt8492

import io.ktor.application.*
import io.ktor.features.ContentNegotiation
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.routing
import io.ktor.serialization.serialization
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    val server = embeddedServer(Netty, 8080) {
        install(ContentNegotiation) {
            serialization()
        }
        routing {
            controller()
        }
    }
    server.start(true)
}