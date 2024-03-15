/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import DAO.DaoKhachHanng;

import Oop.KhachHang;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Oop.Cars;
import com.mysql.cj.conf.ConnectionUrlParser;
import duanmau1.ThemXe;
import duanmau1.ThongTin;
import javax.swing.JOptionPane;
import duanmau1.ThongTinCustomers;
/**
 *
 * @author THUAT
 */
public class KhachHangv extends javax.swing.JPanel {

    CardLayout cl;
    DefaultTableModel Custom, Car;
    ArrayList<KhachHang> khach;
    ArrayList<Cars> CarCustomers;
    ThongTin tt = new ThongTin();
    ThongTinCustomers ttcus= new ThongTinCustomers();
    ThemXe themcar= new ThemXe();
    int index=0;


    public KhachHangv() {
        initComponents();
        cl = (CardLayout) Card.getLayout();
        Custom = (DefaultTableModel) tblCustomers.getModel();
        Car = (DefaultTableModel) tblCars.getModel();
        ThongTinCustomers();
        ThongTinCars();
        tt.khv = this;
        themcar.khv=this;
    }
    public String change() {
        String makh=(String)tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 0);
        return makh;
    }
    public void OptionDelete() {
        int i=tblCars.getSelectedRow();
        if(i!=-1){
        String Deletecar=(String)tblCars.getValueAt(i, 2);
        new DaoKhachHanng().DeleteCars(Deletecar);
        SearchCars();
        }else{
            JOptionPane.showMessageDialog(null, "Chưa Chọn Xe");
        }
    }
    public void ThongTinCars() {
        ArrayList<Cars> CarCustom = new DaoKhachHanng().GetAllCars();
        Car.setRowCount(0);
        for (Cars xe : CarCustom) {
            Car.addRow(new Object[]{xe.getIdcar(), xe.getTenxe(), xe.getBienso()});
        }
    }
    public void ThongTinCustomers() {
        Custom.setRowCount(0);
        String gt;
        ArrayList<KhachHang> kh = new DaoKhachHanng().GetArrayList();
        for (KhachHang Customrs : kh) {
            if (Customrs.isGt() == true) {
                gt = "Nam";
            } else {
                gt = "Nữ";
            }
            Custom.addRow(new Object[]{Customrs.getMakh(), Customrs.getHoten(), gt, Customrs.getSdt(), Customrs.getDiachi()});
        }
    }
    public void SearchCustomers() {
        Custom.setRowCount(0);
        Car.setRowCount(0);
        ConnectionUrlParser.Pair<ArrayList<KhachHang>, ArrayList<Cars>> kh = new DaoKhachHanng().SearchCustomers(txtTim.getText());
        String k;
        ArrayList<KhachHang> customerList = kh.left;
        ArrayList<Cars> ca = kh.right;
        for (KhachHang kn : customerList) {
            if (kn.isGt() == true) {
                k = "Nam";
            } else {
                k = "Nữ";
            }
            Custom.addRow(new Object[]{kn.getMakh(), kn.getHoten(), k, kn.getSdt(), kn.getDiachi()});
            for (Cars cas : ca) {
                Car.addRow(new Object[]{cas.getIdcar(), cas.getTenxe(), cas.getBienso()});
                        }
        }
        
    }
    public void SearchCars() {
        Car.setRowCount(0);
        String makha = (String) tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 0);
        ArrayList<Cars> cars = new DaoKhachHanng().getObjectById(makha);
        if (cars != null) {
            for (Cars ca : cars) {
                Car.addRow(new Object[]{ca.getIdcar(), ca.getTenxe(), ca.getBienso()});
                        }
        }
    }
    
    public void Click() {
        String makh = (String) tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 0);
        String hoten = (String) tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 1);
        String gt = (String) tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 2);
        String sodt = (String) tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 3);
        String diachi = (String) tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 4);
        txthoten.setText(hoten);
        lblmakh.setText(makh);
        lblgt.setText(gt);
        txtSodt.setText(sodt);
        txtdiachi.setText(diachi);
    }
     public void ClickTT() {         
        int i=tblCustomers.getSelectedRow();
        if(i!=-1){
            boolean a=true;
        String makh = (String) tblCustomers.getValueAt(i, 0);
        String hoten = (String) tblCustomers.getValueAt(i, 1);
        String gt = (String)tblCustomers.getValueAt(i, 2);
        String sodt = (String) tblCustomers.getValueAt(i, 3);
        String diachi = (String) tblCustomers.getValueAt(i, 4);
        if(gt.equalsIgnoreCase("Nam")){
            a=true;
        }else if(gt.equalsIgnoreCase("Nữ")){
            a=false;
        }
        KhachHang kk = new KhachHang(makh, hoten, a, sodt, diachi);
        ttcus.getkh(kk);
            System.out.println(a);
        }      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Card = new javax.swing.JPanel();
        khachh = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblgt = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        txtSodt = new javax.swing.JTextField();
        lblmakh = new javax.swing.JLabel();
        btnAddCar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        bntAddCustomers = new javax.swing.JButton();
        btntim = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 700));

        Card.setLayout(new java.awt.CardLayout());

        tblCustomers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Khách", "Họ Tên", "Giới Tính", "Số DT", "Địa Chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomers.setRowHeight(40);
        tblCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomers);
        if (tblCustomers.getColumnModel().getColumnCount() > 0) {
            tblCustomers.getColumnModel().getColumn(0).setMinWidth(10);
            tblCustomers.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblCustomers.getColumnModel().getColumn(2).setMinWidth(2);
            tblCustomers.getColumnModel().getColumn(2).setPreferredWidth(2);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Thêm Khách");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tìm Kiếm Khách");

        txtTim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKeyReleased(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Họ Tên");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Số DT :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Địa Chỉ:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Giới Tính :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Mã Khách :");

        lblgt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblgt.setText("Null");

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        jScrollPane4.setViewportView(txtdiachi);

        lblmakh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmakh.setText("null");

        btnAddCar.setBackground(new java.awt.Color(255, 252, 0));
        btnAddCar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddCar.setText("Thêm Xe");
        btnAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblgt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddCar))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSodt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(txthoten, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(35, 35, 35)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblmakh, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 25, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblgt)
                            .addComponent(btnAddCar))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblmakh))))
                .addContainerGap())
        );

        tblCars.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Car", "Tên Cars", "Biển Số"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCars);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton2.setBackground(new java.awt.Color(255, 252, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Xóa Xe");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bntAddCustomers.setBackground(new java.awt.Color(255, 252, 0));
        bntAddCustomers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntAddCustomers.setText("+");
        bntAddCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddCustomersActionPerformed(evt);
            }
        });

        btntim.setBackground(new java.awt.Color(255, 252, 0));
        btntim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btntim.setText("t");
        btntim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout khachhLayout = new javax.swing.GroupLayout(khachh);
        khachh.setLayout(khachhLayout);
        khachhLayout.setHorizontalGroup(
            khachhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(khachhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(khachhLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntAddCustomers)
                        .addGap(8, 8, 8)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        khachhLayout.setVerticalGroup(
            khachhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachhLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(khachhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(bntAddCustomers)
                    .addComponent(btntim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(khachhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Bảng Khách Hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(khachh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(471, 471, 471)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khachh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKeyReleased
        String t= txtTim.getText();
        int row=tblCustomers.getRowCount();
        int rowcar=tblCars.getRowCount();
        if(row>0&&!t.isEmpty()){
            SearchCustomers();
            tblCustomers.setRowSelectionInterval(index, index);
            if(rowcar!=-1){
                tblCars.setRowSelectionInterval(index, index);
            }
        }else{
            ThongTinCustomers();
            ThongTinCars();
        }
    }//GEN-LAST:event_txtTimKeyReleased

    private void tblCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomersMouseClicked
        int a =evt.getClickCount();
        if(a==2){
           ClickTT();
           ttcus.setVisible(true);
        }else{
        Click();
        SearchCars();
        int row=tblCars.getRowCount();
        if(row>0){
        tblCars.setRowSelectionInterval(index, index);
        }
        }
    }//GEN-LAST:event_tblCustomersMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                OptionDelete();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarActionPerformed
             themcar.setVisible(true);
    }//GEN-LAST:event_btnAddCarActionPerformed

    private void bntAddCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddCustomersActionPerformed
       tt.setVisible(true);
    }//GEN-LAST:event_bntAddCustomersActionPerformed

    private void btntimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimActionPerformed
       new DaoKhachHanng().SearchCustomers(txtTim.getText());
    }//GEN-LAST:event_btntimActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Card;
    private javax.swing.JButton bntAddCustomers;
    private javax.swing.JButton btnAddCar;
    private javax.swing.JButton btntim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel khachh;
    private javax.swing.JLabel lblgt;
    private javax.swing.JLabel lblmakh;
    private javax.swing.JTable tblCars;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtSodt;
    private javax.swing.JTextField txtTim;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txthoten;
    // End of variables declaration//GEN-END:variables

   
}
