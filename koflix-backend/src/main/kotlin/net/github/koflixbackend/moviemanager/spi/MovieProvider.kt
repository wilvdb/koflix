package net.github.koflixbackend.moviemanager.spi

import net.github.koflixbackend.moviemanager.api.exception.MovieNotFoundException
import net.github.koflixbackend.moviemanager.api.model.Movie

interface MovieProvider {

    fun getMovies(): List<Movie>

    @Throws(MovieNotFoundException::class)
    fun getMovieById(id: Long): Movie
}