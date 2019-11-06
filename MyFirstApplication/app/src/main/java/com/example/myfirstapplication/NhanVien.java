package com.example.myfirstapplication;

public class NhanVien {
    private String tenNhanVien;
    private int    tuoiNhanVien;
    protected long luongNhanVien;

    public NhanVien(String tenNhanVien, int tuoiNhanVien, long luongNhanVien) {
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.luongNhanVien = luongNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public long getLuongNhanVien() {
        return luongNhanVien;
    }

    public void setLuongNhanVien(long luongNhanVien) {
        this.luongNhanVien = luongNhanVien;
    }

    @Override
    public String toString() {
        return
                "Họ & Tên: " + tenNhanVien + '\n' +
                "Tuổi: " + tuoiNhanVien + '\n' +
                "Lương: " + luongNhanVien
                ;
    }
}
