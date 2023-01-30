package com.tsu.portfoliobuilder.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tsu.portfoliobuilder.model.ApiUser;

@Repository
public interface ApiUserRepository extends JpaRepository<ApiUser, Long> {
    public Optional<ApiUser> findByUsername(String username);

    public boolean existsByUsername(String username);
}
