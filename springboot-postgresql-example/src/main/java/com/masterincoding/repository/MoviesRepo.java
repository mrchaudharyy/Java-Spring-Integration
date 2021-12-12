package com.masterincoding.repository;

import com.masterincoding.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepo extends JpaRepository<Movies, Long> {
}
