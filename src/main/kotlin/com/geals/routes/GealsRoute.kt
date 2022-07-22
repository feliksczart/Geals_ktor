package com.geals.routes

import com.geals.data.model.Geal
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://localhost:8080"
private const val BASE_URL_EMULATOR = "http://10.0.2.2:8080"
private const val BASE_URL_DEVICE = "http://192.168.1.101:8080"

private val geals = listOf(
    Geal("Cyb", "Cyberpunk", "A cute brown rabbit", "$BASE_URL_DEVICE/geals/cyberpunk.jpg"),
    Geal("Go", "God", "Emma likes to eat apples", "$BASE_URL_DEVICE/geals/god.jpg"),
    Geal("Mul", "Multiversus", "Florian is always hungry", "$BASE_URL_DEVICE/geals/multiversus.jpg"),
    Geal("Wit", "Witcher", "Federico likes to climb mountains", "$BASE_URL_DEVICE/geals/witcher.jpg"),
    Geal("Zom", "Zomboid", "Gina is a true beauty", "$BASE_URL_DEVICE/geals/zomboid.jpg"),
)

fun Route.getGeals() {

    get("/geals") {
        call.respond(
            HttpStatusCode.OK,
            geals
        )
    }
}