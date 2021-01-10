package com.example.bitcoinapp;

public class ListItem {
    private String name;
    private String designation;
    private String location, news;
    private int picture;
    private int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getNews() {
        return news;
    }
    public void setNews(String news) {
        this.news = news;
    }
    public int getPicture() {
        return picture;
    }
    public void setPicture(int picture) {
        this.picture = picture;
    }

}

