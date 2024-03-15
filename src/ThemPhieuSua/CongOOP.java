/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThemPhieuSua;

/**
 *
 * @author ASUS
 */
public class CongOOP {
     private String tencong;
    private String giacong; 

    public CongOOP() {
    }

    public CongOOP(String tencong, String giacong) {
        this.tencong = tencong;
        this.giacong = giacong;
    }

    public String getTencong() {
        return tencong;
    }

    public void setTencong(String tencong) {
        this.tencong = tencong;
    }

    public String getGiacong() {
        return giacong;
    }

    public void setGiacong(String giacong) {
        this.giacong = giacong;
    }
    
}
