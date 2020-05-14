package com.myapplicationdev.android.p04_revisionnotes;

public class Note {
    private int ID;
    private String notContent;
    private int stars;

    public Note(int ID, String notContent, int stars) {
        this.ID = ID;
        this.notContent = notContent;
        this.stars = stars;
    }

    public int getID() {
        return ID;
    }

    public String getNotContent() {
        return notContent;
    }

    public int getStars() {
        return stars;
    }
}
