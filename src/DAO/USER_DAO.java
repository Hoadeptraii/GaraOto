/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.sql.*;
import java.util.ArrayList;
import model.Users;
import data.ConnecSQL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOANG SANG
 */
public class USER_DAO implements DAO_Interface<Users>{
    public static USER_DAO getInstance(){
        return new USER_DAO();
        }

    
    public Users getOjectById(String Ma ){
         Users aUsers= new Users();
        try {
           
            Connection conn = new ConnecSQL().getDBConnect();
            String sql="SELECT * FROM NHANVIEN WHERE Manv = ?";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setString(1, Ma);
            ResultSet rs= st.executeQuery();
            while (rs.next()) {                
                String Manv = rs.getString("Manv");
                String hoten = rs.getString("hoten");
                boolean gioitinh = rs.getBoolean("gioitinh");
                String sodt = rs.getString("sodt");
                String diachi = rs.getString("diachi");
                String pass = rs.getString("pass");
                String roles = rs.getString("roles");
                aUsers = new Users(Manv, hoten,gioitinh, sodt, diachi, pass, roles);
            }
           
        } catch (SQLException ex) {
            
        }
       return aUsers;
    }
    
    @Override
    public int Insert(Users t) {
        int rowAffected=0;
        try {
            Connection conn = new ConnecSQL().getDBConnect();
           String sql="INSERT INTO USER (manv,hoten,gioitinh,sodt,diachi,pass,roles) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
               st.setString(1,"manv");
               st.setString(2,"hoten");
               st.setString(3,"gioitinh");
               st.setString(4,"sodt");
               st.setString(5,"diachi");
               st.setString(6,"pass");
               st.setString(7,"roles");
                 rowAffected = st.executeUpdate();
                                     
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    return rowAffected ;
    }

    @Override
    public int Update(Users t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Clear(Users t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Users> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Users selectById(Users t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Users> selectByCondition(String Condition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
