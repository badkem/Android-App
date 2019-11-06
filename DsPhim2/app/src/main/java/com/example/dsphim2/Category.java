package com.example.dsphim2;

public class Category {
    private int id_dm;
    private String ten_dm;
    private String url_photo;

    public Category(int id_dm, String ten_dm, String url_photo) {
        this.id_dm = id_dm;
        this.ten_dm = ten_dm;
        this.url_photo = url_photo;
    }

    public int getId_dm() {
        return id_dm;
    }

    public void setId_dm(int id_dm) {
        this.id_dm = id_dm;
    }

    public String getTen_dm() {
        return ten_dm;
    }

    public void setTen_dm(String ten_dm) {
        this.ten_dm = ten_dm;
    }

    public String getUrl_photo() {
        return url_photo;
    }

    public void setUrl_photo(String url_photo) {
        this.url_photo = url_photo;
    }
}
