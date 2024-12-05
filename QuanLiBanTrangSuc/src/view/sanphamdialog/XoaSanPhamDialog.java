/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.sanphamdialog;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ChiTietSanPham;
import repository.ChiTietSanPham.repoChiTietSanPham;
import view.until.ViewDialog;

public final class XoaSanPhamDialog extends javax.swing.JDialog {

    ViewDialog vd = new ViewDialog();
    repoChiTietSanPham rpct = new repoChiTietSanPham();

    public XoaSanPhamDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("LUXURY STORE");
        setLocationRelativeTo(null);
        vd.fontBtn(btn_Xoa);
        vd.fontBtn(btn_Huy);
        textFont();
    }

    void textFont() {
        vd.fontTextThongTin(txt_TenTrangSuc);
        vd.fontTextThongTin(txt_MaTrangSuc);
        vd.fontTextThongTin(txt_TiLeChatLieu);
        vd.fontTextThongTin(txt_LoaiChatLieu);
        vd.fontTextThongTin(txt_Size);
        vd.fontTextThongTin(txt_MauSac);
        vd.fontTextThongTin(txt_TenLoaiDa);
        vd.fontTextThongTin(txt_SoLuongDa);
        vd.fontTextThongTin(txt_KichThuocDa);
        vd.fontTextThongTin(txt_TrongLuong);
        vd.fontTextThongTin(txt_XuatXu);
        vd.fontTextThongTin(txt_DonViKiemDinh);
        vd.fontTextThongTin(txt_GiaBan);
        vd.fontTextThongTin(txt_GiaGiam);
        vd.fontLabel(txt_Anh);
        vd.fontTextThongTin(txt_LoaiTrangSuc);
    }

    public void getDuLieu(ChiTietSanPham c) {
        txt_TenTrangSuc.setText(c.getTen());
        txt_MaTrangSuc.setText(c.getIDChiTietSanPham());
        txt_LoaiTrangSuc.setText(c.getIDSanPham().getTenSanPham());
        txt_LoaiChatLieu.setText(c.getIDChatLieu().getTenChatLieu());
        txt_TiLeChatLieu.setText(String.valueOf(c.getIDChatLieu().getTyLe()));
        txt_MauSac.setText(String.valueOf(c.getIDChatLieu().getIDMauSac().getChiTietMauSac()));
        txt_Size.setText(String.valueOf(c.getIDSize().getSoSize()));
        txt_TenLoaiDa.setText(c.getIDDaQuy().getTenDaQuy());
        txt_KichThuocDa.setText(String.valueOf(c.getIDDaQuy().getKichThuoc()));
        txt_SoLuongDa.setText((String.valueOf(c.getSoLuongDaQuy())));
        txt_TrongLuong.setText(String.valueOf(c.getTrongLuong()));
        txt_XuatXu.setText(c.getIDNguonGoc().getCongTy());
        txt_DonViKiemDinh.setText(c.getIDKIemDinh().getDonViKiemDinh());
        txt_GiaBan.setText(String.valueOf(c.getGiaCu()));
        txt_GiaGiam.setText(String.valueOf(c.getGiaMoi()));
        if (c.getIDSanPham().getIDGioiTinh().getGioiTinh().equalsIgnoreCase("Nam")) {
            rdo_Nam.setSelected(true);
        }
        if (c.getIDSanPham().getIDGioiTinh().getGioiTinh().equalsIgnoreCase("Nữ")) {
            rdo_Nu.setSelected(true);
        }
        if (c.getIDSanPham().getIDGioiTinh().getGioiTinh().equalsIgnoreCase("Chung")) {
            rdo_Chung.setSelected(true);
        }

        ImageIcon imageIcon = new ImageIcon(c.getHinhAnh());
        Image image = imageIcon.getImage(); // Chuyển đổi về đối tượng Image
        Image scaledImage = image.getScaledInstance(txt_Anh.getWidth() - 2, txt_Anh.getHeight() - 2, Image.SCALE_SMOOTH); // Thay đổi kích thước ảnh
        imageIcon = new ImageIcon(scaledImage);
        txt_Anh.setIcon(imageIcon);
        System.out.println(txt_TenTrangSuc.getText());
        System.out.println(txt_GiaBan.getText());
        System.out.println(txt_DonViKiemDinh.getText());
        System.out.println(txt_MaTrangSuc.getText());
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
        txt_TenTrangSuc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_TenLoaiDa = new javax.swing.JTextField();
        txt_XuatXu = new javax.swing.JTextField();
        txt_DonViKiemDinh = new javax.swing.JTextField();
        txt_SoLuongDa = new javax.swing.JTextField();
        txt_MaTrangSuc = new javax.swing.JTextField();
        txt_TrongLuong = new javax.swing.JTextField();
        txt_Size = new javax.swing.JTextField();
        txt_LoaiChatLieu = new javax.swing.JTextField();
        txt_MauSac = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_KichThuocDa = new javax.swing.JTextField();
        txt_TiLeChatLieu = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdo_Nam = new javax.swing.JRadioButton();
        rdo_Nu = new javax.swing.JRadioButton();
        rdo_Chung = new javax.swing.JRadioButton();
        txt_LoaiTrangSuc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_Xoa = new javax.swing.JButton();
        btn_Huy = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txt_GiaGiam = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_GiaBan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setBackground(new java.awt.Color(225, 171, 19));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Xóa Sản Phẩm");

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
        jLabel12.setText("Loại Chất Liệu");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setText("Loại Trang Sức");

        txt_TenTrangSuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setText("Tên Loại Đá");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setText("Số Lượng Đá");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setText("Màu Sắc");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel18.setText("Xuất Xứ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel19.setText("Size");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel20.setText("Trọng Lượng");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel21.setText("Đơn Vị Kiểm Định");

        txt_TenLoaiDa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_TenLoaiDa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenLoaiDaActionPerformed(evt);
            }
        });

        txt_XuatXu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_XuatXu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_XuatXuActionPerformed(evt);
            }
        });

        txt_DonViKiemDinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_DonViKiemDinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DonViKiemDinhActionPerformed(evt);
            }
        });

        txt_SoLuongDa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_SoLuongDa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoLuongDaActionPerformed(evt);
            }
        });

        txt_MaTrangSuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_MaTrangSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaTrangSucActionPerformed(evt);
            }
        });

        txt_TrongLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_TrongLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TrongLuongActionPerformed(evt);
            }
        });

        txt_Size.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SizeActionPerformed(evt);
            }
        });

        txt_LoaiChatLieu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_LoaiChatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LoaiChatLieuActionPerformed(evt);
            }
        });

        txt_MauSac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_MauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MauSacActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel23.setText("Kích Thước Đá");

        txt_KichThuocDa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_KichThuocDa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_KichThuocDaActionPerformed(evt);
            }
        });

        txt_TiLeChatLieu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_TiLeChatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TiLeChatLieuActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel24.setText("Tỉ Lệ Chất Liệu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Giới Tính");

        buttonGroup1.add(rdo_Nam);
        rdo_Nam.setText("Nam");

        buttonGroup1.add(rdo_Nu);
        rdo_Nu.setText("Nữ");
        rdo_Nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_NuActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo_Chung);
        rdo_Chung.setText("Chung");

        txt_LoaiTrangSuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_LoaiTrangSuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LoaiTrangSucActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã Trang Sức");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_XuatXu)
                    .addComponent(txt_DonViKiemDinh)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txt_TenLoaiDa)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(214, 214, 214)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_KichThuocDa)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel23))
                                .addGap(0, 142, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(txt_TiLeChatLieu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txt_LoaiChatLieu)
                            .addComponent(txt_LoaiTrangSuc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_MauSac)
                            .addComponent(txt_Size)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(rdo_Nam)
                                .addGap(33, 33, 33)
                                .addComponent(rdo_Nu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdo_Chung))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_SoLuongDa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(txt_TrongLuong))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_MaTrangSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_TenTrangSuc, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_TenTrangSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_MaTrangSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdo_Nam)
                        .addComponent(rdo_Nu)
                        .addComponent(rdo_Chung))
                    .addComponent(txt_LoaiTrangSuc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_LoaiChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TiLeChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenLoaiDa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_KichThuocDa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_SoLuongDa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TrongLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_XuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_DonViKiemDinh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btn_Xoa.setBackground(new java.awt.Color(51, 204, 0));
        btn_Xoa.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.setBorder(null);
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Huy.setBackground(new java.awt.Color(251, 51, 51));
        btn_Huy.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_Huy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/huy.png"))); // NOI18N
        btn_Huy.setText("Hủy");
        btn_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Huy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setText("Giá Giảm");

        txt_GiaGiam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel22.setText("Giá Bán");

        txt_GiaBan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_GiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GiaBanActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(txt_GiaBan))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txt_GiaGiam)))
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_GiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_GiaGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 258, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        rpct.delete(txt_MaTrangSuc.getText());
        JOptionPane.showMessageDialog(null, "Xóa thành công");
        this.dispose();
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void txt_GiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GiaBanActionPerformed

    private void txt_TenLoaiDaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenLoaiDaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenLoaiDaActionPerformed

    private void txt_XuatXuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_XuatXuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_XuatXuActionPerformed

    private void txt_DonViKiemDinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DonViKiemDinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DonViKiemDinhActionPerformed

    private void txt_SoLuongDaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoLuongDaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoLuongDaActionPerformed

    private void txt_MaTrangSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaTrangSucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaTrangSucActionPerformed

    private void txt_TrongLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TrongLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TrongLuongActionPerformed

    private void txt_SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SizeActionPerformed

    private void txt_LoaiChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LoaiChatLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LoaiChatLieuActionPerformed

    private void txt_MauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MauSacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MauSacActionPerformed

    private void txt_KichThuocDaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_KichThuocDaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_KichThuocDaActionPerformed

    private void txt_TiLeChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TiLeChatLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TiLeChatLieuActionPerformed

    private void rdo_NuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_NuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo_NuActionPerformed

    private void btn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_HuyActionPerformed

    private void txt_LoaiTrangSucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LoaiTrangSucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LoaiTrangSucActionPerformed

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
            java.util.logging.Logger.getLogger(XoaSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoaSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoaSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoaSanPhamDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                XoaSanPhamDialog dialog = new XoaSanPhamDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Huy;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton rdo_Chung;
    private javax.swing.JRadioButton rdo_Nam;
    private javax.swing.JRadioButton rdo_Nu;
    private javax.swing.JLabel txt_Anh;
    private javax.swing.JTextField txt_DonViKiemDinh;
    private javax.swing.JTextField txt_GiaBan;
    private javax.swing.JTextField txt_GiaGiam;
    private javax.swing.JTextField txt_KichThuocDa;
    private javax.swing.JTextField txt_LoaiChatLieu;
    private javax.swing.JTextField txt_LoaiTrangSuc;
    private javax.swing.JTextField txt_MaTrangSuc;
    private javax.swing.JTextField txt_MauSac;
    private javax.swing.JTextField txt_Size;
    private javax.swing.JTextField txt_SoLuongDa;
    private javax.swing.JTextField txt_TenLoaiDa;
    private javax.swing.JTextField txt_TenTrangSuc;
    private javax.swing.JTextField txt_TiLeChatLieu;
    private javax.swing.JTextField txt_TrongLuong;
    private javax.swing.JTextField txt_XuatXu;
    // End of variables declaration//GEN-END:variables
}
