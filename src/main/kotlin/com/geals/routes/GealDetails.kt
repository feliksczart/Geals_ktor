package com.geals.routes

import com.geals.data.model.Geal
import com.geals.data.model.GealDetails
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://localhost:8080"
private const val BASE_URL_EMULATOR = "http://10.0.2.2:8080"
private const val BASE_URL_DEVICE = "http://192.168.1.101:8080"

private val gealsDetails = listOf(
    GealDetails("Cyb", "Cyberpunk", "A cute brown rabbit", "$BASE_URL_DEVICE/geals/cyberpunk.jpg", "saddadssaddas"),
    GealDetails("Go", "God", "Emma likes to eat apples", "$BASE_URL_DEVICE/geals/god.jpg", "saddadssaddas"),
    GealDetails("Mul", "Multiversus", "Florian is always hungry", "$BASE_URL_DEVICE/geals/multiversus.jpg", "saddadssaddas"),
    GealDetails("Wit", "Witcher", "Federico likes to climb mountains", "$BASE_URL_DEVICE/geals/witcher.jpg", "saddadssaddas"),
    GealDetails("Zom", "Zomboid", "Gina is a true beauty", "$BASE_URL_DEVICE/geals/zomboid.jpg", "saddadssaddas"),
)

fun Route.getGealDetailsById() {

    get("/details/{gealId}") {
        val id = call.parameters["gealId"]
        val gealDetails = gealsDetails.find { it.id == id }
        gealDetails?.let {
            call.respond(
                HttpStatusCode.OK,
                gealDetails
            )
        }
    }
}