package com.example.photoapp;

public class Photo {
    private int id;
    private int rate_photo;
    private int score_photo;
    private int downloaded_photo;
    private String source_photo;
    private String caption_photo;
    private Boolean limit;

    public Photo(int id, int rate_photo, int score_photo, int downloaded_photo, String source_photo, String caption_photo, Boolean limit) {
        this.id = id;
        this.rate_photo = rate_photo;
        this.score_photo = score_photo;
        this.downloaded_photo = downloaded_photo;
        this.source_photo = source_photo;
        this.caption_photo = caption_photo;
        this.limit = limit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate_photo() {
        return rate_photo;
    }

    public void setRate_photo(int rate_photo) {
        this.rate_photo = rate_photo;
    }

    public int getScore_photo() {
        return score_photo;
    }

    public void setScore_photo(int score_photo) {
        this.score_photo = score_photo;
    }

    public int getDownloaded_photo() {
        return downloaded_photo;
    }

    public void setDownloaded_photo(int downloaded_photo) {
        this.downloaded_photo = downloaded_photo;
    }

    public String getSource_photo() {
        return source_photo;
    }

    public void setSource_photo(String source_photo) {
        this.source_photo = source_photo;
    }

    public String getCaption_photo() {
        return caption_photo;
    }

    public void setCaption_photo(String caption_photo) {
        this.caption_photo = caption_photo;
    }

    public boolean getLimit() {
        return limit;
    }

    public void setLimit(Boolean limit) {
        this.limit = limit;
    }
}

