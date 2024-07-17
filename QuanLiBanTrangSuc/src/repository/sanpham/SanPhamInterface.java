/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.sanpham;

import java.util.List;
import model.SanPham;

/**
 *
 * @author HUNGpYN
 */
public interface SanPhamInterface {
    public List<SanPham> getAll();
    public int creat(SanPham sp);
    public int update(SanPham sp);
    public int delete(SanPham sp);
}
