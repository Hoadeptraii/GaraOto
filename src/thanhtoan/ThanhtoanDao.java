
package thanhtoan;

/**
 *
 * @author dauxu
 */
public class ThanhtoanDao {
    private String maHD ;
    private String hoten ;
    private String Sodienthoai ;
    private String TongTien ;
    private String Time ; 
    private String masua ;

    public ThanhtoanDao() {
    }

    public ThanhtoanDao(String maHD, String hoten, String Sodienthoai, String TongTien, String Time, String masua) {
        this.maHD = maHD;
        this.hoten = hoten;
        this.Sodienthoai = Sodienthoai;
        this.TongTien = TongTien;
        this.Time = Time;
        this.masua = masua;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String Sodienthoai) {
        this.Sodienthoai = Sodienthoai;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getMasua() {
        return masua;
    }

    public void setMasua(String masua) {
        this.masua = masua;
    }
   
   
   
      
}
