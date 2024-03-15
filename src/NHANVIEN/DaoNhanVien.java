/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NHANVIEN;

import DAO.Dao;
import NHANVIEN.NhanVienOOP;
import Frame.*;
import java.sql.*;
import java.util.ArrayList;
import Oop.*;
import duanmau1.*;
import duanmau1.TrangChuNVV;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author HOANG SANG
 */
public class DaoNhanVien implements Dao<NhanVienOOP> {

    public static ArrayList<NhanVienOOP> ls = new ArrayList<>();
    data.ConnecSQL cn = new data.ConnecSQL();

    public NhanVienOOP getOjectById(String Ma) {
        NhanVienOOP aUsers = new NhanVienOOP();
        try {
            String sql = "SELECT * FROM NHANVIEN WHERE Manv = ?";
            PreparedStatement st = cn.getDBConnect().prepareStatement(sql);
            st.setString(1, Ma);
            ResultSet rs = st.executeQuery();
            while (rs.next() && rs.getInt(1) == 0) {
                String Manv = rs.getString("Manv");
                String hoten = rs.getString("TenNv");
                boolean gioitinh = rs.getBoolean("Gioitinh");
                String sodt = rs.getString("Sodt");
                String email = rs.getString("Email");
                String diachi = rs.getString("Diachi");
                String pass = rs.getString("pass");
                String roles = rs.getString("roles");
                String vitri = rs.getString("vitri");
                Date ngaynhanviec = Date.valueOf(LocalDate.now());
                Date ngayketthuc = null;
                String idcong = rs.getString("idcong");
                aUsers = new NhanVienOOP(Manv, hoten, gioitinh, sodt, email, diachi, pass, roles, vitri, ngaynhanviec, ngayketthuc, idcong);
            }

        } catch (SQLException ex) {

        }
        return aUsers;
    }

