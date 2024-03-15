/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author HOANG SANG
 */
public class Users {
    private String manv;
    private String hoten;
    private boolean gioitinh;
    private String sodt;
    private String diachi;
    private String pass;
    private String roles;

    public Users() {
    }

    public Users(String manv, String hoten, boolean gioitinh, String sodt, String diachi, String pass, String roles) {
        this.manv = manv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.sodt = sodt;
        this.diachi = diachi;
        this.pass = pass;
        this.roles = roles;
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

    public boolean getGioitinh() {
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

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
    
    
}
