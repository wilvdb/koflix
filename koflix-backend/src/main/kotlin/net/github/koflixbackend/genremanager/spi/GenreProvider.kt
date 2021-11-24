package net.github.koflixbackend.genremanager.spi

import net.github.koflixbackend.genremanager.api.model.Genre

interface GenreProvider {

    fun getGenres(): List<Genre>
}