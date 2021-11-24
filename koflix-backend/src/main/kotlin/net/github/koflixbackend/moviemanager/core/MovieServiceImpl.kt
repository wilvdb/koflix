package net.github.koflixbackend.moviemanager.core

import net.github.koflixbackend.moviemanager.api.MovieService
import net.github.koflixbackend.moviemanager.api.model.Movie
import net.github.koflixbackend.moviemanager.spi.MovieProvider

class MovieServiceImpl(private val movieProvider: MovieProvider): MovieService {

    override fun getMovies(params: Map<String, String>): List<Movie> = movieProvider.getMovies()

    override fun getMovieById(id: Long): Movie = movieProvider.getMovieById(id)
}