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
public class TaiKhoan {
     private String IDKHachHang;
    private String TaiKhoan;
    private String MatKhau;
    private String HoTen;
    private String DiaChi;
    private String Email;
    private Date NgaySinh;
    private boolean ChucVu;
    private Date NgayTao;
    private Date NgaySua;
    private boolean TrangThai;
    private String AnhNhanVien;
    private String SoDienThoai;
    private boolean GioiTinh;

    public TaiKhoan() {
    }

    public TaiKhoan(String IDKHachHang, String TaiKhoan, String MatKhau, String HoTen, String DiaChi, String Email, Date NgaySinh, boolean ChucVu, Date NgayTao, Date NgaySua, boolean TrangThai, String AnhNhanVien, String SoDienThoai, boolean GioiTinh) {
        this.IDKHachHang = IDKHachHang;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.NgaySinh = NgaySinh;
        this.ChucVu = ChucVu;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
        this.AnhNhanVien = AnhNhanVien;
        this.SoDienThoai = SoDienThoai;
        this.GioiTinh = GioiTinh;
    }

    public String getIDKHachHang() {
        return IDKHachHang;
    }

    public void setIDKHachHang(String IDKHachHang) {
        this.IDKHachHang = IDKHachHang;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public boolean isChucVu() {
        return ChucVu;
    }

    public void setChucVu(boolean ChucVu) {
        this.ChucVu = ChucVu;
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

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getAnhNhanVien() {
        return AnhNhanVien;
    }

    public void setAnhNhanVien(String AnhNhanVien) {
        this.AnhNhanVien = AnhNhanVien;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
}
