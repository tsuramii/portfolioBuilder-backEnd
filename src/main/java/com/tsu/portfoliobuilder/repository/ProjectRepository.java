package com.tsu.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tsu.portfoliobuilder.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
