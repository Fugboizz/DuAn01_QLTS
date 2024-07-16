package view.dangnhap;

import view.main.Main;
import javax.swing.JOptionPane;
import view.model.TaiKhoan;
import view.until.DangNhap;
import repository.dangnhap.DangNhapRepository;

public class DangNhapView extends javax.swing.JFrame {

    public static boolean roleDN;
    public static String nameDN;
    DangNhap dn = new DangNhap();
    DangNhapRepository dnp = new DangNhapRepository();

    public DangNhapView() {
        initComponents();
        setLocationRelativeTo(null);
        txt_TaiKhoan.setBackground(new java.awt.Color(0, 0, 0, 1));
        txt_MatKhau.setBackground(new java.awt.Color(0, 0, 0, 1));
        dn.customizeButton(btn_DangNhap, 30);
        lbl_enable.setVisible(false);
        txt_MatKhau.setEchoChar((char) 8226);
    }

//    public boolean checkRole() {
//        char[] password = txt_MatKhau.getPassword();
//        String matKhau = new String(password);
//        TaiKhoan tk = dnp.checkTaiKhoan(txt_TaiKhoan.getText(), matKhau);
//        return role = tk.isChucVu();
//    }
//
//    public String checkName() {
//        char[] password = txt_MatKhau.getPassword();
//        String matKhau = new String(password);
//        TaiKhoan tk = dnp.checkTaiKhoan(txt_TaiKhoan.getText(), matKhau);
//        return name = tk.getHoTen();
//    }
//
//    public boolean isRole() {
//        return role;
//    }
//
//    public String getNameDN() {
//        return name;
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtlabe = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_DangNhap = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_TaiKhoan = new javax.swing.JTextField();
        lbl_disable = new javax.swing.JLabel();
        lbl_enable = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_MatKhau = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 18, 129, 96));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("ĐĂNG NHẬP");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 78, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 0, 32, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 0));
        jLabel5.setText("Tài Khoản");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 143, 327, -1));

        txtlabe.setText("___________________________________");
        jPanel2.add(txtlabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 250, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 0));
        jLabel7.setText("Mật khẩu");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 240, 361, -1));

        btn_DangNhap.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_DangNhap.setForeground(new java.awt.Color(102, 102, 0));
        btn_DangNhap.setText("Đăng Nhập");
        btn_DangNhap.setBorder(null);
        btn_DangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_DangNhap.setRequestFocusEnabled(false);
        btn_DangNhap.setRolloverEnabled(false);
        btn_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhapActionPerformed(evt);
            }
        });
        jPanel2.add(btn_DangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 201, 42));

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Quên mật khẩu");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        txt_TaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_TaiKhoan.setBorder(null);
        txt_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TaiKhoanActionPerformed(evt);
            }
        });
        jPanel2.add(txt_TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 240, 30));

        lbl_disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye.png"))); // NOI18N
        lbl_disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_disableMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        lbl_enable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view.png"))); // NOI18N
        lbl_enable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_enable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_enableMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_enable, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        jLabel11.setText("___________________________________");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 250, 20));

        txt_MatKhau.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt_MatKhau.setBorder(null);
        txt_MatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MatKhauActionPerformed(evt);
            }
        });
        jPanel2.add(txt_MatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 250, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 430, 450));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nhan.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhapActionPerformed
        // TODO add your handling code here:
        //Chuyen matkhau ve kieu string
        char[] password = txt_MatKhau.getPassword();
        String matKhau = new String(password);
        TaiKhoan tk = dnp.checkTaiKhoan(txt_TaiKhoan.getText(), matKhau);
        if (tk == null) {
            JOptionPane.showMessageDialog(null, "Tai khoan hoac mat khau ko dung");
            return;
        }
        JOptionPane.showMessageDialog(null, "Dang nhap thanh cong");
        nameDN = tk.getHoTen();
        roleDN = tk.isChucVu();
        Main main = new view.main.Main();
        main.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_DangNhapActionPerformed

    private void txt_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TaiKhoanActionPerformed

    private void txt_MatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MatKhauActionPerformed

    private void lbl_enableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_enableMouseClicked

        dn.hidePassword(txt_MatKhau, lbl_disable, lbl_enable);
    }//GEN-LAST:event_lbl_enableMouseClicked

    private void lbl_disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_disableMouseClicked
        dn.showPassword(txt_MatKhau, lbl_disable, lbl_enable);
    }//GEN-LAST:event_lbl_disableMouseClicked

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
            java.util.logging.Logger.getLogger(DangNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_disable;
    private javax.swing.JLabel lbl_enable;
    private javax.swing.JPasswordField txt_MatKhau;
    private javax.swing.JTextField txt_TaiKhoan;
    private javax.swing.JLabel txtlabe;
    // End of variables declaration//GEN-END:variables
}
