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
public class Customer {
    private String makh;
    private String hoten;
    private String gioitinh;
    private int sodt;
    private String diachi;

    public Customer() {
    }

    public Customer(String makh, String hoten, String gioitinh, int sodt, String diachi) {
        this.makh = makh;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.sodt = sodt;
        this.diachi = diachi;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getSodt() {
        return sodt;
    }

    public void setSodt(int sodt) {
        this.sodt = sodt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
   
    
}
