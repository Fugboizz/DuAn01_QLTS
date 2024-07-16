/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.GiaoDien;

import model.GiamGia;

/**
 *
 * @author WINDOWS10
 */
public class SanPham {
    private boolean TrangThai ;
    private boolean GioiTinh ;
    private boolean GiamGia ;
    private String sanPham;

    public SanPham() {
    }

    public SanPham(boolean TrangThai, boolean GioiTinh, boolean GiamGia, String sanPham) {
        this.TrangThai = TrangThai;
        this.GioiTinh = GioiTinh;
        this.GiamGia = GiamGia;
        this.sanPham = sanPham;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public boolean isGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(boolean GiamGia) {
        this.GiamGia = GiamGia;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    
    
}
