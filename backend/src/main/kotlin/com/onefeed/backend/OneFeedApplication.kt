package com.onefeed.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OnefeedApplication

fun main(args: Array<String>) {
    runApplication<OnefeedApplication>(*args)
}