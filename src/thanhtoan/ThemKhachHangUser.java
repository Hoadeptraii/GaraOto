/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

/**
 *
 * @author dauxu
 */
public class ThemKhachHangUser {
    private String hoten;
    private String sdt ;
    private String tenXe; 
    private String bienso;
    private String idcar;

    public ThemKhachHangUser() {
    }

    public ThemKhachHangUser(String hoten, String sdt, String tenXe, String bienso, String idcar) {
        this.hoten = hoten;
        this.sdt = sdt;
        this.tenXe = tenXe;
        this.bienso = bienso;
        this.idcar = idcar;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getIdcar() {
        return idcar;
    }

    public void setIdcar(String idcar) {
        this.idcar = idcar;
    }
   
    
}
