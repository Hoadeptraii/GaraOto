/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Oop.Phutung;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author THUAT
 */
public class DaoPhutung implements Dao<Phutung>{
data.ConnecSQL cn = new data.ConnecSQL();
    @Override
    public ArrayList<Phutung> GetArrayList() {
        ArrayList<Phutung> sp = new ArrayList<>();;
        try {
            if(cn.getDBConnect()!=null){
                String sql="select * from PHUTUNG";
                Statement st = cn.getDBConnect().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {                    
                    String ma = rs.getString("MaNcc");
                    String ten=rs.getString("Tenphutung");
                    double gia=rs.getDouble("gia");
                    int soluong = rs.getInt("soluong");
                    double giaban=rs.getDouble("giaban");
                    Phutung pt = new Phutung(ma, ten, gia, soluong,giaban);
                    sp.add(pt);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sp;
     }
    public void ADDPhutung(String mancc,String ten ,double gia, int soluong,double giaban){
         try {
            if(cn.getDBConnect()!=null){
                String sql=" insert into PhuTung(MaNcc,TenPhutung,gia,soluong,giaban) values(?,?,?,?,?)";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setString(1, mancc);
                ps.setString(2, ten);
                ps.setDouble(3, gia);
                ps.setInt(4, soluong);
                ps.setDouble(5, giaban);
                int p=ps.executeUpdate();
                if(p>0){
                    JOptionPane.showMessageDialog(null, "Thành Công");
                }else{
                    JOptionPane.showMessageDialog(null, "không Thành công");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void DeleteSanpham(String x){
        try {
             String sql = " delete from PhuTung where TenPhutung MaNcc=?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setString(1, x);
                int update = ps.executeUpdate();
                if (update > 0) {
                    JOptionPane.showMessageDialog(null, "Thành CÔng");
                } else {
                    JOptionPane.showMessageDialog(null, "Thất Bại");
                }
        } catch (Exception e) {
        }
    }
    public ArrayList<Phutung> Search(String x){
         ArrayList<Phutung> sp = new ArrayList<>();
        try {
            if(cn.getDBConnect()!=null){
                String sql="select * from PhuTung where MaNcc=?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setString(1, x);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {                    
                    String ma = rs.getString("MaNcc");
                    String ten=rs.getString("Tenphutung");
                    double gia=rs.getDouble("gia");
                    int soluong = rs.getInt("soluong");
                    double giaban=rs.getDouble("giaban");
                    Phutung pt = new Phutung(ma, ten, gia, soluong,giaban);
                    sp.add(pt);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sp;
    }
    public void Delete(String x){
        try {
            if(cn.getDBConnect()!=null){
                String sql="Delete PhuTung where TenPhutung like ?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setString(1,"%"+x+"%");
                int pc=  ps.executeUpdate();
                if(pc>0){
                    JOptionPane.showMessageDialog(null, "Được");
                }else{
                    JOptionPane.showMessageDialog(null, "khong Được");
                }
                }
             } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String tong(){
        String a=null;
        try {
            if(cn.getDBConnect()!=null){
                String sql="Select Sum(soluong) as soluongsp from phutung";
                Statement st = cn.getDBConnect().createStatement();
                ResultSet rs =st.executeQuery(sql);
                while (rs.next()) {                    
                    a=rs.getString("soluongsp");
                }
            }
        } catch (Exception e) {
        }
        return a;
    }
    public ArrayList<Phutung> tim2cai(int x,int a){
        ArrayList<Phutung> sp1 = new ArrayList<>();
        try {
            if(cn.getDBConnect()!=null){
                String sql="Select * from PhuTung where Soluong<=? and gia<=?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setInt(1,x);
                ps.setInt(2,a);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {                    
                    String ma = rs.getString("MaNccPhuTung");
                    String ten=rs.getString("Tenphutung");
                    double gia=rs.getDouble("gia");
                    int soluong = rs.getInt("soluong");
                    double giaban=rs.getDouble("giaban");
                    Phutung pt = new Phutung(ma, ten, gia, soluong,giaban);
                    sp1.add(pt);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sp1;
    }
    
    public ArrayList<Phutung> tim(String x){
        ArrayList<Phutung> sp1 = new ArrayList<>();
        try {
            if(cn.getDBConnect()!=null){
                String sql="select * from PhuTung where Tenphutung like ?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setString(1,"%"+x+"%");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {                    
                    String ma = rs.getString("MaNcc");
                    String ten=rs.getString("Tenphutung");
                    double gia=rs.getDouble("gia");
                    int soluong = rs.getInt("soluong");
                    double giaban=rs.getDouble("giaban");
                    Phutung pt = new Phutung(ma, ten, gia, soluong,giaban);
                    sp1.add(pt);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sp1;
    }
}
