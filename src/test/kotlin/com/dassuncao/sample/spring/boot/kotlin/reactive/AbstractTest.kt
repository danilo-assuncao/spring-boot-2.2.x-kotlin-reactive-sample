package com.dassuncao.sample.spring.boot.kotlin.reactive

import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock
import org.springframework.context.annotation.Profile
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest
@Profile("test")
@AutoConfigureWebTestClient
@AutoConfigureWireMock(port = 0)
@ExtendWith(SpringExtension::class)
abstract class AbstractTest {

    @Autowired
    lateinit var webTestClient: WebTestClient
}