package net.github.koflixbackend.genremanager.core

import net.github.koflixbackend.genremanager.api.GenreService
import net.github.koflixbackend.genremanager.api.model.Genre
import net.github.koflixbackend.genremanager.spi.GenreProvider

class GenreServiceImpl(private val genreProvider: GenreProvider): GenreService {

    override fun getGenres(): List<Genre> = genreProvider.getGenres()

}