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
public class KhachHang {
 private String IDKhachHang;
 private String HoTen;
 private String SoDienThoai;
 private String DiaChi;
 private boolean GioiTinh;
 private Date NgayTao;
 private Date NgaySua;
 private int TichDiem;
 private boolean TrangThai;

    public KhachHang() {
    }

    public KhachHang(String IDKhachHang, String HoTen, String SoDienThoai, String DiaChi, boolean GioiTinh, Date NgayTao, Date NgaySua, int TichDiem, boolean TrangThai) {
        this.IDKhachHang = IDKhachHang;
        this.HoTen = HoTen;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TichDiem = TichDiem;
        this.TrangThai = TrangThai;
    }

    public String getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(String IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(Date NgaySua) {
        this.NgaySua = NgaySua;
    }

    public int getTichDiem() {
        return TichDiem;
    }

    public void setTichDiem(int TichDiem) {
        this.TichDiem = TichDiem;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
 
 
    
}
