package com.tsu.portfoliobuilder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsu.portfoliobuilder.model.UserDetails;
import com.tsu.portfoliobuilder.service.UserDetailsService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserDetailsController {
    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping("/")
    public List<UserDetails> findAllUserDetails() {
        return userDetailsService.findAllUserDetails();
    }

    @GetMapping("/details/{id}")
    public Optional<UserDetails> findById(@PathVariable Long id) {
        return userDetailsService.findById(id);
    }

    @PostMapping("/create")
    public UserDetails saveUserDetails(@RequestBody UserDetails userDetails) {
        return userDetailsService.saveUserDetails(userDetails);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        userDetailsService.deleteById(id);
    }

    public UserDetails updateUserDetails(@PathVariable Long id, @RequestBody UserDetails userDetails) {
        return userDetailsService.updateUserDetails(id, userDetails);
    }
}