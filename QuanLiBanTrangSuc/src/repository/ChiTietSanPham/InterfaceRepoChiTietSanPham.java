/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.ChiTietSanPham;

import java.util.List;
import model.ChiTietSanPham;
import model.GiaoDien.SanPham;
/**
 *
 * @author WINDOWS10
 */
public interface InterfaceRepoChiTietSanPham {
    public List<ChiTietSanPham> getAll();
    public List<ChiTietSanPham> getAllWithConditional (SanPham sp);
}
