package com.tsu.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tsu.portfoliobuilder.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
}
