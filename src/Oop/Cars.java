/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oop;

/**
 *
 * @author THUAT
 */
public class Cars {
    private String idcar;
    private String makh;
    private String tenxe;
    private String bienso;

    public Cars() {
    }

    public Cars(String idcar, String makh, String tenxe, String bienso) {
        this.idcar = idcar;
        this.makh = makh;
        this.tenxe = tenxe;
        this.bienso = bienso;
    }

    public String getIdcar() {
        return idcar;
    }

    public void setIdcar(String idcar) {
        this.idcar = idcar;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
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
