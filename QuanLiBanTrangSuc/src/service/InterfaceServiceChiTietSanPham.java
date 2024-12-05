/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.ChatLieu;
import model.DaQuy;
import model.GiamGia;
import model.KiemDinh;
import model.MauSac;
import model.NguonGoc;
import model.SanPham;
import model.Size;

/**
 *
 * @author WINDOWS10
 */

public interface InterfaceServiceChiTietSanPham {
    
    public KiemDinh checkKD(JComboBox cbo);
    public SanPham checkSP(JComboBox cbo);
    public ChatLieu checkcl(JComboBox cbo);
    public DaQuy checkdq(JComboBox cbo);
    public MauSac checkMS(JComboBox cbo);
    public Size checkSize(JComboBox cbo);
    public NguonGoc checkNguonGoc(JComboBox cbo);
    public GiamGia checkGiamGia(JTextField txt);
}
