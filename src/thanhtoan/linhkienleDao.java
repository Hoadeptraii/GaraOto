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
public class linhkienleDao {

    public static List<linhkienleUse> ls = new ArrayList<>();
    DefaultTableModel modell = new DefaultTableModel();

    public List<linhkienleUse> getAllSanPham() throws SQLException {
        List<linhkienleUse> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT NHACUNGCAP.TenNcc, PHUTUNG.TenPhutung, PHUTUNG.gia, PHUTUNG.Soluong, PHUTUNG.giaban\n"
                    + "FROM NHACUNGCAP\n"
                    + "JOIN PHUTUNG ON NHACUNGCAP.MaNcc = PHUTUNG.MaNcc";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                linhkienleUse sp = new linhkienleUse();
                sp.setTencc(rs.getString(1));
                sp.setTenPT(rs.getString(2));
                sp.setGia(rs.getDouble(3));
                sp.setSoluong(rs.getInt(4));
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
}
