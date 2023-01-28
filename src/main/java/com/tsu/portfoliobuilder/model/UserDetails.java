package com.tsu.portfoliobuilder.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class UserDetails {
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

    public UserDetails(String name, String lastName, String title, String description, String profilePhotoUrl) {
        this.name = name;
        this.lastName = lastName;
        this.title = title;
        this.description = description;
        this.profilePhotoUrl = profilePhotoUrl;
    }

    // Getter and Setters
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
