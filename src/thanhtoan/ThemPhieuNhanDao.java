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
public class ThemPhieuNhanDao {

    public static List<ThemPhieuNhanUse> ls = new ArrayList<>();
    DefaultTableModel modelll = new DefaultTableModel();

    public List<ThemPhieuNhanUse> getAllSanPham() throws SQLException {
        List<ThemPhieuNhanUse> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
                        String sSQL = "SELECT PHIEUSUA.masua,PHIEUSUA.ID, KHACHHANG.hoten, KHACHHANG.sodt, XE.tenxe,PHIEUNHAN.thoigian , PHIEUNHAN.timehen,PHIEUSUA.tinhTrang,PHIEUSUA.Noidung\n"
                    + "FROM PHIEUNHAN\n"
                    + "JOIN XE ON XE.idcar =  PHIEUNHAN.idcar\n"
                    + "JOIN KHACHHANG ON KHACHHANG.makh = XE.makh\n"
                    + "JOIN PHIEUSUA ON PHIEUNHAN.ID = PHIEUSUA.ID ";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                ThemPhieuNhanUse sp = new ThemPhieuNhanUse();
                sp.setIdRecep(rs.getString(1));
                sp.setIdPN(rs.getString(2));
                sp.setTenkh(rs.getString(3));
                sp.setSdt(rs.getString(4));
                sp.setXe(rs.getString(5));
                sp.setTimevao(rs.getString(6));
                sp.setTimehen(rs.getString(7));
                sp.setTinhTrang(rs.getString(8));
//                sp.setTongTien(rs.getDouble(8));
                sp.setNoidung(rs.getString(9));
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
