/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.nguongoc;

import java.util.List;
import model.NguonGoc;

/**
 *
 * @author HUNGpYN
 */
public interface NguonGocInterface {
        public List<NguonGoc> getAll();

    public int creat();

    public int update();

    public int delete();
}
