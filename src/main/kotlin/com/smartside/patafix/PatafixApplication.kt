package com.smartside.patafix

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PatafixApplication

fun main(args: Array<String>) {
    runApplication<PatafixApplication>(*args)
}
