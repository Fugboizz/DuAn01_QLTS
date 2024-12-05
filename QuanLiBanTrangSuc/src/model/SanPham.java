/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class SanPham {

    private String IDSanPham;
    private String TenSanPham;
    private GioiTinh IDGioiTinh;
    private boolean TrangThai;
    
    public SanPham() {
    }
    
    

    public SanPham(String IDSanPham, String TenSanPham, GioiTinh IDGioiTinh, boolean TrangThai) {
        this.IDSanPham = IDSanPham;
        this.TenSanPham = TenSanPham;
        this.IDGioiTinh = IDGioiTinh;
        this.TrangThai = TrangThai;
    }

    public String getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public GioiTinh getIDGioiTinh() {
        return IDGioiTinh;
    }

    public void setIDGioiTinh(GioiTinh IDGioiTinh) {
        this.IDGioiTinh = IDGioiTinh;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    

    

    

    
    
}
