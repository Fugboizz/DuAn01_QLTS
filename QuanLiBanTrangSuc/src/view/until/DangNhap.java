/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.until;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author HUNGpYN
 */
public class DangNhap implements DangNhapInteface {

    @Override
    public void customizeButton(JButton button, int radius) {
        button.setBackground(Color.WHITE);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);

        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        button.setUI(new javax.swing.plaf.basic.BasicButtonUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(button.getBackground());
                g2.fill(new RoundRectangle2D.Float(0, 0, c.getWidth(), c.getHeight(), radius, radius));
                // Bỏ phần vẽ viền để không có viền đen xung quanh nút
                // g2.setColor(button.getForeground());
                // g2.draw(new RoundRectangle2D.Float(0, 0, c.getWidth(), c.getHeight(), radius, radius));
                super.paint(g, c);
            }

            @Override
            public boolean contains(JComponent c, int x, int y) {
                Shape shape = new RoundRectangle2D.Float(0, 0, c.getWidth(), c.getHeight(), radius, radius);
                return shape.contains(x, y);
            }
        });
    }

    @Override
    public void showPassword(JPasswordField show, JLabel disable, JLabel enabled) {
        show.setEchoChar((char) 0);
        disable.setVisible(false);
        disable.setEnabled(false);
        enabled.setVisible(true);
        enabled.setEnabled(true);
    }

    @Override
    public void hidePassword(JPasswordField show, JLabel disable, JLabel enabled) {
        show.setEchoChar((char) 8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        enabled.setVisible(false);
        enabled.setEnabled(false);  
    }
}
