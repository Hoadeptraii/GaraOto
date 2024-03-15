/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Oop.Hoadon;
import data.ConnecSQL;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;
/**
 *
 * @author THUAT
 */
public class ThongKeDao implements Dao<Hoadon> {
data.ConnecSQL cn = new ConnecSQL();
    @Override
    public ArrayList<Hoadon> GetArrayList() {
        ArrayList<Hoadon> hd = new ArrayList<>();
        try {
           
            if(cn.getDBConnect()!=null){
                String sql="Select * from hoadon";
                Statement st = cn.getDBConnect().createStatement();
                ResultSet rs =st.executeQuery(sql);
                while (rs.next()) {                    
                    String ma = rs.getString("idHD");
                    Date ngay =rs.getDate("thoigian");
                    String masua =rs.getString("masua");
                    String Sodt = rs.getString("SoDT");
                    double tongtien=rs.getDouble("TongTien");
                    String hoten = rs.getString("hoten");
                    Hoadon ab = new Hoadon(ma, ngay, masua, Sodt, tongtien, hoten);
                    hd.add(ab);
                }
                rs.close();
                st.close();
            }
            cn.getDBConnect().close();
        } catch (Exception e) {
        }
        return hd;
    }
    //tìm hóa đơn theo tên
    public void SearchKhachhang(String x){
        try {
            if(cn.getDBConnect()!=null){
                String sql="Select * from hoadon where hoten=?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setString(1,"%"+x+"%");
                ResultSet rs=ps.executeQuery();
                while (rs.next()) {                    
                    String ma = rs.getString("idHD");
                    Date ngay =rs.getDate("thoigian");
                    String masua =rs.getString("masua");
                    String Sodt = rs.getString("SoDT");
                    String tongtien =rs.getString("TongTien");
                    String hoten = rs.getString("hoten");
                }
                ps.close();
            }
            cn.getDBConnect().close();
        } catch (Exception e) {
        }
    }
     public String TongtienTheoNGay(int x){
        String tongtien=null;
        try {
            if(cn.getDBConnect()!=null){
                String sql="Select Sum(tongtien)as Tongtien from HoaDon where day(thoigian)=?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setInt(1,x);
                ResultSet rs =ps.executeQuery();
              if(rs.next()){
                  tongtien =  rs.getString("Tongtien");
              }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongtien;
    }
    public String TongtienTheoThang(int x){
        String tongtien=null;
        try {
            if(cn.getDBConnect()!=null){
                String sql="Select Sum(tongtien)as Tongtien from HoaDon where month(thoigian)=?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setInt(1,x);
                ResultSet rs =ps.executeQuery();
              if(rs.next()){
                  tongtien =  rs.getString("Tongtien");
              }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongtien;
    }
    // tổng tiền
    public String Tongtien(){
        String tongtien=null;
        try {
            if(cn.getDBConnect()!=null){
                String sql="Select Sum(tongtien)as Tongtien from hoadon";
                Statement st = cn.getDBConnect().createStatement();
                ResultSet rs =st.executeQuery(sql);
                if(rs.next()){
                     tongtien =  rs.getString("Tongtien");
                }
            }
        } catch (Exception e) {
        }
        return tongtien;
    }
    // Tổng hóa đơn
     public String TongHoadon(){
        String tongtien=null;
        try {
            if(cn.getDBConnect()!=null){
                String sql="Select Count(*)as Tonghoadon from hoadon";
                Statement st = cn.getDBConnect().createStatement();
                ResultSet rs =st.executeQuery(sql);
              tongtien =  rs.getString("Tonghoadon");
            }
        } catch (Exception e) {
        }
        return tongtien;
    }
    
    public ArrayList<Hoadon> SearchDayMonYear(int day,int month,int year){
        ArrayList<Hoadon> hd = new ArrayList<>();
        try {
            if(cn.getDBConnect()!=null){
            String sql="Select * from HoaDon where day(thoigian)=? and month(thoigian)=? and year(thoigian)=?";
            PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
            ps.setInt(1, day);
            ps.setInt(2, month);
            ps.setInt(3, year);
            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String ma = rs.getString("idHD");
                    Date ngay =rs.getDate("thoigian");
                    String masua =rs.getString("masua");
                    String Sodt = rs.getString("SoDT");
                    double tongtien=rs.getDouble("TongTien");
                    String hoten = rs.getString("hoten");
                    Hoadon ab = new Hoadon(ma, ngay, masua, Sodt, tongtien, hoten);
                    hd.add(ab);
                }
            }
        } catch (Exception e) {
        }
        return hd;
    }
}
