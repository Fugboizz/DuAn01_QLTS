/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.sanpham;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HUNGpYN
 */
public class SanPhamService implements SanPhamServiceInterface {

    @Override
    public void chonAnh(JLabel label) {
        JFileChooser filechooser = new JFileChooser();
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        filechooser.setDialogTitle("Chọn Ảnh");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg");
        filechooser.setFileFilter(filter);
        int result = filechooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = filechooser.getSelectedFile();
            selectedFile = selectedFile.getAbsoluteFile();
            String link = selectedFile.getAbsolutePath();
            try {
                Image img = ImageIO.read(selectedFile);
                
                if (img != null) {
                    label.setIcon(new ImageIcon(img.getScaledInstance((label.getWidth() - 2), (label.getHeight() - 2), Image.SCALE_SMOOTH)));
                    label.setHorizontalAlignment(JLabel.CENTER);
                    label.putClientProperty("imagepath", link);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
