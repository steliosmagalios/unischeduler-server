package me.steliosmagalios.prologserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PrologServerApplication

fun main(args: Array<String>) {
    runApplication<PrologServerApplication>(*args)
}
