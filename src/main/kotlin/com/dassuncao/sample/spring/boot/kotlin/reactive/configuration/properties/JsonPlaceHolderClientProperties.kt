package com.dassuncao.sample.spring.boot.kotlin.reactive.configuration.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("sample.client.json-place-holder")
data class JsonPlaceHolderClientProperties(val uri: String)