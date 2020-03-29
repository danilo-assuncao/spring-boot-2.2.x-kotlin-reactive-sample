package com.dassuncao.sample.spring.boot.kotlin.reactive.controller.client

import com.dassuncao.sample.spring.boot.kotlin.reactive.controller.dto.GetSampleControllerResponseDTO
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Component
class JsonPlaceHolderClient(private val webClient: WebClient) {

    fun getJsonPlaceHolder() =
            webClient.get()
                    .uri("/todos/1")
                    .retrieve()
                    .bodyToMono(GetSampleControllerResponseDTO::class.java)
}