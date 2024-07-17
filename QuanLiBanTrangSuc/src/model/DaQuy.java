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
public class DaQuy {
    private String IDDaQuyString;
    private String TenDaQuy;
    private float KichThuoc;
    private Date NgayTao;
    private Date NgaySua;
    private boolean TrangThai;

    public DaQuy() {
    }

    public DaQuy(String IDDaQuyString, String TenDaQuy, float KichThuoc) {
        this.IDDaQuyString = IDDaQuyString;
        this.TenDaQuy = TenDaQuy;
        this.KichThuoc = KichThuoc;
    }
    
    

    public DaQuy(String IDDaQuyString, String TenDaQuy, float KichThuoc, Date NgayTao, Date NgaySua, boolean TrangThai) {
        this.IDDaQuyString = IDDaQuyString;
        this.TenDaQuy = TenDaQuy;
        this.KichThuoc = KichThuoc;
        this.NgayTao = NgayTao;
        this.NgaySua = NgaySua;
        this.TrangThai = TrangThai;
    }

    public String getIDDaQuyString() {
        return IDDaQuyString;
    }

    public void setIDDaQuyString(String IDDaQuyString) {
        this.IDDaQuyString = IDDaQuyString;
    }

    public String getTenDaQuy() {
        return TenDaQuy;
    }

    public void setTenDaQuy(String TenDaQuy) {
        this.TenDaQuy = TenDaQuy;
    }

    public float getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(float KichThuoc) {
        this.KichThuoc = KichThuoc;
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
