package net.github.koflixbackend.commentmanager.api

import net.github.koflixbackend.commentmanager.api.model.Comment

interface CommentService {

    fun getCommentsByMovie(id: Long): List<Comment>
}