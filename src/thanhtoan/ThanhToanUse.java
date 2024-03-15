/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

import java.sql.Connection;
import java.sql.Date;
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
public class ThanhToanUse {

    public static List<thanhtoan.ThanhtoanDao> ls = new ArrayList<>();
//    DefaultTableModel model = new DefaultTableModel();
    data.ConnecSQL cn = new data.ConnecSQL();

    public List<thanhtoan.ThanhtoanDao> getAllSanPham() throws SQLException {
        List<thanhtoan.ThanhtoanDao> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "Select * from HOADON ";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                ThanhtoanDao sp = new ThanhtoanDao();
                sp.setMaHD(rs.getString(1));
                sp.setHoten(rs.getString(2));
                sp.setMasua(rs.getString(3));
                sp.setSodienthoai(rs.getString(4));
                sp.setTime(rs.getString(5));
                sp.setTongTien(rs.getString(6));
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
            String sql = "SELECT count(idHD) as 'soluong' FROM HoaDon ";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                int soma = rs.getInt("soluong");
                String somaString = String.format("%03d", soma + 1);
                makH = "HD" + somaString;
            }

        } catch (Exception e) {
        }
        return makH;
    }
    public String MaPN(){
        String maPN = null;
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
          try {
            String sql = "SELECT count(masua) as 'soluong' FROM PHIEUSUA ";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                int soma = rs.getInt("soluong");
                String somaString = String.format("%03d", soma + 1);
                maPN = "PN" + somaString;
            }

        } catch (Exception e) {
        }
        return maPN;
    }
    public String MaSua(){
        String maPN = null;
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
          try {
            String sql = "SELECT count(idCong) as 'soluong' FROM CONG ";
            conn = data.ConnecSQL.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                int soma = rs.getInt("soluong");
                String somaString = String.format("%03d", soma + 1);
                maPN = "CS" + somaString;
            }

        } catch (Exception e) {
        }
        return maPN;
    }
//              data.ConnecSQL cn = new data.ConnecSQL();                    
      public void  addHoaDon (String maHD, Date Time, String masua, String sdt, String tongtien, String hoten){
          try {
             
                  String sqlInsert = "INSERT INTO HOADON (idHD,thoigian,masua,SoDT,tongtien, hoten) values(?,?,?,?,?,?)";
                   PreparedStatement ps = cn.getDBConnect().prepareStatement(sqlInsert);
                   ps.setString(1,maHD);
                    ps.setDate(2,Time);
                     ps.setString(3,masua);
                      ps.setString(4,sdt);
                       ps.setString(5,tongtien);
                        ps.setString(6,masua);
                        int row = ps.executeUpdate();
                        if(row > 0 ){
                             JOptionPane.showMessageDialog(null, "Thanh Toán Thành Công !");
                        }else {
                             JOptionPane.showMessageDialog(null, "thất bại!");
                        }
                        ps.close();
          } catch (SQLException e) {
               e.printStackTrace();
          }
          
      }

    public void save(ThanhtoanDao hd) throws SQLException {
        try {
            Connection con = data.ConnecSQL.getDBConnect();
            String tv = "INSERT INTO HOADON (idHD,thoigian,masua,SoDT,TongTien,hoten) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(tv);
            ps.setString(1, hd.getMaHD());
            ps.setString(2, hd.getTime());
            ps.setString(3, hd.getMasua());
            ps.setString(4, hd.getSodienthoai());
            ps.setString(5, hd.getTongTien());
            ps.setString(6, hd.getHoten());
            int rowsAffected = ps.executeUpdate();
            ps.close();;
            con.close();
            
        } catch (Exception e) {
               e.printStackTrace();
            
        }
       
    }
}
