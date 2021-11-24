package net.github.koflixbackend.repository

import net.github.koflixbackend.moviemanager.api.model.Movie
import net.github.koflixbackend.moviemanager.spi.MovieProvider

class MovieRepository: MovieProvider {
    override fun getMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    override fun getMovieById(id: Long): Movie {
        TODO("Not yet implemented")
    }
}