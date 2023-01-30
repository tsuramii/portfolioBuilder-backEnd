package com.tsu.portfoliobuilder.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tsu.portfoliobuilder.model.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {
    Optional<Education> findByTitle(String title);
}
