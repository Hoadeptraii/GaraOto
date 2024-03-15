/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

/**
 *
 * @author dauxu
 */
public class BntPhieuNhanUse {
     private  String ID ;
    private  String idcar ;
    private String time;
    private String Timeout ; 
    private String TinhTrangIn;

    public BntPhieuNhanUse() {
    }

    public BntPhieuNhanUse(String ID, String idcar, String time, String Timeout, String TinhTrangIn) {
        this.ID = ID;
        this.idcar = idcar;
        this.time = time;
        this.Timeout = Timeout;
        this.TinhTrangIn = TinhTrangIn;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimeout() {
        return Timeout;
    }

    public void setTimeout(String Timeout) {
        this.Timeout = Timeout;
    }

    public String getTinhTrangIn() {
        return TinhTrangIn;
    }

    public void setTinhTrangIn(String TinhTrangIn) {
        this.TinhTrangIn = TinhTrangIn;
    }
    
}
