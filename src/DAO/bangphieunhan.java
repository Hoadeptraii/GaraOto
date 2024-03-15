/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.Date;

/**
 *
 * @author dauxu
 */
public class bangphieunhan {
    private String maphieu;
    private String id;
    private String idcong;
    private double giacong;
    private String noidung;
    private double gia;
    private double tongtien;
    private boolean tinhtrang;

    public bangphieunhan() {
    }

    public bangphieunhan(String maphieu, String id, String idcong, double giacong, String noidung, double gia, double tongtien, boolean tinhtrang) {
        this.maphieu = maphieu;
        this.id = id;
       
        this.idcong = idcong;
        this.giacong = giacong;
        this.noidung = noidung;

        this.gia = gia;
        this.tongtien = tongtien;
        this.tinhtrang = tinhtrang;
    }

    public String getMaphieu() {
        return maphieu;
    }

    public void setMaphieu(String maphieu) {
        this.maphieu = maphieu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getIdcong() {
        return idcong;
    }

    public void setIdcong(String idcong) {
        this.idcong = idcong;
    }

    public double getGiacong() {
        return giacong;
    }

    public void setGiacong(double giacong) {
        this.giacong = giacong;
    }

 

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public boolean isTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(boolean tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    
}
