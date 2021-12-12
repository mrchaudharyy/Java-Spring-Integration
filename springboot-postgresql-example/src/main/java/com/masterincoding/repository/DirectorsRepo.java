package com.masterincoding.repository;

import com.masterincoding.model.Directors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorsRepo extends JpaRepository<Directors, Long> {
}
