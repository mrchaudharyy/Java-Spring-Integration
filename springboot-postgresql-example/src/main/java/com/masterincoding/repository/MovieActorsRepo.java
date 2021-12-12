package com.masterincoding.repository;

import com.masterincoding.model.Movie_Actors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieActorsRepo extends JpaRepository<Movie_Actors, Long> {
}
