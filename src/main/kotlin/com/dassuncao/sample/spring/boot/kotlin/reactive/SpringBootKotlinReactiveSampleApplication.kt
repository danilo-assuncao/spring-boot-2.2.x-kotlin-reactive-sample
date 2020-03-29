package com.dassuncao.sample.spring.boot.kotlin.reactive

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan("com.dassuncao.sample.spring.boot.kotlin.reactive.configuration.properties")
class SpringBootKotlinReactiveSampleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinReactiveSampleApplication>(*args)
}
