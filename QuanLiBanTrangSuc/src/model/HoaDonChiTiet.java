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
public class HoaDonChiTiet {
    private String IDHoaDonChiTiet;
    private ChiTietSanPham IDChiTietSanPham;
    private HoaDon IDHoaDon;
    private int SoLUongSanPHam;
    private Double TongGia;
    private Date NgayTao;
    private Date NgaySua;
    private boolean TrangThai;

    public HoaDonChiTiet() {
    }

    public String getIDHoaDonChiTiet() {
        return IDHoaDonChiTiet;
    }

    public void setIDHoaDonChiTiet(String IDHoaDonChiTiet) {
        this.IDHoaDonChiTiet = IDHoaDonChiTiet;
    }

    public ChiTietSanPham getIDChiTietSanPham() {
        return IDChiTietSanPham;
    }

    public void setIDChiTietSanPham(ChiTietSanPham IDChiTietSanPham) {
        this.IDChiTietSanPham = IDChiTietSanPham;
    }

    public HoaDon getIDHoaDon() {
        return IDHoaDon;
    }

    public void setIDHoaDon(HoaDon IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    public int getSoLUongSanPHam() {
        return SoLUongSanPHam;
    }

    public void setSoLUongSanPHam(int SoLUongSanPHam) {
        this.SoLUongSanPHam = SoLUongSanPHam;
    }

    public Double getTongGia() {
        return TongGia;
    }

    public void setTongGia(Double TongGia) {
        this.TongGia = TongGia;
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
  
    
}
