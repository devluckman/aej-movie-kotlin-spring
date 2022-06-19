package com.man.movie.movies.repository

import com.man.movie.database.DatabaseComponent
import com.man.movie.movies.entity.MovieEntity
import com.mongodb.client.MongoCollection
import org.litote.kmongo.eq
import org.litote.kmongo.findOne
import org.litote.kmongo.getCollection
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class MovieRepositoryImpl : MovieRepository {

    @Autowired
    private lateinit var databaseComponent: DatabaseComponent

    private fun movieCollection(): MongoCollection<MovieEntity> =
            databaseComponent.database.getDatabase("movie").getCollection()

    override fun getMovieById(id: String): MovieEntity? {
        return movieCollection().findOne(MovieEntity::id eq id)
    }

    override fun getMovies(): List<MovieEntity> {
        return movieCollection().find().toList()
    }

    override fun addMovie(movie: MovieEntity): List<MovieEntity> {
        val insert = movieCollection().insertOne(movie)
        return if (insert.wasAcknowledged()){
            getMovies()
        }else throw IllegalArgumentException("Insert failed")
    }
}