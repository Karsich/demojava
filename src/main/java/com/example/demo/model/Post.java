package com.example.demo.model;

public class Post {
    private final String text;
    private final Integer likes;

    public Post(String text){
        this.text=text;
        likes = 0;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
