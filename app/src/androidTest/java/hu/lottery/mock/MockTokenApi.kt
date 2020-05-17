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

        val call = MockCall<String>(temp)

        return call
    }
}