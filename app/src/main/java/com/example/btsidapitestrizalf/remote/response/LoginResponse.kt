package com.example.pokeapirizalf_panintitechtest.data.source.remote.response

import com.example.btsidapitestrizalf.remote.response.Token


data class LoginResponse (
    val statusCode :Int,
    val message : String,
    val errorMessage : String,
    val data : Token
)