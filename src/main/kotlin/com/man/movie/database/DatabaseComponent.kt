package com.man.movie.database

import com.mongodb.client.MongoClient
import org.springframework.stereotype.Component
import org.litote.kmongo.KMongo

@Component
class DatabaseComponent {

    val databaseURL = System.getenv("DATABASE_URL")
    val  database : MongoClient = KMongo.createClient(databaseURL)

}