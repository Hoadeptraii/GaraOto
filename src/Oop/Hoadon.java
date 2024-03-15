/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oop;

import java.util.Date;

/**
 *
 * @author THUAT
 */
public class Hoadon {
    private String mahd;
    private Date ngay;
    private String masua;
    private String sodt;
    private double tongtien;
    private String hoten;

    public Hoadon() {
    }

    public Hoadon(String mahd, Date ngay, String masua, String sodt, double tongtien, String hoten) {
        this.mahd = mahd;
        this.ngay = ngay;
        this.masua = masua;
        this.sodt = sodt;
        this.tongtien = tongtien;
        this.hoten = hoten;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getMasua() {
        return masua;
    }

    public void setMasua(String masua) {
        this.masua = masua;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    
}
