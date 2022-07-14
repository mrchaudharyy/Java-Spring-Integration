package com.masterincoding.controller;

import com.masterincoding.exceptions.NotFoundException;
import com.masterincoding.model.Actors;
import com.masterincoding.repository.ActorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ActorsController {

    @Autowired
    private ActorsRepo actorsRepo;

    @GetMapping("/actors")
    public List<Actors> getAllActors(){
        return actorsRepo.findAll();
    }

    @GetMapping("actors/{id}")
    public ResponseEntity<Actors> getActorById(@PathVariable(value = "id") Long id) throws NotFoundException {
        Actors response = actorsRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Actor Not Found"));

        return ResponseEntity.ok().body(response);
    }

    @GetMapping("actors/gender/{gender}")
    public List<Actors> getActorByGender(@PathVariable(value = "gender") String gender) throws NotFoundException {
        List<Actors> response = actorsRepo.findActorByGender(gender);
                //.orElseThrow(() -> new NotFoundException("Actor Not Found"));

        return response;
    }
}
