package edu.darkcat.dprincess

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class DprincessApplication

fun main(args: Array<String>) {
    runApplication<DprincessApplication>(*args)
}
