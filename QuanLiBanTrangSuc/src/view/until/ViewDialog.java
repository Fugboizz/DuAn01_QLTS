/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.until;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author HUNGpYN
 */
public class ViewDialog implements ViewDialogInterface {

    @Override
    public void fontText(JTextField textField) {
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY);
        textField.setBorder(border);
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Border khi focus vào
                textField.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 255)));
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Border khi focus ra
                textField.setBorder(border);
            }
        });
    }

    @Override
    public void fontBtn(JButton button) {
        button.setBorderPainted(false); // loại bỏ viền của button
        button.setFocusPainted(false); // loại bỏ hiệu ứng focus (nếu có)
    }

    @Override
    public void fontLabel(JLabel label) {
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY);
        label.setBorder(border);
    }

    @Override
    public void fontTextThongTin(JTextField textField) {
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY);
        textField.setBorder(border);
        textField.setEditable(false);
    }

    @Override
    public void fontTextArea(JTextArea textArea) {
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY);
        textArea.setBorder(border);
        textArea.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Border khi focus vào
                textArea.setBorder(BorderFactory.createLineBorder(new Color(102, 102, 255)));
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Border khi focus ra
                textArea.setBorder(border);
            }
        });
    }

    @Override
    public void fontextAreaThongTin(JTextArea textArea) {
        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY);
        textArea.setBorder(border);
        textArea.setEditable(false);
    }
}
