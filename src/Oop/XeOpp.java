/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oop;

/**
 *
 * @author dauxu
 */
public class XeOpp {
    private String idcar;
    private String mahk;
    private String tenxe ;
    private String bienso;

    public XeOpp() {
    }

    public XeOpp(String idcar, String mahk, String tenxe, String bienso) {
        this.idcar = idcar;
        this.mahk = mahk;
        this.tenxe = tenxe;
        this.bienso = bienso;
    }

    public String getIdcar() {
        return idcar;
    }

    public void setIdcar(String idcar) {
        this.idcar = idcar;
    }

    public String getMahk() {
        return mahk;
    }

    public void setMahk(String mahk) {
        this.mahk = mahk;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }
    
}
