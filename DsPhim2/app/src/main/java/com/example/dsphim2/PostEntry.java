package com.example.dsphim2;

public class PostEntry {
    private int id_dm;
    private int id;
    private  String title;
    private String url_photo;
    private String short_desk;
    private String full_desk;
    private String  url_video;
    private float rating;

    public PostEntry(int id_dm, int id, String title, String url_photo, String short_desk, String full_desk, String url_video, float rating) {
        this.id_dm = id_dm;
        this.id = id;
        this.title = title;
        this.url_photo = url_photo;
        this.short_desk = short_desk;
        this.full_desk = full_desk;
        this.url_video = url_video;
        this.rating = rating;
    }

    public int getId_dm() {
        return id_dm;
    }

    public void setId_dm(int id_dm) {
        this.id_dm = id_dm;
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

    public String getShort_desk() {
        return short_desk;
    }

    public void setShort_desk(String short_desk) {
        this.short_desk = short_desk;
    }

    public String getFull_desk() {
        return full_desk;
    }

    public void setFull_desk(String full_desk) {
        this.full_desk = full_desk;
    }

    public String getUrl_video() {
        return url_video;
    }

    public void setUrl_video(String url_video) {
        this.url_video = url_video;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
