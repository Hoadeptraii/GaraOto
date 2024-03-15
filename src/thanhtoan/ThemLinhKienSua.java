/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

/**
 *
 * @author dauxu
 */
public class ThemLinhKienSua {
    private String Tencc;
    private  String TenPT;
     private  double gia  ;
      private   double soLuong ;
       private   double giaban ;

    public ThemLinhKienSua() {
    }

    public ThemLinhKienSua(String Tencc, String TenPT, double gia, double soLuong, double giaban) {
        this.Tencc = Tencc;
        this.TenPT = TenPT;
        this.gia = gia;
        this.soLuong = soLuong;
        this.giaban = giaban;
    }

    public String getTencc() {
        return Tencc;
    }

    public void setTencc(String Tencc) {
        this.Tencc = Tencc;
    }

    public String getTenPT() {
        return TenPT;
    }

    public void setTenPT(String TenPT) {
        this.TenPT = TenPT;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }
       
}
