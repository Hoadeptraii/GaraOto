/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dauxu
 */
public class ThemlinhkienDao {

    public static List<ThemlinhkienUse> ls = new ArrayList<>();
    DefaultTableModel modell = new DefaultTableModel();

    public List<ThemlinhkienUse> getAllSanPham() throws SQLException {
        List<ThemlinhkienUse> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT PHIEUSUA.masua, NHACUNGCAP.TenNcc, PHUTUNG.TenPhutung, PHUTUNG.gia, PHUTUNG.Soluong, PHUTUNG.giaban\n"
                    + "FROM NHACUNGCAP\n"
                    + "JOIN PHUTUNG ON NHACUNGCAP.MaNcc = PHUTUNG.MaNcc\n"
                    + "JOIN PHIEUSUA ON PHIEUSUA.mancc = NHACUNGCAP.MaNcc";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                ThemlinhkienUse sp = new ThemlinhkienUse();
                sp.setMasua(rs.getString(1));
                sp.setTencc(rs.getString(2));
                sp.setTenPT(rs.getString(3));
                sp.setGia(rs.getDouble(4));
                sp.setSoluong(rs.getInt(5));
                sp.setGiaban(rs.getDouble(6));
                ls.add(sp);
            }
        } catch (Exception e) {
            System.err.println("Error : " + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return ls;

    }
    
   public List<ThemLinhKienSua> getAllSanPhamm() throws SQLException {
        List<ThemLinhKienSua> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT NHACUNGCAP.TenNcc, PHUTUNG.TenPhutung, PHUTUNG.gia, PHUTUNG.Soluong, PHUTUNG.giaban\n" +
"                    FROM NHACUNGCAP\n" +
"                    JOIN PHUTUNG ON NHACUNGCAP.MaNcc = PHUTUNG.MaNcc";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                ThemLinhKienSua sp = new ThemLinhKienSua();         
                sp.setTencc(rs.getString(1));
                sp.setTenPT(rs.getString(2));
                sp.setGia(rs.getDouble(3));
                sp.setSoLuong(rs.getDouble(4));
                sp.setGiaban(rs.getDouble(5));
                ls.add(sp);
            }
        } catch (Exception e) {
            System.err.println("Error : " + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
                sttm.close();
            } catch (Exception e) {
            }
        }
        return ls;

    } 
    public void trulinhkien(){
        
    }
}
