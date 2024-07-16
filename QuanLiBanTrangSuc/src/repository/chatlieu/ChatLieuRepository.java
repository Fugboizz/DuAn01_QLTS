/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.chatlieu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ChatLieu;
import model.MauSac;
import until.jdbc;

/**
 *
 * @author HUNGpYN
 */
public class ChatLieuRepository implements ChatLieuInterface {

    private Connection con = null;
    private PreparedStatement pre = null;
    private ResultSet res = null;
    private String sql = null;

    @Override
    public List<ChatLieu> getAll() {
        List<ChatLieu> list = new ArrayList<>();
        sql = "select * from ChatLieu";
        try {
            con = jdbc.getConnection();
            pre = con.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                MauSac ms = new MauSac();
                ms.setIDMauSac(res.getString(4));
                ChatLieu cl = new ChatLieu();
                cl.setIDChatLieu(res.getString("IDChatLieu"));
                cl.setTenChatLieu(res.getString(2));
                cl.setTyLe(res.getFloat(3));
                cl.setIDMauSac(ms);
                list.add(cl);
            }
            return list;
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
