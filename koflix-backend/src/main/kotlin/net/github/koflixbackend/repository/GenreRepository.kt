package net.github.koflixbackend.repository

import net.github.koflixbackend.genremanager.api.model.Genre
import net.github.koflixbackend.genremanager.spi.GenreProvider

class GenreRepository: GenreProvider {
    override fun getGenres(): List<Genre> {
        TODO("Not yet implemented")
    }
}