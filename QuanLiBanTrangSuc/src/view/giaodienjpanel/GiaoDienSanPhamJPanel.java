/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.giaodienjpanel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.ChiTietSanPham;
import model.GiaoDien.SanPham;
import repository.ChiTietSanPham.repoChiTietSanPham;
import repository.sanpham.SanPhamRepository;
import service.GiaoDienService;
import view.main.Main;
import view.sanphamdialog.QuanLiDialog1;
import view.sanphamdialog.SuaSanPhamDialog;
import view.sanphamdialog.ThemSanPhamDialog;
import view.sanphamdialog.ThongTinChiTietSanPhamDialog;
import view.sanphamdialog.XoaSanPhamDialog;
import view.until.GiaoDienJpanel;

/**
 *
 * @author HUNGpYN
 */
public class GiaoDienSanPhamJPanel extends javax.swing.JPanel {

    private List<ChiTietSanPham> ctList = new ArrayList<>();
    private repoChiTietSanPham rpctsp = new repoChiTietSanPham();
    private ChiTietSanPham ctsp = new ChiTietSanPham();
    private Main main;
    private model.GiaoDien.SanPham mdsp = new SanPham();
    private GiaoDienService gds = new GiaoDienService();
    GiaoDienJpanel gd = new GiaoDienJpanel();
    private DefaultTableModel model;

    public GiaoDienSanPhamJPanel() {
        initComponents();
        gd.sizeButton(btn_Xoa);
        fillToTable();
    }

    void fillToTable() {
        ctList = rpctsp.getAll();
        String hienthi[] = {"Mã Trang Sức", "Loại Sản Phẩm", "Tên Trang Sức", "Giá Giảm", "Tồn Kho", "Giới Tính", "Trạng Thái"};
        model = new DefaultTableModel(hienthi, 0);
        for (ChiTietSanPham ctsp : ctList) {
            Object rowObject[] = {ctsp.getIDChiTietSanPham(), ctsp.getIDSanPham().getTenSanPham(), ctsp.getTen(), ctsp.getGiaMoi(), ctsp.getSoLuongTonKho(), ctsp.getIDSanPham().getIDGioiTinh().getGioiTinh(), ctsp.isTrangThai() ? "Còn Hàng" : "Hết Hàng"};
            model.addRow(rowObject);
        }
        tblThongTinChiTietSanPham.setModel(model);

    }

