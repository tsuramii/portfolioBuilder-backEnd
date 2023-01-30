package com.tsu.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tsu.portfoliobuilder.model.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
}
