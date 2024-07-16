/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.model;

import java.awt.Image;
import java.sql.Date;

/**
 *
 * @author HUNGpYN
 */
public class TaiKhoan {

    private String idTaiKhoan;
    private String taiKhoan;
    private String matKhau;
    private String hoTen;
    private String diaChi;
    private String email;
    private Date ngaySinh;
    private boolean chucVu;
    private boolean trangThai;
    private Image anh;
    private String soDienThoai;
    private boolean gioiTinh;

    public TaiKhoan() {
    }

    public TaiKhoan(String hoTen, boolean chucVu) {
        this.hoTen = hoTen;
        this.chucVu = chucVu;
    }

    public TaiKhoan(String idTaiKhoan, String taiKhoan, String matKhau, String hoTen, String diaChi, String email, Date ngaySinh, boolean chucVu, boolean trangThai, Image anh, String soDienThoai, boolean gioiTinh) {
        this.idTaiKhoan = idTaiKhoan;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
        this.anh = anh;
        this.soDienThoai = soDienThoai;
        this.gioiTinh = gioiTinh;
    }

    public String getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(String idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isChucVu() {
        return chucVu;
    }

    public void setChucVu(boolean chucVu) {
        this.chucVu = chucVu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Image getAnh() {
        return anh;
    }

    public void setAnh(Image anh) {
        this.anh = anh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
}
