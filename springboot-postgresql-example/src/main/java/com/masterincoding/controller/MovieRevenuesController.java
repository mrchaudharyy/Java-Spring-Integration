package com.masterincoding.controller;

import com.masterincoding.model.Movie_Revenues;
import com.masterincoding.repository.MovieRevenuesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieRevenuesController {

    @Autowired
    private MovieRevenuesRepo movieRevenuesRepo;

    @GetMapping("movieRevenues")
    public List<Movie_Revenues> getAllMovieRevenues(){
        return movieRevenuesRepo.findAll();
    }
}
