/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThemPhieuSua;

/**
 *
 * @author ASUS
 */
public class PhieuSuaOOP {
    private String id;
    private String tenkh;
    private String xe ;
    private String nhanvien ;
    private String time;
    private String dichvu ;
    private double giacong ;
    private String ncc ;
    private String LinhKien;
    private int  Soluong ;
    private double gia;
    private double TongTien;
    private String Noidung; 
    private String trangthai ;

    public PhieuSuaOOP() {
    }

    public PhieuSuaOOP(String id, String tenkh, String xe, String nhanvien, String time, String dichvu, double giacong, String ncc, String LinhKien, int Soluong, double gia, double TongTien, String Noidung, String trangthai) {
        this.id = id;
        this.tenkh = tenkh;
        this.xe = xe;
        this.nhanvien = nhanvien;
        this.time = time;
        this.dichvu = dichvu;
        this.giacong = giacong;
        this.ncc = ncc;
        this.LinhKien = LinhKien;
        this.Soluong = Soluong;
        this.gia = gia;
        this.TongTien = TongTien;
        this.Noidung = Noidung;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getXe() {
        return xe;
    }

    public void setXe(String xe) {
        this.xe = xe;
    }

    public String getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(String nhanvien) {
        this.nhanvien = nhanvien;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDichvu() {
        return dichvu;
    }

    public void setDichvu(String dichvu) {
        this.dichvu = dichvu;
    }

    public double getGiacong() {
        return giacong;
    }

    public void setGiacong(double giacong) {
        this.giacong = giacong;
    }

    public String getNcc() {
        return ncc;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    public String getLinhKien() {
        return LinhKien;
    }

    public void setLinhKien(String LinhKien) {
        this.LinhKien = LinhKien;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public String getNoidung() {
        return Noidung;
    }

    public void setNoidung(String Noidung) {
        this.Noidung = Noidung;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

}
