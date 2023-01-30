package com.tsu.portfoliobuilder.service;

import com.tsu.portfoliobuilder.model.ApiUser;
import com.tsu.portfoliobuilder.repository.ApiUserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ApiUserService {

    @Autowired
    private ApiUserRepository apiUserRepository;

    public ApiUser saveUser(ApiUser apiUser) {
        return apiUserRepository.save(apiUser);
    }

    public List<ApiUser> findAllUsers() {
        return apiUserRepository.findAll();
    }

    public ApiUser findUserById(Long id) {
        return apiUserRepository.findById(id).orElse(null);
    }

    public Optional<ApiUser> findUserByUsername(String username) {
        return apiUserRepository.findByUsername(username);
    }

    public void deleteUser(Long id) {
        apiUserRepository.deleteById(id);
    }

}