package net.github.koflixbackend.moviemanager.api

import net.github.koflixbackend.moviemanager.api.exception.MovieNotFoundException
import net.github.koflixbackend.moviemanager.api.model.Movie

interface MovieService {

    fun getMovies(params: Map<String, String>): List<Movie>

    @Throws(MovieNotFoundException::class)
    fun getMovieById(id: Long): Movie
}