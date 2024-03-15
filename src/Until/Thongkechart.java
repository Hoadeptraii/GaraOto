/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Until;

import DAO.ThongKeDao;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultKeyedValues2DDataset;

/**
 *
 * @author THUAT
 */
public class Thongkechart {
ThongKeDao dao=new ThongKeDao();
    public void thongke(int ngay,int thang) {
        double tongtienthang = Double.parseDouble(dao.TongtienTheoThang(thang));
        double tongtienngay = Double.parseDouble(dao.TongtienTheoNGay(ngay));
        DefaultKeyedValues2DDataset dataset = new DefaultKeyedValues2DDataset();
        dataset.addValue(tongtienngay, "Ngay"+ngay, "Ngay");
        dataset.addValue(tongtienthang, "Tổng Tiền", "Tổng Tiền");
        JFreeChart chart = ChartFactory.createBarChart("Doanh Thu Theo tháng","DoanhThu" ,"Tiền" , dataset);
               
    
        chart.getPlot();
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        JFrame frame = new JFrame("JFreeChart Example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(chartPanel); // Thêm JPanel chứa biểu đồ vào JFrame
        frame.pack();
        frame.setVisible(true);
    }
}
