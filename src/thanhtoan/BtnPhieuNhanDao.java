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
public class BtnPhieuNhanDao {

    public static List<BntPhieuNhanUse> ls = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();

    public List<BntPhieuNhanUse> getAllSanPham() throws SQLException {
        List<BntPhieuNhanUse> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT * from PHIEUNHAN";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                BntPhieuNhanUse sp = new BntPhieuNhanUse();
                sp.setID(rs.getString(1));
                sp.setIdcar(rs.getString(2));
                sp.setTime(rs.getString(3));
                sp.setTimeout(rs.getString(4));
                sp.setTinhTrangIn(rs.getString(5));
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
//    public String InHoaDon(){
//        
//    }
}
