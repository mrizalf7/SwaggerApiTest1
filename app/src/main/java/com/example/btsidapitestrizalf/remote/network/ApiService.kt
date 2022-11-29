package com.example.btsidapitestrizalf.remote.network

import com.example.btsidapitestrizalf.remote.response.RegisterResponse
import com.example.btsidapitestrizalf.utils.Constants.LOGIN
import com.example.btsidapitestrizalf.utils.Constants.REGISTER
import com.example.pokeapirizalf_panintitechtest.data.source.remote.response.LoginResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET(REGISTER)
    suspend fun register(
        @Query("username") username : String,
        @Query("password") password : String,
        @Query("email") email : String
    ) : RegisterResponse

    @GET(LOGIN)
    suspend fun login(
        @Query("username") username : String,
        @Query("password") password : String,
    ) : LoginResponse



}