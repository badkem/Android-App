package com.example.doan;

public class PostEntry {
    private int id;
    private String title;
    private String url_photo;
    private String url_video;
    private String short_desc;
    private String full_desc;
    private float rating;

    public PostEntry(int id, String title, String url_photo, String url_video, String short_desc, String full_desc, float rating) {
        this.id = id;
        this.title = title;
        this.url_photo = url_photo;
        this.url_video = url_video;
        this.short_desc = short_desc;
        this.full_desc = full_desc;
        this.rating = rating;
    }

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

    public String getUrl_photo() {
        return url_photo;
    }

    public void setUrl_photo(String url_photo) {
        this.url_photo = url_photo;
    }

    public String getUrl_video() {
        return url_video;
    }

    public void setUrl_video(String url_video) {
        this.url_video = url_video;
    }

    public String getShort_desc() {
        return short_desc;
    }

    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc;
    }

    public String getFull_desc() {
        return full_desc;
    }

    public void setFull_desc(String full_desc) {
        this.full_desc = full_desc;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

}
