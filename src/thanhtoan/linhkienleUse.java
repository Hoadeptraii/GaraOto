/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

/**
 *
 * @author dauxu
 */
public class linhkienleUse {
    private String tencc;
    private String tenPT;
    private double gia;
    private int soluong;
    private double giaban;

    public linhkienleUse() {
    }

    public linhkienleUse(String tencc, String tenPT, double gia, int soluong, double giaban) {
        this.tencc = tencc;
        this.tenPT = tenPT;
        this.gia = gia;
        this.soluong = soluong;
        this.giaban = giaban;
    }

    public String getTencc() {
        return tencc;
    }

    public void setTencc(String tencc) {
        this.tencc = tencc;
    }

    public String getTenPT() {
        return tenPT;
    }

    public void setTenPT(String tenPT) {
        this.tenPT = tenPT;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }
    
}
