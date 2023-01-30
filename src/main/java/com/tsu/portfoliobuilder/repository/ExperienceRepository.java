package com.tsu.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tsu.portfoliobuilder.model.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {

}