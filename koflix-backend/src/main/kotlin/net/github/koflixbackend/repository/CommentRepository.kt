package net.github.koflixbackend.repository

import net.github.koflixbackend.commentmanager.api.model.Comment
import net.github.koflixbackend.commentmanager.spi.CommentProvider

class CommentRepository: CommentProvider {
    override fun getCommentsByMovie(id: Long): List<Comment> {
        TODO("Not yet implemented")
    }
}