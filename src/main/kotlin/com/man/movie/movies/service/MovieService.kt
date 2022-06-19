package com.man.movie.movies.service

import com.man.movie.movies.entity.MovieEntity

interface MovieService {

    fun getMovieById(id : String) : MovieEntity?
    fun getMovies() : List<MovieEntity>
    fun addMovie(movie : MovieEntity): List<MovieEntity>

}