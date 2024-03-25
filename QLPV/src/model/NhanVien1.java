/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class NhanVien1 {
     private String SDT;
    private String tenNhanVien;
    private String tenDangNhap;

    public NhanVien1() {
    }

    public NhanVien1(String SDT, String tenNhanVien, String tenDangNhap) {
        this.SDT = SDT;
        this.tenNhanVien = tenNhanVien;
        this.tenDangNhap = tenDangNhap;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }
}
