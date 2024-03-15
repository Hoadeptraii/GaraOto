/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import NHANVIEN.NhanVienOOP;
import Oop.XeOpp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dauxu
 */
public class Xepn {

    data.ConnecSQL cn = new data.ConnecSQL();
    public static ArrayList<NhanVienOOP> ls = new ArrayList<>();

    public ArrayList<XeOpp> findXe(String xe) {
        ArrayList<XeOpp> result = new ArrayList<>();
        try {
            String sql = " SELECT * FROM XE WHERE idcar = ? ";
            PreparedStatement st = cn.getDBConnect().prepareStatement(sql);
            st.setString(1,xe );
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String idxe = rs.getString("idcar");
                String makh = rs.getString("makh");
                String tenxe = rs.getString("tenxe");
                String bienso = rs.getString("bienso");
                XeOpp xee = new XeOpp(idxe, makh, tenxe, bienso);
                result.add(xee);
            }
            rs.close();;
            cn.getDBConnect().close();
        } catch (SQLException ex) {
              ex.printStackTrace();
        }
         return result;
        }
    }
