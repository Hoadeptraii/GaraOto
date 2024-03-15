/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author dauxu
 */
public class bangphieunhanDao implements Dao<bangphieunhan>{
data.ConnecSQL cn = new data.ConnecSQL();
    @Override
    public ArrayList<bangphieunhan> GetArrayList() {
        ArrayList<bangphieunhan> bpn= new ArrayList<>();
        
        return bpn;
    }
    public void addPN(String maphieu, String id, String idcong, double giacong, String noidung, double gia, double tongtien, boolean tinhtrang){
        try {
            String sql = "  INSERT INTO PHIEUSUA(masua,ID,thoigian, idCong,giacong,Noidung,gia,tongTien,tinhTrang)\n" +
"                    values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
            ps.setString(1, maphieu);
            ps.setString(2, id);
            ps.setDate(3, Date.valueOf(LocalDate.now()));
            ps.setString(4, idcong);
            ps.setDouble(5, giacong);
            ps.setString(6, noidung);
            ps.setDouble(7, gia);
            ps.setDouble(8, tongtien);
            ps.setBoolean(9,tinhtrang);
             int row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, " Thành Công !");
            } else {
                JOptionPane.showMessageDialog(null, "thất bại!");
            }
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}