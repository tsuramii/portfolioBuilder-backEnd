package com.tsu.portfoliobuilder.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "UserDetails")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 20)
    private String name;

    @NotBlank
    @Size(min = 2, max = 20)
    private String lastName;

    @Size(max = 50)
    private String title;

    @NotBlank
    @Size(max = 600)
    private String description;

    @NotBlank
    private String profilePhotoUrl;

    // Constructors
    public UserDetails() {
    }

    public UserDetails(Long id, @NotBlank @Size(min = 2, max = 20) String name,
            @NotBlank @Size(min = 2, max = 20) String lastName, @Size(max = 50) String title,
            @NotBlank @Size(max = 600) String description, @NotBlank String profilePhotoUrl) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.title = title;
        this.description = description;
        this.profilePhotoUrl = profilePhotoUrl;
    }

    // Getter and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

}
