package com.tsu.portfoliobuilder.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tsu.portfoliobuilder.model.UserDetails;
import com.tsu.portfoliobuilder.repository.UserDetailsRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public List<UserDetails> findAllUserDetails() {
        return userDetailsRepository.findAll();
    }

    public Optional<UserDetails> findById(Long id) {
        return userDetailsRepository.findById(id);
    }

    public UserDetails saveUserDetails(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    public void deleteById(Long id) {
        userDetailsRepository.deleteById(id);
    }

    public Boolean existsUserDetails(Long id) {
        try {
            userDetailsRepository.findById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public UserDetails updateUserDetails(Long id, UserDetails updatedUserDetails) {
        Optional<UserDetails> userDetails = findById(id);
        if (userDetails.isPresent()) {
            UserDetails user = userDetails.get();
            user.setName(updatedUserDetails.getName());
            user.setLastName(updatedUserDetails.getLastName());
            user.setTitle(updatedUserDetails.getTitle());
            user.setDescription(updatedUserDetails.getDescription());
            user.setProfilePhotoUrl(updatedUserDetails.getProfilePhotoUrl());
            return userDetailsRepository.save(user);
        }
        return null;
    }
}