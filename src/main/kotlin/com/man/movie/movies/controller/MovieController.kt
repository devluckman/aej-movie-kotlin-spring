package com.man.movie.movies.controller

import com.man.movie.base.BaseResponse
import com.man.movie.movies.entity.MovieEntity
import com.man.movie.movies.service.MovieService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/v1/movie")
class MovieController {

    @Autowired
    private lateinit var movieService: MovieService

    @GetMapping
    fun getMovie(): BaseResponse<List<MovieEntity>> =
            BaseResponse(
                    message = "Success",
                    data = movieService.getMovies()
            )

    // Request Body
    @PostMapping
    fun addMovie(
            @RequestBody movie: MovieEntity
    ): BaseResponse<List<MovieEntity>> {
        return BaseResponse(
                message = "Success Add Movie",
                data = movieService.addMovie(movie)
        )
    }

    // Request Path
    @GetMapping("/{id}")
    fun getMovieById(
            @PathVariable(value = "id") movieId: String
    ): BaseResponse<MovieEntity?> {
        return BaseResponse(
                message = "Success",
                data = movieService.getMovieById(movieId)
        )
    }

    @DeleteMapping("/delete/{id}")
    fun deleteMovie(
            @PathVariable(value = "id") movieId: String
    ): BaseResponse<List<MovieEntity>> {
        return BaseResponse(
                message = "Success Delete Movie",
                data = movieService.delete(movieId)
        )
    }

    @PutMapping("/update")
    fun updateMovie(
            @RequestBody movie: MovieEntity
    ): BaseResponse<List<MovieEntity>> {
        return BaseResponse(
                message = "Success Update Movie",
                data = movieService.updateMovie(movie)
        )
    }

}