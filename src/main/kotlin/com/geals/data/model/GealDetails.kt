package com.geals.data.model

import kotlinx.serialization.Serializable

@Serializable
data class GealDetails(
    val id: String,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: String
)