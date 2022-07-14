package com.masterincoding.repository;

import com.masterincoding.model.Actors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorsRepo extends JpaRepository<Actors, Long> {

    List<Actors> findActorByGender(String first_name);
}
