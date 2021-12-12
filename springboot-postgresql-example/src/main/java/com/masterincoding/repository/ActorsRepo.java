package com.masterincoding.repository;

import com.masterincoding.model.Actors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorsRepo extends JpaRepository<Actors, Long> {
}
