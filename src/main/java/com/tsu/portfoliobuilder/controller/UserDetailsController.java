package com.tsu.portfoliobuilder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public ResponseEntity<List<UserDetails>> findAllUserDetails() {
        List<UserDetails> userDetails = userDetailsService.findAllUserDetails();
        return ResponseEntity.ok(userDetails);
    }

    @GetMapping("/details/{id}")
    public ResponseEntity<Optional<UserDetails>> findById(@PathVariable Long id) {
        Optional<UserDetails> userDetails = userDetailsService.findById(id);
        if (!userDetails.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userDetails);
    }

    @PostMapping("/create")
    public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userDetails) {
        UserDetails savedUserDetails = userDetailsService.saveUserDetails(userDetails);
        return ResponseEntity.ok(savedUserDetails);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        userDetailsService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UserDetails> updateUserDetails(@PathVariable Long id, @RequestBody UserDetails userDetails) {
        UserDetails updatedUserDetails = userDetailsService.updateUserDetails(id, userDetails);
        if (updatedUserDetails == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedUserDetails);
    }
}