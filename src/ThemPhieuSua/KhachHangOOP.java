/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThemPhieuSua;

/**
 *
 * @author ASUS
 */
public class KhachHangOOP {
    private String hoten;
    private String tenxe; 

    public KhachHangOOP() {
    }

    public KhachHangOOP(String hoten, String tenxe) {
        this.hoten = hoten;
        this.tenxe = tenxe;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }
    
}
