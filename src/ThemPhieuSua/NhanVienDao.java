 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThemPhieuSua;

import NHANVIEN.NhanVienOOP;
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
public class NhanVienDao {

    public static List<NhanVienOOP> ls = new ArrayList<>();
    DefaultTableModel modellll = new DefaultTableModel();

    public List<NhanVienOOP> getAllNhanVien() throws SQLException {
        List<NhanVienOOP> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT NHANVIEN.manv,NHANVIEN.hoten \n"
                    + "from NHANVIEN ";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                NhanVienOOP sp = new NhanVienOOP();
                sp.setManv(rs.getString(1));
                sp.setHoten(rs.getString(2));
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
