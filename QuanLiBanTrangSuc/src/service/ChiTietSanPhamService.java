/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
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
import repository.DaQuy.DaQuyRepository;
import repository.Size.SizeRepository;
import repository.chatlieu.ChatLieuRepository;
import repository.giamgia.RepoGiamGia;
import repository.kiemdinh.KiemDinhRepository;
import repository.mausac.MauSacRepository;
import repository.nguongoc.NguonGocRepository;
import repository.sanpham.SanPhamRepository;

/**
 *
 * @author WINDOWS10
 */
public class ChiTietSanPhamService implements InterfaceServiceChiTietSanPham {

    private repository.giamgia.RepoGiamGia rpGiamGia = new RepoGiamGia();
    private repository.nguongoc.NguonGocRepository rpNguonGoc = new NguonGocRepository();
    private repository.Size.SizeRepository rpSize = new SizeRepository();
    private repository.mausac.MauSacRepository rpMauSac = new MauSacRepository();
    private repository.DaQuy.DaQuyRepository rpDaQuy = new DaQuyRepository();
    private repository.chatlieu.ChatLieuRepository rpChatLieu = new ChatLieuRepository();
    private repository.sanpham.SanPhamRepository rpSanPham = new SanPhamRepository();
    private repository.kiemdinh.KiemDinhRepository rpKiemDinh = new KiemDinhRepository();
    private List<MauSac> listMS = new ArrayList<>();
    private List<DaQuy> listDQ = new ArrayList<>();
    private List<ChatLieu> listCL = new ArrayList<>();
    private List<KiemDinh> listKD = new ArrayList<>();
    private List<SanPham> listSp = new ArrayList<>();
    private List<Size> listSz = new ArrayList<>();
    private List<NguonGoc> listNg = new ArrayList<>();
    private List<GiamGia> listGg = new ArrayList<>();

    @Override
    public KiemDinh checkKD(JComboBox cbo) {
        listKD = rpKiemDinh.getAll();
        for (KiemDinh kiemDinh : listKD) {
            if (kiemDinh.getDonViKiemDinh().equalsIgnoreCase(cbo.getSelectedItem().toString())) {
                return kiemDinh;

            }
        }
        return null;
    }

    @Override
    public SanPham checkSP(JComboBox cbo) {
        listSp = rpSanPham.getAll();
        for (SanPham sp : listSp) {
            if (sp.getTenSanPham().equals(cbo.getSelectedItem().toString())) {
                return sp;
            }
        }
        return null;
    }

    @Override
    public ChatLieu checkcl(JComboBox cbo) {
        listCL = rpChatLieu.getAll();
        for (ChatLieu cl : listCL) {
            if (cl.getTenChatLieu().equals(cbo.getSelectedItem().toString())) {
                return cl;
            }
        }
        return null;
    }

    @Override
    public DaQuy checkdq(JComboBox cbo) {
        listDQ = rpDaQuy.getAll();
        for (DaQuy dq : listDQ) {
            if (dq.getTenDaQuy().equals(cbo.getSelectedItem().toString())) {
                return dq;
            }
        }
        return null;
    }

    @Override
    public MauSac checkMS(JComboBox cbo) {
        listMS = rpMauSac.getAll();
        for (MauSac ms : listMS) {
            if (ms.getChiTietMauSac().equals(cbo.getSelectedItem().toString())) {
                return ms;
            }
        }
        return null;
    }

    @Override
    public Size checkSize(JComboBox cbo) {
        listSz = rpSize.getAll();
        for (Size sz : listSz) {
            if (sz.getSoSize() == Integer.parseInt(cbo.getSelectedItem().toString())) {
                return sz;
            }
        }
        return null;
    }

    @Override
    public NguonGoc checkNguonGoc(JComboBox cbo) {
        listNg = rpNguonGoc.getAll();
        for (NguonGoc ng : listNg) {
            if (ng.getCongTy().equals(cbo.getSelectedItem().toString())) {
                return ng;
            }
        }
        return null;
    }

    @Override
    public GiamGia checkGiamGia(JTextField txt) {
        listGg = rpGiamGia.getAll();
        for (GiamGia gg : listGg) {
            if (gg.getTenMaGiamGia().equals(txt.getText())) {
                return gg;
            }
        }
        return null;
    }

}
