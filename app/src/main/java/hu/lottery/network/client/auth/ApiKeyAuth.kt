package hu.lottery.network.client.auth

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import java.net.URI
import java.net.URISyntaxException

class ApiKeyAuth(val location: String, val paramName: String) :
    Interceptor {
    var apiKey: String? = null

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val paramValue: String
        var request = chain.request()
        if (location === "query") {
            var newQuery = request.url().uri().query
            paramValue = "$paramName=$apiKey"
            if (newQuery == null) {
                newQuery = paramValue
            } else {
                newQuery += "&$paramValue"
            }
            val newUri: URI
            newUri = try {
                URI(
                    request.url().uri().scheme, request.url().uri().authority,
                    request.url().uri().path, newQuery, request.url().uri().fragment
                )
            } catch (e: URISyntaxException) {
                throw IOException(e)
            }
            request = request.newBuilder().url(newUri.toURL()).build()
        } else if (location === "header") {
            request = request.newBuilder()
                .addHeader(paramName, apiKey)
                .build()
        }
        return chain.proceed(request)
    }

}