package com.geals.plugins

import com.geals.routes.getGealDetailsById
import com.geals.routes.getGeals
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        getGeals()
        getGealDetailsById()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
