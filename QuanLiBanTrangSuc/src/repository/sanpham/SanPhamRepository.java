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
        List sanPham = new ArrayList();
        sql = "select * from sanpham as s join GioiTinh as g on s.IDGioiTinh = g.IDGioiTinh";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            while(res.next()){
                SanPham sp = new SanPham();
                sp.setIDSanPham(res.getString(1));
                sp.setTenSanPham(res.getString(2));
                sp.setTrangThai(res.getBoolean(6));
                GioiTinh gt = new GioiTinh(res.getString(7), res.getString(8));
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
    public int creat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
