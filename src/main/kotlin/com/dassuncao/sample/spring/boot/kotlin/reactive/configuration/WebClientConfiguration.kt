package com.dassuncao.sample.spring.boot.kotlin.reactive.configuration

import com.dassuncao.sample.spring.boot.kotlin.reactive.configuration.properties.JsonPlaceHolderClientProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfiguration(private val properties: JsonPlaceHolderClientProperties) {

    @Bean
    @Primary
    fun webClientDefault() =
            WebClient.builder()
                    .baseUrl(properties.uri)
                    .build()
}