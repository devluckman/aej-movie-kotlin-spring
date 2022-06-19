package com.man.movie.database

import com.mongodb.client.MongoClient
import org.springframework.stereotype.Component
import org.litote.kmongo.KMongo

@Component
class DatabaseComponent {

    companion object {
        private const val DB_URL = "mongodb+srv://aej:myhvtwq21m@cluster0.dugg7.mongodb.net/?retryWrites=true&w=majority"
    }

    val  database : MongoClient = KMongo.createClient(DB_URL)

}