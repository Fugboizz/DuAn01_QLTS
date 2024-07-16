/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.until;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.ChatLieu;
import model.DaQuy;
import model.KiemDinh;
import model.MauSac;
import model.NguonGoc;
import model.SanPham;
import model.Size;
import repository.DaQuy.DaQuyRepository;
import repository.Size.SizeRepository;
import repository.chatlieu.ChatLieuRepository;
import repository.kiemdinh.KiemDinhRepository;
import repository.mausac.MauSacRepository;
import repository.nguongoc.NguonGocRepository;
import repository.sanpham.SanPhamRepository;

/**
 *
 * @author HUNGpYN
 */
public class SanPhamUntil implements SanPhamUntilInterface {

    private SizeRepository sizer = new SizeRepository();
    private SanPhamRepository spr = new SanPhamRepository();
    private ChatLieuRepository ctr = new ChatLieuRepository();
    private DaQuyRepository dqr = new DaQuyRepository();
    private NguonGocRepository ngr = new NguonGocRepository();
    private KiemDinhRepository kdr = new KiemDinhRepository();
    private MauSacRepository msr = new MauSacRepository();

    @Override
    public void addSize(JComboBox cbo) {
        for (Size s : sizer.getAll()) {
            cbo.addItem(String.valueOf(s.getSoSize()));
        }
    }

    @Override
    public void addLoaiSanPham(JComboBox cbo) {
        for (SanPham sp : spr.getAll()) {
            cbo.addItem(sp.getTenSanPham());
        }
    }

    @Override
    public void addChatLieu(JComboBox cbo) {
        for (ChatLieu ct : ctr.getAll()) {
            cbo.addItem(ct.getTenChatLieu() + " - " + ct.getIDMauSac().getChiTietMauSac());
        }
    }

    @Override
    public void addTenDa(JComboBox cbo) {
        for (DaQuy dq : dqr.getAll()) {
            cbo.addItem(dq.getTenDaQuy() + " - " + dq.getKichThuoc() + " mm");
        }

    }

    @Override
    public void addXuatXu(JComboBox cbo) {
        for (NguonGoc ng : ngr.getAll()) {
            cbo.addItem(ng.getCongTy());
        }
    }

    @Override
    public void addKiemDinh(JComboBox cbo) {
        for (KiemDinh kd : kdr.getAll()) {
            cbo.addItem(kd.getDonViKiemDinh());
        }
    }

    @Override
    public void lamMoiText(JTextField text) {
        text.setText("");
    }

    @Override
    public void lamMoiCbo(JComboBox cbo) {
        cbo.setSelectedItem(null);
    }

    @Override
    public void addMauSac(JComboBox cbo) {
        for (MauSac ms : msr.getAll()) {
            cbo.addItem(ms.getChiTietMauSac());
        }
    }

    @Override
    public void lamMoiGbo(ButtonGroup btr) {
        btr.clearSelection();
    }
}
