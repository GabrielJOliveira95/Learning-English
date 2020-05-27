package com.cursoandroid.oliveiragabriel.learningenglish.model;

public class Pharases {

    private String txt_ing;
    private String txt_pt;
    private String txt_pronunciation;


    private int audio;

    public Pharases(String txt_ing, String txt_pronunciation, String txt_pt, int audio) {
        this.txt_ing = txt_ing;
        this.txt_pronunciation = txt_pronunciation;
        this.txt_pt = txt_pt;
        this.audio = audio;

    }

    public String getTxt_ing() {
        return txt_ing;
    }

    public void setTxt_ing(String txt_ing) {
        this.txt_ing = txt_ing;
    }

    public String getTxt_pt() {
        return txt_pt;
    }

    public void setTxt_pt(String txt_pt) {
        this.txt_pt = txt_pt;
    }

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }


    public String getTxt_pronunciation() {
        return txt_pronunciation;
    }

    public void setTxt_pronunciation(String txt_pronunciation) {
        this.txt_pronunciation = txt_pronunciation;
    }
}
