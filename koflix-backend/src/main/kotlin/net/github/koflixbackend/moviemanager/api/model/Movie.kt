package net.github.koflixbackend.moviemanager.api.model

import java.util.*

data class Movie(
    val id: Int,
    val title: String,
    val originaltitle: String,
    val originalLanguage: String,
    val overview: String,
    val video: Boolean,
    val releaseDate: Date,
    val voteCount: Int,
    val voteAverage: Float,
    val popularity: Float,
    val posterPath: String,
    val backdropPath: String,
    val adult: Boolean,
    val genreIds: List<Int>,
)