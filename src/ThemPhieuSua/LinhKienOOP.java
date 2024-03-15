/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThemPhieuSua;

/**
 *
 * @author ASUS
 */
public class LinhKienOOP {
    private String linhkien;
    private String tencc;
    private double tien;
    private int soluong;

    public LinhKienOOP() {
    }

    public LinhKienOOP(String linhkien, String tencc, double tien, int soluong) {
        this.linhkien = linhkien;
        this.tencc = tencc;
        this.tien = tien;
        this.soluong = soluong;
    }

    public String getLinhkien() {
        return linhkien;
    }

    public void setLinhkien(String linhkien) {
        this.linhkien = linhkien;
    }

    public String getTencc() {
        return tencc;
    }

    public void setTencc(String tencc) {
        this.tencc = tencc;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
}
