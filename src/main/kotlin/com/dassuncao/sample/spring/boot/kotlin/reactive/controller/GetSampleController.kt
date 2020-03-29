package com.dassuncao.sample.spring.boot.kotlin.reactive.controller

import com.dassuncao.sample.spring.boot.kotlin.reactive.controller.client.JsonPlaceHolderClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/get")
class GetSampleController(private val client: JsonPlaceHolderClient) {

    @GetMapping
    fun getPlaceHolder() = client.getJsonPlaceHolder()
}