package com.geals

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.geals.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureMonitoring()
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}
