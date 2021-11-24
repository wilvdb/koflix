package net.github.koflixbackend.commentmanager.core

import net.github.koflixbackend.commentmanager.api.CommentService
import net.github.koflixbackend.commentmanager.api.model.Comment
import net.github.koflixbackend.commentmanager.spi.CommentProvider

class CommentServiceImpl(private val commentProvider: CommentProvider): CommentService {

    override fun getCommentsByMovie(id: Long): List<Comment> = commentProvider.getCommentsByMovie(id)
}