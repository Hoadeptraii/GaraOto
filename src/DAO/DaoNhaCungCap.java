/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Oop.NhaCungCap;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author THUAT
 */
public class DaoNhaCungCap implements Dao<NhaCungCap> {

    data.ConnecSQL cn = new data.ConnecSQL();

    @Override
    public ArrayList<NhaCungCap> GetArrayList() {
        ArrayList<NhaCungCap> ncc = new ArrayList<>();
        try {
            if (cn.getDBConnect() != null) {
                String sql = "Select * from Nhacungcap";
                Statement st = cn.getDBConnect().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String ma = rs.getString("MaNcc");
                    String name = rs.getString("TenNCC");
                    boolean trangthai = rs.getBoolean("trangthai");
                    NhaCungCap nc = new NhaCungCap(ma, name, trangthai);
                    ncc.add(nc);
                }
            }
        } catch (Exception e) {
        }
        return ncc;
    }
    

    public void AddNhaCungCap(String ma, String name, boolean trangthai) {
        try {
            if (cn.getDBConnect() != null) {
                    String checkSql = "SELECT count(*) FROM Nhacungcap WHERE MaNcc = ?";
                PreparedStatement check = cn.getDBConnect().prepareStatement(checkSql);
                check.setString(1, ma);
                ResultSet rs = check.executeQuery();
                if (rs.next() &&rs.getInt(1)==0) {
                    String sql = "insert into Nhacungcap(MaNcc,TenNcc,trangthai) values(?,?,?)";
                    PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                    ps.setString(1, ma);
                    ps.setString(2, name);
                    ps.setBoolean(3, true);
                    int p = ps.executeUpdate();
                    if (p > 0) {
                        JOptionPane.showMessageDialog(null, "Thành Công");
                    } else {
                        JOptionPane.showMessageDialog(null, "không Thành công");
                    }
                    rs.close();
                    ps.close();
                
                }else{
                    JOptionPane.showMessageDialog(null, "khong ton tai");
                }
                cn.getDBConnect().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void UpdateNhaCungCap(String mancc) {
        try {
            if (cn.getDBConnect() != null) {
                String sql1="SELECT Mancc,Trangthai FROM Nhacungcap WHERE MaNcc = ?";
                PreparedStatement pst = cn.getDBConnect().prepareStatement(sql1);
                pst.setString(1, mancc);
                ResultSet rs = pst.executeQuery();
                if(rs.next()&& rs.getInt(2)==1){
                String sql = "Update Nhacungcap Set trangthai=? where MaNcc=?";
                PreparedStatement psc = cn.getDBConnect().prepareStatement(sql);
                psc.setBoolean(1, false);
                psc.setString(2, mancc);
                int updatec = psc.executeUpdate();
                if (updatec > 0) {
                    JOptionPane.showMessageDialog(null, "Thành CÔng");
                } else {
                    JOptionPane.showMessageDialog(null, "Thất Bại");
                }
                }else{
                String sql = "Update Nhacungcap Set trangthai=? where MaNcc=?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setBoolean(1, true);
                ps.setString(2, mancc);
                int update = ps.executeUpdate();
                if (update > 0) {
                    JOptionPane.showMessageDialog(null, "Thành CÔng");
                } else {
                    JOptionPane.showMessageDialog(null, "Thất Bại");
                }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String MaNCC() {
        String Mancc = null;
        try {
            if (cn.getDBConnect() != null) {
                String sql = "SELECT count(Mancc) as 'soluong' FROM nhacungcap ";
                Statement st = cn.getDBConnect().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    int soma = rs.getInt("soluong");
                    String somaString = String.format("%03d", soma + 1);
                    Mancc = "NCC" + somaString;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Mancc;
    }
}
