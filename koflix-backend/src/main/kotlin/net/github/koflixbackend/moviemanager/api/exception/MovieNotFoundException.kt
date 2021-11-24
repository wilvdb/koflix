package net.github.koflixbackend.moviemanager.api.exception

import java.lang.RuntimeException

class MovieNotFoundException(message: String) : RuntimeException(message) {

}