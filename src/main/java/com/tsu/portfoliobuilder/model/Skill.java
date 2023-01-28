package com.tsu.portfoliobuilder.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "Skills")
public class Skill {
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

    @NotBlank
    @Min(value = 1)
    @Max(value = 100)
    private int percentage;

    // Constructors
    public Skill() {
    }

    public Skill(int id, String title, String description, String urlImg, int percentage) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.urlImg = urlImg;
        this.percentage = percentage;
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

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

}
