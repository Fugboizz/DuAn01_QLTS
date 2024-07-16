/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import javax.swing.JDialog;
import view.main.Main;

/**
 *
 * @author HUNGpYN
 */
public class GiaoDienService implements GiaoDienServiceInterface {

    @Override
    public void clicked(JDialog dialog) {
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

}
