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
public class NguonGoc {
    private String IDNguonGoc;
    private String DiaChi;
    private Date NgayXuatXuong;
    private String CongTy;
    private Date NgayTao;
    private Date NgaySua;
    private boolean TrangThai;
    private String LienHe;

    public NguonGoc() {
    }

    public NguonGoc(String IDNguonGoc, String DiaChi, Date NgayXuatXuong, String CongTy, Date NgayTao, Date NgaySua, boolean TrangThai, String LienHe) {
        this.IDNguonGoc = IDNguonGoc;
        this.DiaChi = DiaChi;
        this.NgayXuatXuong = NgayXuatXuong;
        this.CongTy = CongTy;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
        this.LienHe = LienHe;
    }

    public String getIDNguonGoc() {
        return IDNguonGoc;
    }

    public void setIDNguonGoc(String IDNguonGoc) {
        this.IDNguonGoc = IDNguonGoc;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public Date getNgayXuatXuong() {
        return NgayXuatXuong;
    }

    public void setNgayXuatXuong(Date NgayXuatXuong) {
        this.NgayXuatXuong = NgayXuatXuong;
    }

    public String getCongTy() {
        return CongTy;
    }

    public void setCongTy(String CongTy) {
        this.CongTy = CongTy;
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

    public String getLienHe() {
        return LienHe;
    }

    public void setLienHe(String LienHe) {
        this.LienHe = LienHe;
    }
    
    
    
}
