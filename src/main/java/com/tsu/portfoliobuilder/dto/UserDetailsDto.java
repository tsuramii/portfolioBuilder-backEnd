package com.tsu.portfoliobuilder.dto;

import jakarta.validation.constraints.NotBlank;

public class UserDetailsDto {
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;
    @NotBlank
    private String title;
    @NotBlank
    private String description;
    @NotBlank
    private String profilePhotoUrl;

    // Constructors
    public UserDetailsDto() {
    }

    public UserDetailsDto(@NotBlank String name, @NotBlank String lastName, @NotBlank String title,
            @NotBlank String description, @NotBlank String profilePhotoUrl) {
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
