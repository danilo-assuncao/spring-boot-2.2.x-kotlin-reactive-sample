package com.dassuncao.sample.spring.boot.kotlin.reactive.controller.dto

data class GetSampleControllerResponseDTO(

        val id: Long,

        val userId: Long,

        val title: String,

        val completed: Boolean
)