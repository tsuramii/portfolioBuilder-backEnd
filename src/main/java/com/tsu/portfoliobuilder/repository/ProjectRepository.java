package com.tsu.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tsu.portfoliobuilder.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