    public ArrayList<NhanVienOOP> getAllNHANVIEN() {
        String tv = "SELECT * FROM NHANVIEN";
        try {
            Connection con = data.ConnecSQL.getDBConnect();
            PreparedStatement ps = con.prepareStatement(tv);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienOOP nv = new NhanVienOOP();
                nv.setManv(rs.getString(1));
                nv.setHoten(rs.getString(2));
                nv.setGioitinh(rs.getBoolean(3));
                nv.setSodt(rs.getString(4));
                nv.setEmail(rs.getString(5));
                nv.setDiachi(rs.getString(6));
                nv.setPass(rs.getString(7));
                nv.setRoles(rs.getString(8));
                nv.setVitri(rs.getString(9));
                nv.setNgaynhanviec(rs.getDate(10));
                nv.setNgaynghiviec(rs.getDate(11));
                nv.setIdcong(rs.getString(12));
                ls.add(nv);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ls;
    }

    public void dangnhap(String email, String pass) {
        try {
            PreparedStatement ps = cn.getDBConnect().prepareStatement("SELECT * FROM NHANVIEN  WHERE email = ? AND pass = ?");
            ps.setString(1, email);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(pass);
                if (rs.getString("roles").equalsIgnoreCase("QuanLy")) {
                    TrangChu tc = new TrangChu();
                    tc.idnv(rs.getString("Manv"));
                    tc.setVisible(true);
                } else {
                    TrangChuNVV tcnv = new TrangChuNVV();
                    tcnv.setid(rs.getString("Manv"));
                    tcnv.setVisible(true);

                }
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "Email Khong ton tai");
            }
            // Đóng kết nối

            cn.getDBConnect().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String ManvAUTO() {
        String manv = null;
        try {
            String sql = "Select count(manv) as manv from NHANVIEN";
            Statement st = cn.getDBConnect().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int ma = rs.getInt(1);
                String auto = String.format("%03d", ma + 1);
                manv = "NV" + auto;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return manv;
    }
    public String tongnv(){
        String tongnv="";
        try {
            String sql = "SELECT count(*) as tongnv FROM NHANVIEN where ngaynghiviec is Null";
            Statement st = cn.getDBConnect().createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                tongnv=rs.getString("tongnv");
            }
        } catch (Exception e) {
        }
        return tongnv;
    }
    public void ADDNhanvien(String ma, String hoten, boolean gt, String sdt, String email, String diachi, String password, String role, String vitri) {
        try {
            String sql = "SELECT * FROM NHANVIEN WHERE Manv = ?";
            PreparedStatement st = cn.getDBConnect().prepareStatement(sql);
            st.setString(1, ma);
            ResultSet rs = st.executeQuery();
            // Kiểm tra xem mã nhân viên đã tồn tại hay chưa
            if (!rs.next()) {
                // Mã nhân viên không tồn tại, thêm nhân viên mới vào database
                String sqlInsert = "INSERT INTO NHANVIEN (Manv, hoten, Gioitinh, Sodt, Email, Diachi, pass, roles,vitri, ngaynhanviec, ngaynghiviec,idcong) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sqlInsert);
                ps.setString(1, ma);
                ps.setString(2, hoten);
                ps.setBoolean(3, gt);
                ps.setString(4, sdt);
                ps.setString(5, email);
                ps.setString(6, diachi);
                ps.setString(7, password);
                ps.setString(8, role);
                ps.setString(9, vitri);
                ps.setDate(10, Date.valueOf(LocalDate.now()));
                ps.setDate(11, null); // Chú ý, sử dụng tham số Date ketthuc ở đây
                ps.setString(12, null);
                int row = ps.executeUpdate();
                if (row > 0) {
                    JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công!");
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm nhân viên thất bại!");
                }

                ps.close();
            } else {
                // Mã nhân viên đã tồn tại, hiển thị thông báo lỗi
                JOptionPane.showMessageDialog(null, "Mã nhân viên đã tồn tại trong cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

            rs.close();
            cn.getDBConnect().close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<NhanVienOOP> findNhanVienByTen(String ten) {
        ArrayList<NhanVienOOP> result = new ArrayList<>();
        try {
            String sql = "SELECT * FROM NHANVIEN WHERE hoten LIKE ?";
            PreparedStatement st = cn.getDBConnect().prepareStatement(sql);
            st.setString(1, "%" + ten + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String maNhanVien = rs.getString("Manv");
                String hoTen = rs.getString("hoten");
                boolean gioiTinh = rs.getBoolean("Gioitinh");
                String sdt = rs.getString("Sodt");
                String email = rs.getString("Email");
                String diaChi = rs.getString("Diachi");
                String password = rs.getString("pass");
                String role = rs.getString("roles");
                String vitri = rs.getString("vitri");
                Date ngayNhanViec = rs.getDate("ngaynhanviec");
                Date ngayNghiViec = rs.getDate("ngaynghiviec");
                String idcong = rs.getString("idcong");
                NhanVienOOP nv = new NhanVienOOP(maNhanVien, hoTen, gioiTinh, sdt, email, diaChi, password, role, vitri, ngayNhanViec, ngayNghiViec, idcong);
                result.add(nv);
            }

            rs.close();
            cn.getDBConnect().close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public void deleteNhanvien(String manv) throws SQLException {
        try {
            String sql = "DELETE FROM NHANVIEN WHERE Manv = ?";
            PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
            ps.setString(1, manv);

            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Xóa nhân viên thành công!");
            } else {
                System.out.println("Không tìm thấy nhân viên có mã " + manv + " để xóa!");
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("Đã xảy ra lỗi khi xóa nhân viên!");
            throw ex;
        } finally {
            cn.getDBConnect().close();
        }
    }

    public String Manv() {
        String Manv = null;
        try {
            if (cn.getDBConnect() != null) {
                String sql = "SELECT count(Manv) as 'soluong' FROM NHANVIEN ";
                Statement st = cn.getDBConnect().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    int soma = rs.getInt("soluong");
                    String somaString = String.format("%03d", soma + 1);
                    Manv = "NV" + somaString;
                }
            }
        } catch (Exception e) {
        }
        return Manv;
    }

    public void UPdateMk(String mk, String email) {
        try {
            if (cn.getDBConnect() != null) {
                String sql = "UPDATE NHANVIEN SET pass = ? WHERE Email = ?";
                PreparedStatement ps = cn.getDBConnect().prepareStatement(sql);
                ps.setString(1, mk);
                ps.setString(2, email);
                int row = ps.executeUpdate();
                if (row > 0) {
                    JOptionPane.showMessageDialog(null, "Thành Công");
                } else {
                    JOptionPane.showMessageDialog(null, "Thất Bại");
                }
                ps.close();
                cn.getDBConnect().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean update(NhanVienOOP nv) {
        ArrayList<NhanVienOOP> ls = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //  String ma = .getText();
            String tv = "UPDATE NHANVIEN SET HOTEN = ?, GIOITINH = ?, SODT = ?, EMAIL = ?, DIACHI = ?, PASS = ?, ROLES = ?, VITRI = ?, NGAYNHANVIEC = ?, NGAYNGHIVIEC = ? WHERE MANV = ?";
            conn = data.ConnecSQL.getDBConnect();
            PreparedStatement ps = conn.prepareStatement(tv);

            ps.setString(1, nv.getHoten());
            boolean gt;
            if (ls.get(0).isGioitinh()) {
                gt = true;
            } else {
                gt = false;
            }
            ps.setBoolean(2, gt);
            ps.setString(3, nv.getSodt());
            ps.setString(4, nv.getEmail());
            ps.setString(5, nv.getDiachi());
            ps.setString(6, nv.getPass());
            ps.setString(7, nv.getRoles());
            ps.setString(8, nv.getVitri());
            ps.setDate(9, (Date) nv.getNgaynhanviec());
            ps.setDate(10, (Date) nv.getNgaynghiviec());
            ps.setString(11, nv.getManv());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean save(NhanVienOOP nv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String tv = "INSERT INTO NHANVIEN VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            conn = data.ConnecSQL.getDBConnect();
            PreparedStatement ps = conn.prepareStatement(tv);
            ps.setString(1, nv.getManv());
            ps.setString(2, nv.getHoten());
            ps.setBoolean(3, nv.isGioitinh());
            ps.setString(4, nv.getSodt());
            ps.setString(5, nv.getEmail());
            ps.setString(6, nv.getDiachi());
            ps.setString(7, nv.getPass());
            ps.setString(8, nv.getRoles());
            ps.setString(9, nv.getVitri());
            ps.setDate(10, (Date) nv.getNgaynhanviec());
            ps.setDate(11, (Date) nv.getNgaynghiviec());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }

    @Override
    public ArrayList<NhanVienOOP> GetArrayList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
