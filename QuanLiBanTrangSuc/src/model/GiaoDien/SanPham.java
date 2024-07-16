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
    private int TrangThai ;
    private int GioiTinh ;
    private int GiamGia ;
    private String sanPham;

    public SanPham() {
    }

    public SanPham(int TrangThai, int GioiTinh, int GiamGia, String sanPham) {
        this.TrangThai = TrangThai;
        this.GioiTinh = GioiTinh;
        this.GiamGia = GiamGia;
        this.sanPham = sanPham;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(int GiamGia) {
        this.GiamGia = GiamGia;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

   
    
}
