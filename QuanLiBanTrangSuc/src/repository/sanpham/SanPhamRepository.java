/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.sanpham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.GioiTinh;
import model.SanPham;
import until.jdbc;

/**
 *
 * @author HUNGpYN
 */
public class SanPhamRepository implements SanPhamInterface {

    private Connection con = null;
    private PreparedStatement pre = null;
    private ResultSet res = null;
    private String sql = null;

    @Override
    public List<SanPham> getAll() {
        List<SanPham> sanPham = new ArrayList<>();
        sql = "SELECT * FROM sanpham AS s JOIN GioiTinh AS g ON s.IDGioiTinh = g.IDGioiTinh WHERE TrangThai = 1";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            while(res.next()){
                SanPham sp = new SanPham();
                sp.setIDSanPham(res.getString("IDSanPham"));
                sp.setTenSanPham(res.getString("TenSanPham"));
                sp.setTrangThai(res.getBoolean("TrangThai"));
                GioiTinh gt = new GioiTinh(res.getString("IDGioiTinh"), res.getString("GioiTinh"));
                sp.setIDGioiTinh(gt);
                sanPham.add(sp);
            }
            return sanPham;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int creat(SanPham sp) {
        sql = "INSERT INTO SanPham(TenSanPham, IDGioiTinh, TrangThai) VALUES(?,?,?)";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            pre.setString(1, sp.getTenSanPham());
            pre.setString(2, sp.getIDGioiTinh().getIDGioiTinh());
            pre.setBoolean(3, sp.isTrangThai());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(SanPham sp) {
        sql = "UPDATE SanPham SET TenSanPham = ?, IDGioiTinh = ?, TrangThai = ?   WHERE IDSanPham = ?";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            pre.setString(1, sp.getTenSanPham());
            pre.setString(2, sp.getIDGioiTinh().getIDGioiTinh());
            pre.setBoolean(3, sp.isTrangThai());
            pre.setString(4, sp.getIDSanPham());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(SanPham sp) {
        sql = "UPDATE SanPham SET TrangThai = 0   WHERE IDSanPham = ?";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            pre.setString(1, sp.getIDSanPham());
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
