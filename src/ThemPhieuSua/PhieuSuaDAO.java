/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThemPhieuSua;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class PhieuSuaDAO {
    public static List<PhieuSuaOOP> ls = new ArrayList<>();
    DefaultTableModel modelll = new DefaultTableModel();

    public List<PhieuSuaOOP> getAllSanPham() throws SQLException {
        List<PhieuSuaOOP> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT PHIEUSUA.masua, KHACHHANG.hoten, XE.tenxe,NHANVIEN.hoten,PHIEUNHAN.thoigian, Cong.tenCong, Cong.giacong ,NHACUNGCAP.tenncc,PHUTUNG.tenphutung,PHUTUNG.gia,PHUTUNG.soLuong,Repair.tongTien,Repair.Noidung,Repair.Trangthai \n "
                    + "FROM PHIEUSUA"
                    + " JOIN XE ON XE.idcar =  PHIEUNHAN.idcar "
                    + " JOIN KHACHHANG ON KHACHHANG.makh = XE.makh "
                    + " JOIN NHACUNGCAP ON PHIEUSUA.MANCC = NHACUNGCAP.MANCC ";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                PhieuSuaOOP sp = new PhieuSuaOOP();
                sp.setId(rs.getString(1));
                sp.setTenkh(rs.getString(2));
                sp.setXe(rs.getString(3));
                sp.setNhanvien(rs.getString(4));
                sp.setTime(rs.getString(5));
                sp.setDichvu(rs.getString(6));
                sp.setGiacong(rs.getDouble(7));
                sp.setNcc(rs.getString(8));
                sp.setLinhKien(rs.getString(9));
                sp.setSoluong(rs.getInt(10));
                sp.setGia(rs.getDouble(11));
                sp.setTongTien(rs.getDouble(12));
                sp.setNoidung(rs.getString(13));
                sp.setTrangthai(rs.getString(14));
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
