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
public class LinhKienDAO {
     public static List<LinhKienOOP> ls = new ArrayList<>();
     DefaultTableModel modell = new DefaultTableModel();
     
      public  List<LinhKienOOP> getAllLinhKien() throws SQLException{
        List<LinhKienOOP> ls = new ArrayList<>();
        Connection conn = null;
         Statement sttm = null;
        ResultSet rs = null;
          try {
              String sSQL = "SELECT NHACUNGCAP.tenncc, PHUTUNG.tenphutung, PHUTUNG.giaban, PHUTUNG.soluong \n"
                      + "FROM NHACUNGCAP " + "JOIN PHUTUNG ON NHACUNGCAP.mancc = PHUTUNG.mancc";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                LinhKienOOP sp = new LinhKienOOP();                
                sp.setTencc(rs.getString(1));
                sp.setLinhkien(rs.getString(2));
                sp.setSoluong(rs.getInt(4));
                sp.setTien(rs.getDouble(3));
                ls.add(sp);           
          }
          } catch (Exception e) {
                   System.err.println("Error : "+e.toString());
                  }finally{
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
