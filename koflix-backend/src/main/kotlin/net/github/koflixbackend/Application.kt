package net.github.koflixbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KoflixBackendApplication

fun main(args: Array<String>) {
    runApplication<KoflixBackendApplication>(*args) {
        addInitializers()
    }
}
