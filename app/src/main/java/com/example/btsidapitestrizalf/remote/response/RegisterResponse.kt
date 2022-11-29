package com.example.btsidapitestrizalf.remote.response

data class RegisterResponse(
    val statusCode: Int,
    val message: String,
    val errorMessage : String,
    val data: String
)


