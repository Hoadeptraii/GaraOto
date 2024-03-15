/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oop;

import java.util.Date;

/**
 *
 * @author THUAT
 */
public class NhaCungCap {
    private String mancc;
    private String tenncc;
    private boolean trangthai;

    public NhaCungCap() {
    }

    public NhaCungCap(String mancc, String tenncc, boolean trangthai) {
        this.mancc = mancc;
        this.tenncc = tenncc;
        this.trangthai = trangthai;
    }

    public String getMancc() {
        return mancc;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public String getTenncc() {
        return tenncc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    
    
    
}
