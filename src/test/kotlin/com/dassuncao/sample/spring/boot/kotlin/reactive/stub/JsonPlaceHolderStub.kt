package com.dassuncao.sample.spring.boot.kotlin.reactive.stub

import com.github.tomakehurst.wiremock.client.WireMock.*
import org.json.JSONObject
import org.springframework.stereotype.Component
import java.util.*

@Component
class JsonPlaceHolderStub {

    fun getJsonPlaceHolderSuccess() {
        stubFor(get(urlEqualTo("/json-place-holder/todos/1"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody(getJson())))
    }

    private fun getJson() = JSONObject()
            .put("id", System.currentTimeMillis())
            .put("userId", System.currentTimeMillis())
            .put("title", UUID.randomUUID().toString().toUpperCase())
            .put("completed", true)
            .toString()
}