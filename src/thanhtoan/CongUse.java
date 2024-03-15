/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thanhtoan;

/**
 *
 * @author dauxu
 */
public class CongUse {
    private String id;
    private String tenCong;
    private Double gia;

    public CongUse() {
    }

    public CongUse(String id, String tenCong, Double gia) {
        this.id = id;
        this.tenCong = tenCong;
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenCong() {
        return tenCong;
    }

    public void setTenCong(String tenCong) {
        this.tenCong = tenCong;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }
    
}
