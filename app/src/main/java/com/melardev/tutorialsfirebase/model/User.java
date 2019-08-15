package com.melardev.tutorialsfirebase.model;



public class User {
    public String name;
    public String image;

    public User() {
    }

    public User(String name, String image) {
        this.name = name;
        this.image = image;

    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
