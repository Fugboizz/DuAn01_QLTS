/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.until;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author HUNGpYN
 */
public interface DangNhapInteface {
    public void customizeButton(JButton button, int radius);
    public void showPassword(JPasswordField show, JLabel disable, JLabel enabled);
    public void hidePassword(JPasswordField show, JLabel disable, JLabel enabled);
}
