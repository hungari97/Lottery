package hu.lottery.mock

import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class MockCall<T>(val data:T) : Call<T> {
    override fun enqueue(callback: Callback<T>?) {
    }

    @Throws(IOException::class)
    override fun execute(): Response<T> {
        return Response.success(data)
    }

    override fun isExecuted(): Boolean {
        return false
    }

    override fun cancel() {

    }

    override fun isCanceled(): Boolean {
        return false
    }

    override fun clone(): Call<T> {
        return this
    }

    override fun request(): Request {
        TODO("Not yet implemented")
    }
}
