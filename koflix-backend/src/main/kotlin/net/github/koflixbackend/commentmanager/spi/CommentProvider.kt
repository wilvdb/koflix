package net.github.koflixbackend.commentmanager.spi

import net.github.koflixbackend.commentmanager.api.model.Comment

interface CommentProvider {

    fun getCommentsByMovie(id: Long): List<Comment>
}