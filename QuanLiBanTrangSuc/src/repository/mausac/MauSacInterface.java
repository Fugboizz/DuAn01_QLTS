/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.mausac;

import java.util.List;
import model.MauSac;

/**
 *
 * @author HUNGpYN
 */
public interface MauSacInterface {
        public List<MauSac> getAll();
    public int creat();
    public int update();
    public int delete();
}