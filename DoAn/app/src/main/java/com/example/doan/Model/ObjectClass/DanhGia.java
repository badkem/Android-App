package com.example.doan.Model.ObjectClass;

public class DanhGia {
    String tennguoidang;
    String tieude;
    String noidung;
    String ngaydang;
    float rating;

    public DanhGia(String tennguoidang, String tieude, String noidung, String ngaydang, float rating) {
        this.tennguoidang = tennguoidang;
        this.tieude = tieude;
        this.noidung = noidung;
        this.ngaydang = ngaydang;
        this.rating = rating;
    }

    public String getTennguoidang() {
        return tennguoidang;
    }

    public void setTennguoidang(String tennguoidang) {
        this.tennguoidang = tennguoidang;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getNgaydang() {
        return ngaydang;
    }

    public void setNgaydang(String ngaydang) {
        this.ngaydang = ngaydang;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
