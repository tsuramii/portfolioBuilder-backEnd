package com.tsu.portfoliobuilder.model;

import jakarta.persistence.Entity;

@Entity
public class UserDetails {
    private String name;
    private String lastName;
    private String title;
    private String description;
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
