/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dauxu
 */
public class BangDichVuDao {

    public static List<BangDichVuUse> ls = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    data.ConnecSQL cn = new data.ConnecSQL();

    public List<BangDichVuUse> getAllSanPham() throws SQLException {
        List<BangDichVuUse> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "select PHIEUNHAN.ID,KHACHHANG.hoten,XE.idcar,PHIEUNHAN.thoigian,PHIEUNHAN.timehen,PHIEUNHAN.tinhtrangIn\n"
                    + "FROM PHIEUNHAN\n"
                    + "JOIN XE ON XE.idcar = PHIEUNHAN.idcar\n"
                    + "jOIN KHACHHANG ON KHACHHANG.makh = XE.makh";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                BangDichVuUse sp = new BangDichVuUse();
                sp.setID(rs.getString(1));
                sp.setKH(rs.getString(2));
                sp.setIdcar(rs.getString(3));
                sp.setTime(rs.getDate(4));
                sp.setTimeout(rs.getDate(5));
                sp.setNoidung(rs.getString(6));
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

    public String MaKH() {
        String makH = null;
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT count(ID) as 'soluong' FROM PHIEUNHAN";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                int soma = rs.getInt("soluong");
                String somaString = String.format("%03d", soma + 1);
                makH = "PN" + somaString;
            }

        } catch (Exception e) {
        }
        return makH;
    }

    public void AddPhieu(String ID, String idcar, String KH, Date time, Date Timeout, String noidung) {
        try {
            String sql = "INSERT INTO PHIEUNHAN (ID, idcar, thoigian, timehen,tinhtrangIn)\n"
                    + "SELECT ?, ?, ?, ? , ? \n"
                    + "WHERE EXISTS (SELECT 1 FROM XE WHERE idcar = ?)";
            PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, idcar);
            ps.setDate(3, new java.sql.Date(time.getTime())); // Chuyển đổi java.util.Date thành java.sql.Date
            ps.setDate(4, new java.sql.Date(Timeout.getTime()));
            ps.setString(5, noidung);
            ps.setString(6, idcar);
            int row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, " Thành Công !");
            } else {
                JOptionPane.showMessageDialog(null, "thất bại!");
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
