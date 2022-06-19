package com.man.movie.movies.entity

import java.util.*

data class MovieEntity(
        var id: String = UUID.randomUUID().toString(),
        var name: String = ""
)