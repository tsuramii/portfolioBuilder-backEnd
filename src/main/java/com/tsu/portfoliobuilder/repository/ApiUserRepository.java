package com.tsu.portfoliobuilder.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tsu.portfoliobuilder.model.ApiUser;

public interface ApiUserRepository extends JpaRepository<ApiUser, Long> {
    public Optional<ApiUser> findByUsername(String username);

    public boolean existsByUsername(String username);
}
