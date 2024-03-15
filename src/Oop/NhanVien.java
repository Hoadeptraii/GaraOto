/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Oop;

import java.util.Date;

/**
 *
 * @author HOANG SANG
 */
public class NhanVien {
    private String manv;
    private String hoten;
    private boolean gioitinh;
    private String sodt;
    private String email;
    private String diachi;
    private String pass;
    private boolean roles;
    private Date ngaynhanviec;
    private Date ngaynghiviec;
    

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, boolean gioitinh, String sodt, String email, String diachi, String pass, boolean roles, Date ngaynhanviec, Date ngaynghiviec) {
        this.manv = manv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.sodt = sodt;
        this.email = email;
        this.diachi = diachi;
        this.pass = pass;
        this.roles = roles;
        this.ngaynhanviec = ngaynhanviec;
        this.ngaynghiviec = ngaynghiviec;
        
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isRoles() {
        return roles;
    }

    public void setRoles(boolean roles) {
        this.roles = roles;
    }

    public Date getNgaynhanviec() {
        return ngaynhanviec;
    }

    public void setNgaynhanviec(Date ngaynhanviec) {
        this.ngaynhanviec = ngaynhanviec;
    }

    public Date getNgaynghiviec() {
        return ngaynghiviec;
    }

    public void setNgaynghiviec(Date ngaynghiviec) {
        this.ngaynghiviec = ngaynghiviec;
    }

    

    
    

   
    
    
}
