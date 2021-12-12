package com.masterincoding.controller;

import com.masterincoding.model.Actors;
import com.masterincoding.repository.ActorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ActorsController {

    @Autowired
    private ActorsRepo actorsRepo;

    @GetMapping("/actors")
    public List<Actors> getAllActors(){
        return actorsRepo.findAll();
    }
}
