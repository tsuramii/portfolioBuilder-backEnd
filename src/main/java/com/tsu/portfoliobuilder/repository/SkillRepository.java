package com.tsu.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tsu.portfoliobuilder.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
