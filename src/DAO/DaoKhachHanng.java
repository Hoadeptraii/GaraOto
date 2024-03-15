/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Oop.Cars;
import Oop.KhachHang;
import com.mysql.cj.conf.ConnectionUrlParser;
import com.sun.accessibility.internal.resources.accessibility;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

public class DaoKhachHanng implements Dao<KhachHang> {

    data.ConnecSQL cn = new data.ConnecSQL();

    @Override
    public ArrayList<KhachHang> GetArrayList() {
        ArrayList<KhachHang> kh = new ArrayList<>();
        try {
            if (cn.getDBConnect() == null) {
                cn.getDBConnect().close();
            } else {
                Statement st = cn.getDBConnect().createStatement();
                String sqlkh = "select * from KHACHHANG";
                ResultSet rs = st.executeQuery(sqlkh);
                while (rs.next()) {
                    String ma = rs.getString("makh");
                    String name = rs.getString("hoten");
                    boolean gt = rs.getBoolean("gioitinh");
                    String sdt = rs.getString("sodt");
                    String diachi = rs.getString("diachi");
                    KhachHang kh1 = new KhachHang(ma, name, gt, sdt, diachi);
                    kh.add(kh1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kh;
    }

    public ArrayList<Cars> GetAllCars() {
        ArrayList<Cars> car = new ArrayList<>();
        try {
            if (cn.getDBConnect() != null) {
                Statement st = cn.getDBConnect().createStatement();
                String sqlkh = "select * from Cars";
                ResultSet rss = st.executeQuery(sqlkh);
                while (rss.next()) {
                    String idcars = rss.getString("idcar");
                    String makh = rss.getString("makh");
                    String sdt = rss.getString("tenxe");
                    String diachi = rss.getString("bienso");
                    Cars cars = new Cars(idcars, makh, sdt, diachi);
                    car.add(cars);
                }
            }
        } catch (Exception e) {
        }
        return car;
    }

    public void addKhachHang(String ma, String name, boolean gt, String sdt, String diachi, String idcar, String tenxe, String bienso) {
        try {
            if (cn.getDBConnect() != null) {
                String checkSql = "SELECT COUNT(*) FROM KHACHHANG WHERE makh = ?";
                PreparedStatement check = cn.getDBConnect().prepareStatement(checkSql);
                check.setString(1, ma);
                ResultSet rs = check.executeQuery();
                if (rs.next() && rs.getInt(1) == 0) {
                    String sqlkh = "INSERT INTO KHACHHANG (makh, hoten, gioitinh, sodt, diachi) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement ps = cn.getDBConnect().prepareStatement(sqlkh);
                    ps.setString(1, ma);
                    ps.setString(2, name);
                    ps.setBoolean(3, gt);
                    ps.setString(4, sdt);
                    ps.setString(5, diachi);
                    int row = ps.executeUpdate();
                    if (row > 0) {
                        JOptionPane.showMessageDialog(null, "Thêm Thành Công");

                    } else {
                        JOptionPane.showMessageDialog(null, "Có Lỗi Thêm Vào Bảng Khách hàng");
                    }
                    ps.close();
                }
                rs.close();
                cn.getDBConnect().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void AddCar(String idcar,String makh,String tenxe,String bienso){
        try {
            if(cn.getDBConnect()!=null){
                 String checkSql = "SELECT COUNT(*) FROM XE WHERE bienso = ?";
                PreparedStatement check = cn.getDBConnect().prepareStatement(checkSql);
                check.setString(1, bienso);
                ResultSet rs = check.executeQuery();
                if(rs.next()&&rs.getInt(1) == 0){
                String InsertSql="Insert into XE (idcar,makh,tenxe,bienso) values(?,?,?,?)";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(InsertSql);
                ps.setString(1, idcar);
                ps.setString(2, makh);
                ps.setString(3, tenxe);
                ps.setString(4, bienso);
                int Insert=ps.executeUpdate();
                if(Insert>0){
                    JOptionPane.showMessageDialog(null, "Đã Thêm Xe"+bienso);
                }else{
                    JOptionPane.showMessageDialog(null, "Không Thành Công");
                }
                ps.close();
                cn.getDBConnect().close();
                }else{
                    JOptionPane.showMessageDialog(null, "khách hàng đã Có Xe Này"+bienso);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteCustorm(String x) {
        try {
            if (cn.getDBConnect() != null) {
                String checkSql = "SELECT COUNT(*) FROM KHACHHANG WHERE makh = ?";
                PreparedStatement check = cn.getDBConnect().prepareStatement(checkSql);
                check.setString(1, x);
                ResultSet rs = check.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    String sql = "Delete XE where Makh=? delete KHACHHANG where makh=? ";
                    PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                    ps.setString(1, x);
                    ps.setString(2, x);
                    int row = ps.executeUpdate();
                    if (row == 0) {
                        JOptionPane.showMessageDialog(null, "Xóa Thành CÔng Khách: " + x);
                    } else {
                        JOptionPane.showMessageDialog(null, "Xóa Thành Công Khách: " + x);
                    }
                    ps.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Khách Hàng Không tồn Tại");
                }
                rs.close();
                cn.getDBConnect().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void UpdateCus(String hoten,boolean gt,String sodt,String diachi,String makh){
        try {
            if(cn.getDBConnect()!=null){
                String sql="Update KHACHHANG set hoten=? gt=? sodt=? diachi=?  where makh=? ";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setString(1, hoten);
                ps.setBoolean(2, gt);
                ps.setString(3, sodt);
                ps.setString(4, diachi);
                ps.setString(5, makh);
                int a=ps.executeUpdate();
                if(a>0){
                    JOptionPane.showMessageDialog(null, "Thành Công");
                }else{
                    JOptionPane.showMessageDialog(null, "Thất Bại");
                }
            }
        } catch (Exception e) {
        }
    }
    public void UpdateCar(){
        
    }

    public void DeleteCars(String x) {
        try {
            if (cn.getDBConnect() != null) {
                String sql = "Delete XE where bienso=? ";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setString(1, ""+x+"");
                int row = ps.executeUpdate();
                if (row == 0) {
                    JOptionPane.showMessageDialog(null, "Xóa Thành CÔng Xe: " + x);
                } else {
                    JOptionPane.showMessageDialog(null, "Xóa Thành Công Xe: " + x);
                }
                ps.close();
                cn.getDBConnect().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ConnectionUrlParser.Pair< ArrayList<KhachHang>,ArrayList<Cars> >SearchCustomers(String x) {
        ArrayList<KhachHang> kh = new ArrayList<>();
        ArrayList<Cars> car = new ArrayList<>();
        try {
            if (cn.getDBConnect() == null) {
                cn.getDBConnect().close();
            } else {
                String sqlkh = "select * from KHACHHANG inner join XE on XE.makh=KHACHHANG.makh where bienso like ?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sqlkh);
                ps.setString(1, "%"+x+"%");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String ma = rs.getString("makh");
                    String name = rs.getString("hoten");
                    boolean gt = rs.getBoolean("gioitinh");
                    String sdt = rs.getString("sodt");
                    String diachi = rs.getString("diachi");
                    String idcar=rs.getString("idcar");
                    String tenxe=rs.getString("tenxe");
                    String bienso=rs.getString("bienso");
                    KhachHang Customers = new KhachHang(ma, name, gt, sdt, diachi);
                    Cars ec = new Cars(idcar, ma, tenxe, bienso);
                    kh.add(Customers);
                    car.add(ec);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
        return new ConnectionUrlParser.Pair<>(kh,car);
    }
    public ArrayList<KhachHang> searchKhachHangs(String x) {
        ArrayList<KhachHang> kh = new ArrayList<>();
        try {
             String sqlkh = "select * from KHACHHANG where hoten like ?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sqlkh);
                ps.setString(1, "%"+x+"%");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String ma = rs.getString("makh");
                    String name = rs.getString("hoten");
                    boolean gt = rs.getBoolean("gioitinh");
                    String sdt = rs.getString("sodt");
                    String diachi = rs.getString("diachi");
                    String idcar=rs.getString("idcar");
                    String tenxe=rs.getString("tenxe");
                    String bienso=rs.getString("bienso");
                    KhachHang Customers = new KhachHang(ma, name, gt, sdt, diachi);
                    Cars ec = new Cars(idcar, ma, tenxe, bienso);
                    kh.add(Customers);
                }     
        } catch (Exception e) {
        }
        return kh;
    }
    public String MaKH() {
        String makH = null;
        try {
            if (cn.getDBConnect() != null) {
                String sql = "SELECT count(makh) as 'soluong' FROM KHACHHANG ";
                Statement st = cn.getDBConnect().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    int soma = rs.getInt("soluong");
                    String somaString = String.format("%03d", soma + 1);
                    makH = "KH" + somaString;
                }
            }
        } catch (Exception e) {
        }
        return makH;
    }

    public void InsertCustorms(String makh, String name,boolean gt,String sodt, String diachi) {
        try {
            if (cn.getDBConnect() != null) {
                String slq = "Select count(*) FROM KHACHHANG WHERE makh = ?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(slq);
                ps.setString(1, makh);
                ResultSet value = ps.executeQuery();
                if (value.next() && value.getInt(1)!=1) {
                    String sqlCustomers = "Insert into KHACHHANG (makh,hoten,gioitinh,sodt,diachi) values (?,?,?,?,?)";
                    PreparedStatement Customers = cn.getDBConnect().prepareStatement(sqlCustomers);
                    Customers.setString(1, makh);
                    Customers.setString(2, name);
                    Customers.setBoolean(3, gt);
                    Customers.setString(4, sodt);
                    Customers.setString(5, diachi);
                    int Customer = Customers.executeUpdate();
                    if(Customer>0){
                        JOptionPane.showMessageDialog(null, "Thêm Thành Công");
                    }else{
                        JOptionPane.showMessageDialog(null, "Thêm Thất Bại");
                    }
                    Customers.close();
                    cn.getDBConnect().close();
                } else {
                    JOptionPane.showMessageDialog(null, "Khách Hàng Không Tồn Tại");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public ArrayList<Cars> getObjectById(String id) {
        ArrayList<Cars> carCus = new ArrayList<>();
        try {
            if (cn.getDBConnect() != null) {
                String sql = "Select * from XE where makh= ?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setString(1,id);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String idcars = rs.getString("idcar");
                    String makh = rs.getString("makh");
                    String sdt = rs.getString("tenxe");
                    String diachi = rs.getString("bienso");
                    Cars cars = new Cars(idcars, makh, sdt, diachi);
                    carCus.add(cars);
                }
            }
        } catch (Exception e) {
        }
        return carCus;
    }
}
