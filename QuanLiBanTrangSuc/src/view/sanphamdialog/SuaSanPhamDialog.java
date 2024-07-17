/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.sanphamdialog;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import model.ChiTietSanPham;
import service.sanpham.SanPhamService;
import view.until.SanPhamUntil;
import view.until.ViewDialog;

public final class SuaSanPhamDialog extends javax.swing.JDialog {

    private SanPhamUntil spu = new SanPhamUntil();
    private SanPhamService sps = new SanPhamService();
    ViewDialog vd = new ViewDialog();

    public SuaSanPhamDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("LUXURY STORE");
        setLocationRelativeTo(null);
        fontGiaoDien();

    }

    void fontGiaoDien() {
        vd.fontBtn(btn_ChonAnh);
        vd.fontText(txt_TenTrangSuc);
        vd.fontLabel(txt_Anh);
        vd.fontText(txt_GiaBan);
        vd.fontBtn(btn_Huy);
        vd.fontBtn(btn_LamMoi);
        vd.fontBtn(btn_Luu);
        btn_ChonAnh.setBackground(Color.WHITE);
        spu.addSize(cbo_Size);
        spu.addLoaiSanPham(cbo_LoaiTrangSuc);
        spu.addChatLieu(cbo_ChatLieu);
        spu.addTenDa(cbo_LoaiDa);
        spu.addXuatXu(cbo_XuatXu);
        spu.addKiemDinh(cbo_KiemDinh);
    }
    void lamMoi(){
        spu.lamMoiText(txt_GiaBan);
        spu.lamMoiText(txt_TenTrangSuc);
        spu.lamMoiText(txt_TrongLuong);
        spu.lamMoiText(txt_SoLuongDa);
        spu.lamMoiCbo(cbo_Size);
        spu.lamMoiCbo(cbo_ChatLieu);
        spu.lamMoiCbo(cbo_KiemDinh);
        spu.lamMoiCbo(cbo_LoaiTrangSuc);
        spu.lamMoiCbo(cbo_LoaiDa);
        spu.lamMoiCbo(cbo_XuatXu);
        spu.lamMoiCbo(cbo_LoaiDa);
        spu.lamLabel(txt_Anh);
    }
    //Hiển thị form
     public void showDuLieu(ChiTietSanPham t) {
        txt_TenTrangSuc.setText(t.getTen());
        txt_GiaBan.setText(String.valueOf(t.getGiaCu()));
        txt_TrongLuong.setText(String.valueOf(t.getTrongLuong()));
        txt_SoLuongDa.setText(String.valueOf(t.getSoLuongDaQuy()));
        txt_MaTrangSuc.setText(t.getIDChiTietSanPham());
        for (int i = 0; i < cbo_LoaiTrangSuc.getItemCount(); i++) {
            if (t.getIDSanPham().getTenSanPham().equalsIgnoreCase(cbo_LoaiTrangSuc.getItemAt(i))) {
                cbo_LoaiTrangSuc.setSelectedIndex(i);
            }
        }
        for (int i = 0; i < cbo_ChatLieu.getItemCount(); i++) {
            if (t.getIDChatLieu().getTenChatLieu().equalsIgnoreCase(cbo_ChatLieu.getItemAt(i))) {
                cbo_ChatLieu.setSelectedIndex(i);
            }
        }
        for (int i = 0; i < cbo_LoaiDa.getItemCount(); i++) {
            String ten = t.getIDDaQuy().getTenDaQuy() + " - " + t.getIDDaQuy().getKichThuoc();
            if (ten.equalsIgnoreCase(cbo_LoaiDa.getItemAt(i))) {
                cbo_LoaiDa.setSelectedIndex(i);
            }

        }

        for (int i = 0; i < cbo_XuatXu.getItemCount(); i++) {
            if (t.getIDNguonGoc().getCongTy().equalsIgnoreCase(cbo_XuatXu.getItemAt(i))) {
                cbo_XuatXu.setSelectedIndex(i);
            }
        }
        for (int i = 0; i < cbo_KiemDinh.getItemCount(); i++) {
            if (t.getIDKIemDinh().getDonViKiemDinh().equalsIgnoreCase(cbo_KiemDinh.getItemAt(i))) {
                cbo_KiemDinh.setSelectedIndex(i);
            }
        }
        for (int i = 0; i < cbo_Size.getItemCount(); i++) {
            if (String.valueOf(t.getIDSize().getSoSize()).equalsIgnoreCase(cbo_Size.getItemAt(i))) {
                cbo_Size.setSelectedIndex(i);
            }
        }
        ImageIcon imageIcon = new ImageIcon(t.getHinhAnh());
        Image image = imageIcon.getImage(); // Chuyển đổi về đối tượng Image
        Image scaledImage = image.getScaledInstance(txt_Anh.getWidth()-2, txt_Anh.getHeight()-2, Image.SCALE_SMOOTH); // Thay đổi kích thước ảnh
        imageIcon = new ImageIcon(scaledImage);
        txt_Anh.setIcon(imageIcon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txt_Anh = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_GiaBan = new javax.swing.JTextField();
        cbo_ChatLieu = new javax.swing.JComboBox<>();
        txt_TenTrangSuc = new javax.swing.JTextField();
        cbo_LoaiTrangSuc = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbo_XuatXu = new javax.swing.JComboBox<>();
        cbo_LoaiDa = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbo_Size = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbo_KiemDinh = new javax.swing.JComboBox<>();
        txt_MaTrangSuc = new javax.swing.JTextField();
        txt_TrongLuong = new javax.swing.JTextField();
        txt_SoLuongDa = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn_Huy = new javax.swing.JButton();
        btn_Luu = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();
        btn_ChonAnh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setBackground(new java.awt.Color(225, 171, 19));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sửa Thông Tin Sản Phẩm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_Anh, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_Anh, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("Tên Trang Sức");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Chất Liệu");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setText("Loại Trang Sức");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setText("Giá Bán");

        txt_GiaBan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_TenTrangSuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setText("Tên Loại Đá");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setText("Số Lượng Đá");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setText("Mã Trang Sức:");

        cbo_XuatXu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_XuatXuActionPerformed(evt);
            }
        });

        cbo_LoaiDa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_LoaiDaActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel18.setText("Xuất Xứ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel19.setText("Size");

        cbo_Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_SizeActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel20.setText("Trọng Lượng");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel21.setText("Đơn Vị Kiểm Định");

        cbo_KiemDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_KiemDinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(cbo_KiemDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel18)
                                .addComponent(txt_TenTrangSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbo_XuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(cbo_LoaiDa, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(cbo_LoaiTrangSuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_GiaBan)
                                            .addComponent(cbo_ChatLieu, 0, 178, Short.MAX_VALUE)))
                                    .addGap(110, 110, 110)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbo_Size, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_MaTrangSuc)
                                        .addComponent(txt_TrongLuong)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel20)
                                                .addComponent(jLabel19)
                                                .addComponent(jLabel16))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(txt_SoLuongDa)))))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_TenTrangSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_LoaiTrangSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MaTrangSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_GiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbo_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TrongLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_LoaiDa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoLuongDa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_XuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_KiemDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btn_Huy.setBackground(new java.awt.Color(255, 0, 0));
        btn_Huy.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_Huy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/huy.png"))); // NOI18N
        btn_Huy.setText("Hủy");
        btn_Huy.setBorder(null);
        btn_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyActionPerformed(evt);
            }
        });

        btn_Luu.setBackground(new java.awt.Color(0, 204, 0));
        btn_Luu.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_Luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/luu.png"))); // NOI18N
        btn_Luu.setText("Lưu");
        btn_Luu.setBorder(null);
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuActionPerformed(evt);
            }
        });

        btn_LamMoi.setBackground(new java.awt.Color(0, 153, 255));
        btn_LamMoi.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        btn_LamMoi.setText("Làm Mới");
        btn_LamMoi.setBorder(null);
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        btn_ChonAnh.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_ChonAnh.setText("Chọn Ảnh");
        btn_ChonAnh.setPreferredSize(new java.awt.Dimension(84, 30));
        btn_ChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChonAnhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btn_ChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_LoaiDaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_LoaiDaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_LoaiDaActionPerformed

    private void cbo_XuatXuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_XuatXuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_XuatXuActionPerformed

    private void cbo_SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_SizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_SizeActionPerformed

    private void btn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_HuyActionPerformed

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LuuActionPerformed

    private void cbo_KiemDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_KiemDinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_KiemDinhActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        // TODO add your handling code here:
        lamMoi();
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_ChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChonAnhActionPerformed
        sps.chonAnh(txt_Anh);
        String link;
        link = (String) txt_Anh.getClientProperty("imagepath");
        System.out.println(link);
    }//GEN-LAST:event_btn_ChonAnhActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuaSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaSanPhamDialog dialog = new SuaSanPhamDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ChonAnh;
    private javax.swing.JButton btn_Huy;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Luu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_ChatLieu;
    private javax.swing.JComboBox<String> cbo_KiemDinh;
    private javax.swing.JComboBox<String> cbo_LoaiDa;
    private javax.swing.JComboBox<String> cbo_LoaiTrangSuc;
    private javax.swing.JComboBox<String> cbo_Size;
    private javax.swing.JComboBox<String> cbo_XuatXu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel txt_Anh;
    private javax.swing.JTextField txt_GiaBan;
    private javax.swing.JTextField txt_MaTrangSuc;
    private javax.swing.JTextField txt_SoLuongDa;
    private javax.swing.JTextField txt_TenTrangSuc;
    private javax.swing.JTextField txt_TrongLuong;
    // End of variables declaration//GEN-END:variables
}
