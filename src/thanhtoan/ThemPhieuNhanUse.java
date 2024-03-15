/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

/**
 *
 * @author dauxu
 */
public class ThemPhieuNhanUse {
   private String idRecep;
   private String idPN;
    private String tenkh;
    private String sdt;
    private String xe ;
    private String timevao;
    private String timehen;
    private String TinhTrang;
    private double TongTien;
    private String Noidung; 

    public ThemPhieuNhanUse() {
    }

    public ThemPhieuNhanUse(String idRecep, String idPN, String tenkh, String sdt, String xe, String timevao, String timehen, String TinhTrang, double TongTien, String Noidung) {
        this.idRecep = idRecep;
        this.idPN = idPN;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.xe = xe;
        this.timevao = timevao;
        this.timehen = timehen;
        this.TinhTrang = TinhTrang;
        this.TongTien = TongTien;
        this.Noidung = Noidung;
    }

    public String getIdRecep() {
        return idRecep;
    }

    public void setIdRecep(String idRecep) {
        this.idRecep = idRecep;
    }

    public String getIdPN() {
        return idPN;
    }

    public void setIdPN(String idPN) {
        this.idPN = idPN;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getXe() {
        return xe;
    }

    public void setXe(String xe) {
        this.xe = xe;
    }

    public String getTimevao() {
        return timevao;
    }

    public void setTimevao(String timevao) {
        this.timevao = timevao;
    }

    public String getTimehen() {
        return timehen;
    }

    public void setTimehen(String timehen) {
        this.timehen = timehen;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
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

    
   
    
}
