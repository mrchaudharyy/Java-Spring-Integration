package com.masterincoding.controller;

import com.masterincoding.model.Directors;
import com.masterincoding.model.Movie_Actors;
import com.masterincoding.repository.DirectorsRepo;
import com.masterincoding.repository.MovieActorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieActorsController {

    @Autowired
    private MovieActorsRepo movieActorsRepo;

    @GetMapping("/movieActors")
    public List<Movie_Actors> getAllActors(){
        return movieActorsRepo.findAll();
    }
}
