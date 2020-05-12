package hu.lottery.network.client.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TokenApi {
    /**
     * ask for a new token
     * We us e a weak and simple method. The client sends the name and the password. If the pair is in the database, the server returned a randomgenerated number. On later requests only the number has tob be sent. On new login every code associated with the username gets deleted.
     * @param name Name of the user
     * @param password Name of the user
     * @return Call<String>
    </String> */
    @GET("token/{name},{password}")
    fun getToken(
        @Path("name") name: String?,
        @Path("password") password: String?
    ): Call<String>
}