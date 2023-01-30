package com.tsu.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tsu.portfoliobuilder.model.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {

}