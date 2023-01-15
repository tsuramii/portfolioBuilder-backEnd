package com.tsu.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tsu.portfoliobuilder.model.ApiUser;

@Repository
public interface UserRepository extends JpaRepository<ApiUser, Long> {
    ApiUser findByUsername(String username);
}
