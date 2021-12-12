package com.masterincoding.controller;

import com.masterincoding.model.Movie_Revenues;
import com.masterincoding.model.Movies;
import com.masterincoding.repository.MovieRevenuesRepo;
import com.masterincoding.repository.MoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MoviesController {

    @Autowired
    private MoviesRepo moviesRepo;

    @GetMapping("/movies")
    public List<Movies> getAllMovies(){
        return moviesRepo.findAll();
    }
}
