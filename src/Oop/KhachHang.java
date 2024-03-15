/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oop;

/**
 *
 * @author THUAT
 */
public class KhachHang {
    private String makh;
    private String hoten;
    private boolean gt;
    private String sdt;
    private String diachi;

    public KhachHang() {
    }

    public KhachHang(String makh, String hoten, boolean gt, String sdt, String diachi) {
        this.makh = makh;
        this.hoten = hoten;
        this.gt = gt;
        this.sdt = sdt;
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

    public boolean isGt() {
        return gt;
    }

    public void setGt(boolean gt) {
        this.gt = gt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    

    
    
}
