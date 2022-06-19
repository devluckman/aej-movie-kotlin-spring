package com.man.movie.movies.repository

import com.man.movie.movies.entity.MovieEntity

interface MovieRepository {

    fun getMovieById(id : String) : MovieEntity?
    fun getMovies() : List<MovieEntity>
    fun addMovie(movie : MovieEntity): List<MovieEntity>

}