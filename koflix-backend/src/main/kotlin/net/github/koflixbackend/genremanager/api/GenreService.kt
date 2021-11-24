package net.github.koflixbackend.genremanager.api

import net.github.koflixbackend.genremanager.api.model.Genre

interface GenreService {

    fun getGenres(): List<Genre>
}