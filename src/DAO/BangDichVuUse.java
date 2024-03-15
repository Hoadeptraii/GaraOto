/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.Date;

/**
 *
 * @author dauxu
 */
public class BangDichVuUse {
    private  String ID ;
     private  String idcar ;
    private String KH ;
    private Date time;
    private Date Timeout ; 
    private String noidung;

    public BangDichVuUse() {
    }

    public BangDichVuUse(String ID, String idcar, String KH, Date time, Date Timeout, String noidung) {
        this.ID = ID;
        this.idcar = idcar;
        this.KH = KH;
        this.time = time;
        this.Timeout = Timeout;
        this.noidung = noidung;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIdcar() {
        return idcar;
    }

    public void setIdcar(String idcar) {
        this.idcar = idcar;
    }

    public String getKH() {
        return KH;
    }

    public void setKH(String KH) {
        this.KH = KH;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTimeout() {
        return Timeout;
    }

    public void setTimeout(Date Timeout) {
        this.Timeout = Timeout;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
    
}