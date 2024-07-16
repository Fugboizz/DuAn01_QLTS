/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.DaQuy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DaQuy;
import until.jdbc;

/**
 *
 * @author HUNGpYN
 */
public class DaQuyRepository implements DaQuyServiceInterface {

    private Connection con = null;
    private PreparedStatement pre = null;
    private ResultSet res = null;
    private String sql = null;

    @Override
    public List<DaQuy> getAll() {
        List<DaQuy> list = new ArrayList<>();
        sql = "Select * from DaQuy";
        try {
            con = jdbc.getConnection();
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {                
                DaQuy dq =  new DaQuy();
                dq.setIDDaQuyString(res.getString("IDDaQuy"));
                dq.setTenDaQuy(res.getString("TenDaQuy"));
                dq.setKichThuoc(res.getFloat("KichThuoc"));
                dq.setTrangThai(res.getBoolean("TrangThai"));
                list.add(dq);
            }
            return list;
        } catch (Exception e) {
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
