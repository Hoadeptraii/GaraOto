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
public class ThemKhachhangDao {

    public static List<ThemKhachHangUser> ls = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();

    public List<ThemKhachHangUser> getAllSanPham() throws SQLException {
        List<ThemKhachHangUser> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT KHACHHANG.hoten, KHACHHANG.sodt, XE.tenxe ,XE.bienso,XE.idcar\n" +
"                    FROM KHACHHANG\n" +
"                    JOIN XE ON KHACHHANG.makh = XE.makh";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                ThemKhachHangUser sp = new ThemKhachHangUser();
                sp.setHoten(rs.getString(1));
                sp.setSdt(rs.getString(2));
                sp.setTenXe(rs.getString(3));
                sp.setBienso(rs.getString(4));
                 sp.setIdcar(rs.getString(5));
                ls.add(sp);
            }
        } catch (Exception e) {
//            System.err.println("Error : " + e.toString());
            e.printStackTrace();
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
