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
        sql = "Select * from DaQuy where TrangThai = 1";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                DaQuy dq = new DaQuy();
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
    // Thêm Đá Quý Khôi 17/07
    public int creat(DaQuy dq) {
        sql = "INSERT INTO DaQuy(TenDaQuy, KichThuoc, TrangThai) VALUES(?,?,?)";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            pre.setString(1, dq.getTenDaQuy());
            pre.setFloat(2, dq.getKichThuoc());
            pre.setInt(3, 1);
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    // Update Đá Quý Khôi 17/07 
    //EXEC UpdateDaQuy @IDDaQuy, @TenDaQuy, @KichThuoc, @TrangThai

   public int update(DaQuy dq) {
    sql = "UPDATE DaQuy SET TenDaQuy = ?, KichThuoc = ? WHERE IDDaQuy = ?";
    try {
        con = jdbc.getConnection();
        pre = con.prepareStatement(sql);
        pre.setString(1, dq.getTenDaQuy());
        pre.setFloat(2, dq.getKichThuoc());
        pre.setString(3, dq.getIDDaQuyString());
        return pre.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}

    @Override
    public int delete(DaQuy dq) {
        sql = "EXEC UpdateDaQuy ?, ?, ?, ?";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            pre.setString(1, dq.getIDDaQuyString());
            pre.setString(2, dq.getTenDaQuy());
            pre.setFloat(3, dq.getKichThuoc());
            pre.setInt(4, 0);
            return pre.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
