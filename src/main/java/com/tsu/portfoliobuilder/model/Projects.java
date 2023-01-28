package com.tsu.portfoliobuilder.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(max = 50)
    private String title;

    @NotBlank
    @Size(max = 600)
    private String description;

    @NotBlank
    private String urlImg;

    // Constructors
    public Projects() {
    }

    public Projects(int id, String title, String description, String urlImg) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.urlImg = urlImg;
    }

    // Getter and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

}
