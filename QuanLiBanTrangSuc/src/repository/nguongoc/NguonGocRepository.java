/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.nguongoc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.NguonGoc;
import until.jdbc;

/**
 *
 * @author HUNGpYN
 */
public class NguonGocRepository implements NguonGocInterface{

    private Connection con = null;
    private PreparedStatement pre = null;
    private ResultSet res = null;
    private String sql = null;
    @Override
    public List<NguonGoc> getAll() {
         List kd = new ArrayList();
        sql = "select * from NguonGoc";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {                
                NguonGoc ng = new NguonGoc();
                ng.setIDNguonGoc(res.getString(1));
                ng.setDiaChi(res.getString(2));
                ng.setNgayXuatXuong(res.getDate(3));
                ng.setTrangThai(res.getBoolean(7));
                ng.setLienHe(res.getString(8));
                ng.setCongTy(res.getString("CongTy"));
                kd.add(ng);
            }
            return kd;
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
