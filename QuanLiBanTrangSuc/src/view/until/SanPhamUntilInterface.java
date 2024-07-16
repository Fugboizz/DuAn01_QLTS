/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package view.until;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author HUNGpYN
 */
public interface SanPhamUntilInterface {
           public void addSize(JComboBox cbo);
   public void addLoaiSanPham(JComboBox cbo);
   public void addChatLieu(JComboBox cbo);
   public void addTenDa(JComboBox cbo);
   public void addXuatXu(JComboBox cbo);
   public void addKiemDinh(JComboBox cbo);
   public void addMauSac(JComboBox cbo);
   public void lamMoiText(JTextField text);
   public void lamMoiCbo(JComboBox cbo);
}
