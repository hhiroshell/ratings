package com.bookinfo.rataings;

public class Rating {
    private String reviewer;
    private int stars;

    public Rating(String reviewer, int stars) {
        this.reviewer = reviewer;
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public String getReviewer() {
        return reviewer;
    }
}