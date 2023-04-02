package com.example.linkybproject.auth

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginRetrofitInterface {
    @POST("/auth/login")
    fun login(
        @Body loginRequest: LoginRequest
    ): Call<LoginResponse>
}