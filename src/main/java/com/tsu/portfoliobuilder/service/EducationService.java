package com.tsu.portfoliobuilder.service;

import com.tsu.portfoliobuilder.model.Education;
import com.tsu.portfoliobuilder.repository.EducationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EducationService {

    @Autowired
    private EducationRepository educationRepository;

    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    public Education saveEducation(Education education) {
        return educationRepository.save(education);
    }

    public List<Education> findAllEducations() {
        return educationRepository.findAll();
    }

    public Education findEducationById(Long id) {
        return educationRepository.findById(id).orElse(null);
    }

    public Optional<Education> findEducationByTitle(String title) {
        return educationRepository.findByTitle(title);
    }

    public void deleteEducation(Long id) {
        educationRepository.deleteById(id);
    }

}