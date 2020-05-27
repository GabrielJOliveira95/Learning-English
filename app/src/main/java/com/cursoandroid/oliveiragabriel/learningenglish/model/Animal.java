package com.cursoandroid.oliveiragabriel.learningenglish.model;

public class Animal {

    private String name;
    private int image;
    private int song;



    public Animal(String name, int image, int song) {
        this.name = name;
        this.image = image;
        this.song = song;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
