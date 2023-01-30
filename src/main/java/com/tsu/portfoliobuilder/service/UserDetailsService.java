package com.tsu.portfoliobuilder.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.tsu.portfoliobuilder.model.UserDetails;
import com.tsu.portfoliobuilder.repository.UserDetailsRepository;

public class UserDetailsService {
    
    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public List<UserDetails> findAllUserDetails() {
        return userDetailsRepository.findAll();
    }

    public Optional<UserDetails> findById(Long id) {
        return userDetailsRepository.findById(id);
    }

    public UserDetails save(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    public void deleteById(Long id) {
        userDetailsRepository.deleteById(id);
    }

}
