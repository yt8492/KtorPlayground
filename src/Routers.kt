package com.yt8492

import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.post
import io.ktor.routing.route

fun Route.controller() {
    route("foo") {
        post {
            call.respond(HttpStatusCode.OK)
        }
    }
}