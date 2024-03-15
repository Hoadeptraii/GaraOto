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
public class CongDAO {
     public static List<CongOOP> ls = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();

    public List<CongOOP> getAllCong() throws SQLException {
        List<CongOOP> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT Cong.tencong, Cong.giacong ";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                CongOOP sp = new CongOOP();
                sp.setTencong(rs.getString(1));
                sp.setGiacong(rs.getString(2));
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
