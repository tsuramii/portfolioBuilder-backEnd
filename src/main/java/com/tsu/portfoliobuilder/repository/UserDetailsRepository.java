package com.tsu.portfoliobuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tsu.portfoliobuilder.model.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>{
    
}
