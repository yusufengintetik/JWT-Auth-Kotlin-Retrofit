package com.yuente.rest_api_auth_retrofit.models

import com.google.gson.annotations.SerializedName

data class LoginResponse(

    @SerializedName("authToken")
    var authToken: String,

)
