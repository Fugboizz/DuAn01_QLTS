/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class MauSac {
    private String IDMauSac;
    private String ChiTietMauSac;

    public MauSac() {
    }

    public MauSac(String IDMauSac, String ChiTietMauSac) {
        this.IDMauSac = IDMauSac;
        this.ChiTietMauSac = ChiTietMauSac;
    }

    public String getIDMauSac() {
        return IDMauSac;
    }

    public void setIDMauSac(String IDMauSac) {
        this.IDMauSac = IDMauSac;
    }

    public String getChiTietMauSac() {
        return ChiTietMauSac;
    }

    public void setChiTietMauSac(String ChiTietMauSac) {
        this.ChiTietMauSac = ChiTietMauSac;
    }
    
    
    
}