    void fillToCheck() {
        ctList = rpctsp.getAllWithConditional(mdsp);
        String hienthi[] = {"Mã Trang Sức", "Loại Sản Phẩm", "Tên Trang Sức", "Giá Giảm", "Tồn Kho", "Giới Tính", "Trạng Thái"};
        model = new DefaultTableModel(hienthi, 0);
        for (ChiTietSanPham ctsp : ctList) {
            Object rowObject[] = {ctsp.getIDChiTietSanPham(), ctsp.getIDSanPham().getTenSanPham(), ctsp.getTen(), ctsp.getGiaMoi(), ctsp.getSoLuongTonKho(), ctsp.getIDSanPham().getIDGioiTinh().getGioiTinh(), ctsp.isTrangThai() ? "Còn Hàng" : "Hết Hàng"};
            model.addRow(rowObject);
        }
        tblThongTinChiTietSanPham.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_TimKiem = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_ChiTiet = new javax.swing.JButton();
        btn_ThuocTinh = new javax.swing.JButton();
        btn_Excel = new javax.swing.JButton();
        cbo_TimKiem = new javax.swing.JComboBox<>();
        txtTimKiem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdoConHang = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        rdoHethang = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        rdoChung = new javax.swing.JRadioButton();
        rdoGiamGiaCo = new javax.swing.JRadioButton();
        rdoGiamGiaKhon = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongTinChiTietSanPham = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_TimKiem.setBackground(new java.awt.Color(255, 204, 0));
        btn_TimKiem.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/TimKiem.png"))); // NOI18N
        btn_TimKiem.setText("Tìm Kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/them1.png"))); // NOI18N
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Sua.png"))); // NOI18N
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Xoa.png"))); // NOI18N
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_ChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ChiTiet.png"))); // NOI18N
        btn_ChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietActionPerformed(evt);
            }
        });

        btn_ThuocTinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/QuanLi.png"))); // NOI18N
        btn_ThuocTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThuocTinhActionPerformed(evt);
            }
        });

        btn_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/InExcel.png"))); // NOI18N

        cbo_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Loại Sản Phẩm", " " }));
        cbo_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_TimKiemActionPerformed(evt);
            }
        });

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thêm");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sửa");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Xóa");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Chi Tiết");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Quản Lí");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("In");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Sua, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Excel, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(cbo_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(btn_TimKiem)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Them)
                    .addComponent(btn_Sua)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_ChiTiet)
                    .addComponent(btn_ThuocTinh)
                    .addComponent(btn_Excel)
                    .addComponent(cbo_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông Tin Chi Tiết Sản Phẩm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Trạng Thái");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Giảm Giá");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Giới Tính");

        buttonGroup1.add(rdoConHang);
        rdoConHang.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdoConHang.setText("Còn Hàng");
        rdoConHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoConHangActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoHethang);
        rdoHethang.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdoHethang.setText("Hết Hàng");
        rdoHethang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoHethangActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdoNu.setText("Nữ");
        rdoNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNuActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoChung);
        rdoChung.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdoChung.setText("Chung");
        rdoChung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChungActionPerformed(evt);
            }
        });

        buttonGroup3.add(rdoGiamGiaCo);
        rdoGiamGiaCo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdoGiamGiaCo.setText("Có");
        rdoGiamGiaCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGiamGiaCoActionPerformed(evt);
            }
        });

        buttonGroup3.add(rdoGiamGiaKhon);
        rdoGiamGiaKhon.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdoGiamGiaKhon.setText("Không");
        rdoGiamGiaKhon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGiamGiaKhonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoGiamGiaCo)
                            .addComponent(rdoConHang)
                            .addComponent(rdoNam)
                            .addComponent(rdoHethang)
                            .addComponent(rdoNu)
                            .addComponent(rdoChung)
                            .addComponent(rdoGiamGiaKhon))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoConHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoHethang)
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoNu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoChung)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoGiamGiaCo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoGiamGiaKhon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblThongTinChiTietSanPham.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tblThongTinChiTietSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Trang Sức", "Tên Trang Sức", "Giá Bán", "Giá Giảm", "Tồn Kho", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblThongTinChiTietSanPham);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdoConHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoConHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoConHangActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void rdoHethangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoHethangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoHethangActionPerformed

    private void rdoNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNuActionPerformed

    private void rdoChungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoChungActionPerformed

    private void rdoGiamGiaCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGiamGiaCoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoGiamGiaCoActionPerformed

    private void rdoGiamGiaKhonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGiamGiaKhonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoGiamGiaKhonActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // TODO add your handling code here:
        SuaSanPhamDialog suaDialog = new SuaSanPhamDialog(main, true);
        gds.clicked(suaDialog);
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_ChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietActionPerformed
        // TODO add your handling code here:
        ThongTinChiTietSanPhamDialog ttct = new ThongTinChiTietSanPhamDialog(main, true);
        gds.clicked(ttct);
    }//GEN-LAST:event_btn_ChiTietActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:
        ThemSanPhamDialog themDialog = new ThemSanPhamDialog(main, true);
        gds.clicked(themDialog);
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        // TODO add your handling code here:
        XoaSanPhamDialog xoaDialog = new XoaSanPhamDialog(main, true);
        gds.clicked(xoaDialog);
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_ThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThuocTinhActionPerformed
        // TODO add your handling code here:
        QuanLiDialog1 ql = new QuanLiDialog1(main, true);
        gds.clicked(ql);
    }//GEN-LAST:event_btn_ThuocTinhActionPerformed

    private void cbo_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_TimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_TimKiemActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        if (rdoConHang.isSelected()) {
            mdsp.setTrangThai(true);
        } else if (rdoHethang.isSelected()) {
            mdsp.setTrangThai(false);
        }

        if (rdoNam.isSelected()) {
            mdsp.setGioiTinh(true);
        } else if (rdoNu.isSelected()) {
            mdsp.setGioiTinh(false);
        }

        if (rdoGiamGiaCo.isSelected()) {
            mdsp.setGiamGia(true);
        } else if (rdoGiamGiaKhon.isSelected()) {
            mdsp.setGiamGia(false);
        }

        if (cbo_TimKiem.getSelectedIndex() == 1) {
            mdsp.setSanPham(txtTimKiem.getText());
        }else if(cbo_TimKiem.getSelectedIndex() == 0){
            mdsp.setSanPham("");
        }
        ctList.clear(); // Clear current list
        ctList.addAll(rpctsp.getAllWithConditional(mdsp)); 
        fillToCheck(); 
    }//GEN-LAST:event_btn_TimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ChiTiet;
    private javax.swing.JButton btn_Excel;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_ThuocTinh;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbo_TimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoChung;
    private javax.swing.JRadioButton rdoConHang;
    private javax.swing.JRadioButton rdoGiamGiaCo;
    private javax.swing.JRadioButton rdoGiamGiaKhon;
    private javax.swing.JRadioButton rdoHethang;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblThongTinChiTietSanPham;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
