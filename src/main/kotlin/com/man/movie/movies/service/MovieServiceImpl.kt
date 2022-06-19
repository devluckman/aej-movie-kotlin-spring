package com.man.movie.movies.service

import com.man.movie.movies.entity.MovieEntity
import com.man.movie.movies.repository.MovieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl : MovieService {

    @Autowired
    private lateinit var repository: MovieRepository

    override fun getMovieById(id: String): MovieEntity? {
        return repository.getMovieById(id)
    }

    override fun getMovies(): List<MovieEntity> {
        return repository.getMovies()
    }

    override fun addMovie(movie: MovieEntity): List<MovieEntity> {
        return repository.addMovie(movie)
    }


}