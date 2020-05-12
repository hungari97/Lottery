package hu.lottery.mock

import hu.lottery.network.client.api.TokenApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class MockTokenApi : TokenApi {
    override fun getToken(name: String?, password: String?): Call<String> {
        val temp: String
        if (name.equals("user") && (password.equals("user")))
            temp = "pass"
        else
            temp = "nope"

        val call = object : Call<String> {
            override fun enqueue(callback: Callback<String>?) {
            }

            @Throws(IOException::class)
            override fun execute(): Response<String> {
                return Response.success(temp)
            }

            override fun isExecuted(): Boolean {
                return false
            }

            override fun cancel() {

            }

            override fun isCanceled(): Boolean {
                return false
            }

            override fun clone(): Call<String> {
                return this
            }

        }

        return call
    }
}