/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.sanphamdialog;

import view.until.SanPhamUntil;

/**
 *
 * @author HUNGpYN
 */
public class QuanLiDialog1 extends javax.swing.JDialog {

   private SanPhamUntil spu = new SanPhamUntil();
    public QuanLiDialog1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fontGiaoDien();
    }

void fontGiaoDien(){
    setTitle("Luxury Store");
    setLocationRelativeTo(null);
    spu.addMauSac(cbo_MauSac);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        DaQuy = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_MaDaQuy = new javax.swing.JTextField();
        txt_TenDaQuy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_KichThuocDaQuy = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btl_LamMoiDQ = new javax.swing.JButton();
        btn_XoaDQ = new javax.swing.JButton();
        btn_SuaDQ = new javax.swing.JButton();
        btn_ThemDQ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DaQuy = new javax.swing.JTable();
        ChatLieu = new javax.swing.JPanel();
        txt_MaChatLieu = new javax.swing.JTextField();
        txt_TenChatLieu = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_TyLeChatLieu = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btn_LamMoiCL = new javax.swing.JButton();
        btn_XoaCL = new javax.swing.JButton();
        btn_SuaCL = new javax.swing.JButton();
        btn_ThemCL = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_ChatLieu = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbo_MauSac = new javax.swing.JComboBox<String>();
        MauSac = new javax.swing.JPanel();
        txt_MaMauSac = new javax.swing.JTextField();
        txt_TenMauSac = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        btn_LamMoiMS = new javax.swing.JButton();
        btn_XoaMS = new javax.swing.JButton();
        btn_SuaMS = new javax.swing.JButton();
        btn_ThemMS = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_MauSac = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        SanPham = new javax.swing.JPanel();
        txt_MaSanPham = new javax.swing.JTextField();
        txt_TenSanPham = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        btn_LamMoiSP = new javax.swing.JButton();
        btn_XoaSP = new javax.swing.JButton();
        btn_SuaSP = new javax.swing.JButton();
        btn_ThemSP = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_SanPham = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rdo_Nam = new javax.swing.JRadioButton();
        rdo_Nu = new javax.swing.JRadioButton();
        rdo_Chung = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rdo_KinhDoanh = new javax.swing.JRadioButton();
        rdo_NgungKinhDoanh = new javax.swing.JRadioButton();
        MauSac1 = new javax.swing.JPanel();
        txt_MaSize = new javax.swing.JTextField();
        txt_Size = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        btn_LamMoiSize = new javax.swing.JButton();
        btn_XoaSize = new javax.swing.JButton();
        btn_SuaSize = new javax.swing.JButton();
        btn_Them = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        DaQuy.setBackground(new java.awt.Color(255, 255, 255));
        DaQuy.setPreferredSize(new java.awt.Dimension(800, 660));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Mã Đá Quý:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Tên Loại Đá:");

        txt_MaDaQuy.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_MaDaQuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaDaQuyActionPerformed(evt);
            }
        });

        txt_TenDaQuy.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_TenDaQuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenDaQuyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Kích Thước:");

        txt_KichThuocDaQuy.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_KichThuocDaQuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_KichThuocDaQuyActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        btl_LamMoiDQ.setBackground(new java.awt.Color(0, 153, 255));
        btl_LamMoiDQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        btl_LamMoiDQ.setText("Làm Mới");
        btl_LamMoiDQ.setBorder(null);

        btn_XoaDQ.setBackground(new java.awt.Color(255, 0, 0));
        btn_XoaDQ.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_XoaDQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btn_XoaDQ.setText("Xóa");
        btn_XoaDQ.setBorder(null);

        btn_SuaDQ.setBackground(new java.awt.Color(255, 255, 0));
        btn_SuaDQ.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_SuaDQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua-chua.png"))); // NOI18N
        btn_SuaDQ.setText("Sửa");
        btn_SuaDQ.setBorder(null);

        btn_ThemDQ.setBackground(new java.awt.Color(0, 204, 0));
        btn_ThemDQ.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_ThemDQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/luu.png"))); // NOI18N
        btn_ThemDQ.setText("Thêm");
        btn_ThemDQ.setBorder(null);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(btl_LamMoiDQ, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_XoaDQ, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_SuaDQ, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_ThemDQ, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btl_LamMoiDQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XoaDQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SuaDQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ThemDQ, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tbl_DaQuy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Đá Quý", "Tên Loại Đá", "Kích Thước"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_DaQuy);

        javax.swing.GroupLayout DaQuyLayout = new javax.swing.GroupLayout(DaQuy);
        DaQuy.setLayout(DaQuyLayout);
        DaQuyLayout.setHorizontalGroup(
            DaQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DaQuyLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(DaQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(DaQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TenDaQuy, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MaDaQuy, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_KichThuocDaQuy, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        DaQuyLayout.setVerticalGroup(
            DaQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DaQuyLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(DaQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_MaDaQuy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(DaQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenDaQuy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(DaQuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_KichThuocDaQuy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đá Quý", DaQuy);

        txt_MaChatLieu.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_MaChatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaChatLieuActionPerformed(evt);
            }
        });

        txt_TenChatLieu.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_TenChatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenChatLieuActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Tỷ Lệ:");

        txt_TyLeChatLieu.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_TyLeChatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TyLeChatLieuActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        btn_LamMoiCL.setBackground(new java.awt.Color(0, 153, 255));
        btn_LamMoiCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        btn_LamMoiCL.setText("Làm Mới");
        btn_LamMoiCL.setBorder(null);

        btn_XoaCL.setBackground(new java.awt.Color(255, 0, 0));
        btn_XoaCL.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_XoaCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btn_XoaCL.setText("Xóa");
        btn_XoaCL.setBorder(null);

        btn_SuaCL.setBackground(new java.awt.Color(255, 255, 0));
        btn_SuaCL.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_SuaCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua-chua.png"))); // NOI18N
        btn_SuaCL.setText("Sửa");
        btn_SuaCL.setBorder(null);

        btn_ThemCL.setBackground(new java.awt.Color(0, 204, 0));
        btn_ThemCL.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_ThemCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/luu.png"))); // NOI18N
        btn_ThemCL.setText("Thêm");
        btn_ThemCL.setBorder(null);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(btn_LamMoiCL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_XoaCL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_SuaCL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_ThemCL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_LamMoiCL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XoaCL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SuaCL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ThemCL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Mã Chất Liệu:");

        tbl_ChatLieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Chat Liệu", "Tên Chất Liệu", "Tỷ Lệ", "Mầu Sắc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_ChatLieu);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setText("Tên Chất Liệu:");

        jLabel11.setText("Màu Sắc:");

        javax.swing.GroupLayout ChatLieuLayout = new javax.swing.GroupLayout(ChatLieu);
        ChatLieu.setLayout(ChatLieuLayout);
        ChatLieuLayout.setHorizontalGroup(
            ChatLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(ChatLieuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(ChatLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40)
                .addGroup(ChatLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_TenChatLieu, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txt_MaChatLieu, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txt_TyLeChatLieu, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(cbo_MauSac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ChatLieuLayout.setVerticalGroup(
            ChatLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChatLieuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(ChatLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_MaChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ChatLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(ChatLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_TyLeChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ChatLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(90, 90, 90)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Chất Liệu", ChatLieu);

        txt_MaMauSac.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_MaMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaMauSacActionPerformed(evt);
            }
        });

        txt_TenMauSac.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_TenMauSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenMauSacActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        btn_LamMoiMS.setBackground(new java.awt.Color(0, 153, 255));
        btn_LamMoiMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        btn_LamMoiMS.setText("Làm Mới");
        btn_LamMoiMS.setBorder(null);

        btn_XoaMS.setBackground(new java.awt.Color(255, 0, 0));
        btn_XoaMS.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_XoaMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btn_XoaMS.setText("Xóa");
        btn_XoaMS.setBorder(null);

        btn_SuaMS.setBackground(new java.awt.Color(255, 255, 0));
        btn_SuaMS.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_SuaMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua-chua.png"))); // NOI18N
        btn_SuaMS.setText("Sửa");
        btn_SuaMS.setBorder(null);

        btn_ThemMS.setBackground(new java.awt.Color(0, 204, 0));
        btn_ThemMS.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_ThemMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/luu.png"))); // NOI18N
        btn_ThemMS.setText("Thêm");
        btn_ThemMS.setBorder(null);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(btn_LamMoiMS, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_XoaMS, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_SuaMS, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_ThemMS, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_LamMoiMS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XoaMS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SuaMS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ThemMS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setText("Mã Màu:");

        tbl_MauSac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Màu", "Tên Màu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbl_MauSac);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setText("Tên Màu:");

        javax.swing.GroupLayout MauSacLayout = new javax.swing.GroupLayout(MauSac);
        MauSac.setLayout(MauSacLayout);
        MauSacLayout.setHorizontalGroup(
            MauSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MauSacLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(MauSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(40, 40, 40)
                .addGroup(MauSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_TenMauSac, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txt_MaMauSac, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MauSacLayout.setVerticalGroup(
            MauSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MauSacLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(MauSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_MaMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(MauSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(190, 190, 190)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Màu Sắc", MauSac);

        txt_MaSanPham.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_MaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaSanPhamActionPerformed(evt);
            }
        });

        txt_TenSanPham.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_TenSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenSanPhamActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        btn_LamMoiSP.setBackground(new java.awt.Color(0, 153, 255));
        btn_LamMoiSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        btn_LamMoiSP.setText("Làm Mới");
        btn_LamMoiSP.setBorder(null);

        btn_XoaSP.setBackground(new java.awt.Color(255, 0, 0));
        btn_XoaSP.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_XoaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btn_XoaSP.setText("Xóa");
        btn_XoaSP.setBorder(null);

        btn_SuaSP.setBackground(new java.awt.Color(255, 255, 0));
        btn_SuaSP.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_SuaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua-chua.png"))); // NOI18N
        btn_SuaSP.setText("Sửa");
        btn_SuaSP.setBorder(null);

        btn_ThemSP.setBackground(new java.awt.Color(0, 204, 0));
        btn_ThemSP.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_ThemSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/luu.png"))); // NOI18N
        btn_ThemSP.setText("Thêm");
        btn_ThemSP.setBorder(null);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(btn_LamMoiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_XoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_SuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_ThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_LamMoiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setText("Mã Sản Phẩm:");

        tbl_SanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Giới Tính", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tbl_SanPham);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setText("Tên Sản Phẩm:");

        jLabel1.setText("Giới Tính:");

        buttonGroup1.add(rdo_Nam);
        rdo_Nam.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdo_Nam.setText("Nam");
        rdo_Nam.setBorder(null);

        buttonGroup1.add(rdo_Nu);
        rdo_Nu.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdo_Nu.setText("Nữ");
        rdo_Nu.setBorder(null);

        buttonGroup1.add(rdo_Chung);
        rdo_Chung.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdo_Chung.setText("Chung");
        rdo_Chung.setBorder(null);

        jLabel2.setText("Trạng Thái:");

        buttonGroup2.add(rdo_KinhDoanh);
        rdo_KinhDoanh.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdo_KinhDoanh.setText("Kinh Doanh");
        rdo_KinhDoanh.setBorder(null);

        buttonGroup2.add(rdo_NgungKinhDoanh);
        rdo_NgungKinhDoanh.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        rdo_NgungKinhDoanh.setText("Ngừng Kinh Doanh");
        rdo_NgungKinhDoanh.setBorder(null);

        javax.swing.GroupLayout SanPhamLayout = new javax.swing.GroupLayout(SanPham);
        SanPham.setLayout(SanPhamLayout);
        SanPhamLayout.setHorizontalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SanPhamLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addGap(40, 40, 40)
                .addGroup(SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SanPhamLayout.createSequentialGroup()
                        .addGroup(SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo_Nam)
                            .addComponent(rdo_KinhDoanh))
                        .addGroup(SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SanPhamLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(rdo_NgungKinhDoanh))
                            .addGroup(SanPhamLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(rdo_Nu)
                                .addGap(40, 40, 40)
                                .addComponent(rdo_Chung))))
                    .addComponent(txt_TenSanPham)
                    .addComponent(txt_MaSanPham))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SanPhamLayout.setVerticalGroup(
            SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SanPhamLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_MaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(20, 20, 20)
                .addGroup(SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rdo_Nam)
                    .addComponent(rdo_Nu)
                    .addComponent(rdo_Chung))
                .addGap(20, 20, 20)
                .addGroup(SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdo_KinhDoanh)
                    .addComponent(rdo_NgungKinhDoanh))
                .addGap(116, 116, 116)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sản Phẩm", SanPham);

        txt_MaSize.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_MaSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaSizeActionPerformed(evt);
            }
        });

        txt_Size.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_Size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SizeActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        btn_LamMoiSize.setBackground(new java.awt.Color(0, 153, 255));
        btn_LamMoiSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reset.png"))); // NOI18N
        btn_LamMoiSize.setText("Làm Mới");
        btn_LamMoiSize.setBorder(null);

        btn_XoaSize.setBackground(new java.awt.Color(255, 0, 0));
        btn_XoaSize.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_XoaSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btn_XoaSize.setText("Xóa");
        btn_XoaSize.setBorder(null);

        btn_SuaSize.setBackground(new java.awt.Color(255, 255, 0));
        btn_SuaSize.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_SuaSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua-chua.png"))); // NOI18N
        btn_SuaSize.setText("Sửa");
        btn_SuaSize.setBorder(null);

        btn_Them.setBackground(new java.awt.Color(0, 204, 0));
        btn_Them.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/luu.png"))); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.setBorder(null);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(btn_LamMoiSize, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_XoaSize, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_SuaSize, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_LamMoiSize, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XoaSize, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SuaSize, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setText("Mã Size:");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Size", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel18.setText("Size");

        javax.swing.GroupLayout MauSac1Layout = new javax.swing.GroupLayout(MauSac1);
        MauSac1.setLayout(MauSac1Layout);
        MauSac1Layout.setHorizontalGroup(
            MauSac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MauSac1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(MauSac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15))
                .addGap(40, 40, 40)
                .addGroup(MauSac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Size, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txt_MaSize, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MauSac1Layout.setVerticalGroup(
            MauSac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MauSac1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(MauSac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_MaSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(MauSac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Size, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(190, 190, 190)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Size", MauSac1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_KichThuocDaQuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_KichThuocDaQuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_KichThuocDaQuyActionPerformed

    private void txt_TenDaQuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenDaQuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenDaQuyActionPerformed

    private void txt_MaDaQuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaDaQuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaDaQuyActionPerformed

    private void txt_MaChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaChatLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaChatLieuActionPerformed

    private void txt_TenChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenChatLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenChatLieuActionPerformed

    private void txt_TyLeChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TyLeChatLieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TyLeChatLieuActionPerformed

    private void txt_MaMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaMauSacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaMauSacActionPerformed

    private void txt_TenMauSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenMauSacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenMauSacActionPerformed

    private void txt_MaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaSanPhamActionPerformed

    private void txt_TenSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenSanPhamActionPerformed

    private void txt_MaSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaSizeActionPerformed

    private void txt_SizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SizeActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLiDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLiDialog1 dialog = new QuanLiDialog1(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel ChatLieu;
    private javax.swing.JPanel DaQuy;
    private javax.swing.JPanel MauSac;
    private javax.swing.JPanel MauSac1;
    private javax.swing.JPanel SanPham;
    private javax.swing.JButton btl_LamMoiDQ;
    private javax.swing.JButton btn_LamMoiCL;
    private javax.swing.JButton btn_LamMoiMS;
    private javax.swing.JButton btn_LamMoiSP;
    private javax.swing.JButton btn_LamMoiSize;
    private javax.swing.JButton btn_SuaCL;
    private javax.swing.JButton btn_SuaDQ;
    private javax.swing.JButton btn_SuaMS;
    private javax.swing.JButton btn_SuaSP;
    private javax.swing.JButton btn_SuaSize;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_ThemCL;
    private javax.swing.JButton btn_ThemDQ;
    private javax.swing.JButton btn_ThemMS;
    private javax.swing.JButton btn_ThemSP;
    private javax.swing.JButton btn_XoaCL;
    private javax.swing.JButton btn_XoaDQ;
    private javax.swing.JButton btn_XoaMS;
    private javax.swing.JButton btn_XoaSP;
    private javax.swing.JButton btn_XoaSize;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbo_MauSac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable5;
    private javax.swing.JRadioButton rdo_Chung;
    private javax.swing.JRadioButton rdo_KinhDoanh;
    private javax.swing.JRadioButton rdo_Nam;
    private javax.swing.JRadioButton rdo_NgungKinhDoanh;
    private javax.swing.JRadioButton rdo_Nu;
    private javax.swing.JTable tbl_ChatLieu;
    private javax.swing.JTable tbl_DaQuy;
    private javax.swing.JTable tbl_MauSac;
    private javax.swing.JTable tbl_SanPham;
    private javax.swing.JTextField txt_KichThuocDaQuy;
    private javax.swing.JTextField txt_MaChatLieu;
    private javax.swing.JTextField txt_MaDaQuy;
    private javax.swing.JTextField txt_MaMauSac;
    private javax.swing.JTextField txt_MaSanPham;
    private javax.swing.JTextField txt_MaSize;
    private javax.swing.JTextField txt_Size;
    private javax.swing.JTextField txt_TenChatLieu;
    private javax.swing.JTextField txt_TenDaQuy;
    private javax.swing.JTextField txt_TenMauSac;
    private javax.swing.JTextField txt_TenSanPham;
    private javax.swing.JTextField txt_TyLeChatLieu;
    // End of variables declaration//GEN-END:variables
}
