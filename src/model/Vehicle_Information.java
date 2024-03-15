/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author HOANG SANG
 */
public class Vehicle_Information {
    private String idxe;
    private String makh;
    private String tenxe;
    private String bienso;

    public Vehicle_Information() {
    }

    public Vehicle_Information(String idxe, String makh, String tenxe, String bienso) {
        this.idxe = idxe;
        this.makh = makh;
        this.tenxe = tenxe;
        this.bienso = bienso;
    }

    public String getIdxe() {
        return idxe;
    }

    public void setIdxe(String idxe) {
        this.idxe = idxe;
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
