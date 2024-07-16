/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.chatlieu;

import java.util.List;
import model.ChatLieu;

/**
 *
 * @author HUNGpYN
 */
public interface ChatLieuInterface {
        public List<ChatLieu> getAll();
    public int creat();
    public int update();
    public int delete();
}
