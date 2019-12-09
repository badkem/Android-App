package com.example.doan.Model.ObjectClass;

public class Data_NoiBat {
    String name;
    int id_photo;

    public Data_NoiBat(String name, int id_photo) {
        this.name = name;
        this.id_photo = id_photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_photo() {
        return id_photo;
    }

    public void setId_photo(int id_photo) {
        this.id_photo = id_photo;
    }
}
