package com.dassuncao.sample.spring.boot.kotlin.reactive.scenario

import com.dassuncao.sample.spring.boot.kotlin.reactive.AbstractTest
import com.dassuncao.sample.spring.boot.kotlin.reactive.stub.JsonPlaceHolderStub
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class JsonPlaceHolderTest : AbstractTest() {

    @Autowired
    private lateinit var jsonPlaceHolderStub: JsonPlaceHolderStub

    @Test
    fun `test get request`() {

        // Arrange
        jsonPlaceHolderStub.getJsonPlaceHolderSuccess()

        // Act
        webTestClient.get()
                .uri("/get")
                .exchange()
                .expectStatus()
                .isOk
                .expectBody()
                .jsonPath("$.id").isNumber
                .jsonPath("$.userId").isNumber
                .jsonPath("$.title").isNotEmpty
                .jsonPath("$.completed").isBoolean
    }
}
