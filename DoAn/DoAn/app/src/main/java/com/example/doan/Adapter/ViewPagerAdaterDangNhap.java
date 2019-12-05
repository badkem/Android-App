package com.example.doan.Adapter;

import com.example.doan.View.ManHinhChao.DangNhap_DangKy.Fragment.FragmentDangKy;
import com.example.doan.View.ManHinhChao.DangNhap_DangKy.Fragment.FragmentDangNhap;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdaterDangNhap extends FragmentPagerAdapter {

    public ViewPagerAdaterDangNhap(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                FragmentDangNhap fragmentDangNhap = new FragmentDangNhap();
                return fragmentDangNhap;
            case 1 :
                FragmentDangKy fragmentDangKy = new FragmentDangKy();
                return fragmentDangKy;

            default: return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 :
                return "Đăng nhập";
            case 1 :
                return "Đăng ký";

            default: return null;
        }

    }
}
