package net.github.koflixbackend.commentmanager.api.model

data class Comment(
    var id: Long,
    val movieId: Long,
    val author: String,
)