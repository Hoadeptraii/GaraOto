/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.Date;
import NHANVIEN.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NhanVienFromm extends javax.swing.JPanel {

    DefaultTableModel model ;

    ArrayList<NhanVienOOP> list = new ArrayList<>();
    int index = -1;
    public DaoNhanVien daoNhanVien = new DaoNhanVien();
    NHANVIEN.DaoNhanVien Daonv = new NHANVIEN.DaoNhanVien();

    public NhanVienFromm() throws SQLException {
        initComponents();
        model=(DefaultTableModel)tblNhanvien1.getModel();
        data();
        tongnv.setText(daoNhanVien.tongnv());
    }
     public void showDetail(int index) {
        //  model.setRowCount(0);
        NhanVienOOP nv = list.get(index);
        txtManv1.setText(nv.getManv());
        txtHoten1.setText(nv.getHoten());
        if (nv.isGioitinh() == true) {
            rdoNam1.setSelected(true);
        } else {
            RdoNu1.setSelected(true);
        }
        txtSodt1.setText(nv.getSodt());
        txtemail1.setText(nv.getEmail());
        txtDiachi1.setText(nv.getDiachi());
        txt_Pass1.setText(nv.getPass());
        cbb_Roles1.setSelectedItem(nv.getRoles());
        Cbb_Vitri1.setSelectedItem(nv.getVitri());
        txtNgayNhanViec.setText(String.valueOf(nv.getNgaynhanviec()));
        txtNgaynghiviec.setText(String.valueOf(nv.getNgaynghiviec()));

    }
    public boolean check() {
        if ((txt_Pass1.getText().equals("")) || txtHoten1.getText().equals("") || txtemail1.getText().equals("")
                || txtSodt1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Hãy nhập dữ liệu");
            return false;
        }
        return false;
    }

    public void data() {
        String nv1="";
        model.setRowCount(0);
        ArrayList<NhanVienOOP> nv = Daonv.getAllNHANVIEN();
        for(int i=0;i<nv.size();i++){
            if(nv.get(i).isGioitinh()==true){
                nv1="Nam";
            }else{
                nv1="Nu";
            }
            model.addRow(new Object[]{nv.get(i).getManv(),nv.get(i).getHoten(),nv1,nv.get(i).getSodt(),nv.get(i).getEmail(),nv.get(i).getDiachi(),nv.get(i).getPass(),nv.get(i).getRoles(),nv.get(i).getVitri(),nv.get(i).getNgaynhanviec(),nv.get(i).getNgaynghiviec()});
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNhanvien1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtManv1 = new javax.swing.JTextField();
        txtHoten1 = new javax.swing.JTextField();
        txtSodt1 = new javax.swing.JTextField();
        txtemail1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDiachi1 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        rdoNam1 = new javax.swing.JRadioButton();
        RdoNu1 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        Cbb_Vitri1 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        cbb_Roles1 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txt_Pass1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNgayNhanViec = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNgaynghiviec = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btntim1 = new javax.swing.JButton();
        txttim1 = new javax.swing.JTextField();
        btnthem1 = new javax.swing.JButton();
        btnupdate1 = new javax.swing.JButton();
        btnxoa1 = new javax.swing.JButton();
        btn_New1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tongnv = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1400, 700));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1400, 700));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblNhanvien1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaNV", "Hoten", "GioiTinh", "SoDT", "Email", "Diachi", "MatKhau", "Chuc Vu", "Vitri", "NgayNhanViec", "NghiViec"
            }
        ));
        tblNhanvien1.setRowHeight(40);
        tblNhanvien1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanvien1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblNhanvien1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thong tin NV", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Ma NV :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Họ Tên :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Số DT:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Email:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Địa Chỉ:");

        txtDiachi1.setColumns(20);
        txtDiachi1.setRows(5);
        jScrollPane4.setViewportView(txtDiachi1);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Giới tính:");

        buttonGroup2.add(rdoNam1);
        rdoNam1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdoNam1.setText("Nam");

        buttonGroup2.add(RdoNu1);
        RdoNu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RdoNu1.setText("Nữ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Vị Trí:");

        Cbb_Vitri1.setBackground(new java.awt.Color(255, 252, 0));
        Cbb_Vitri1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cbb_Vitri1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kĩ Thuật", "Thu Ngân" }));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Chức vụ: ");

        cbb_Roles1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbb_Roles1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân Viên", "Quản Lý" }));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Mật Khẩu:");

        txt_Pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Pass1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Ngày nhận việc:");

        jLabel12.setText("Ngày nghỉ việc:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtManv1)
                    .addComponent(txtHoten1)
                    .addComponent(txtSodt1)
                    .addComponent(txtemail1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgaynghiviec, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(txtNgayNhanViec)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RdoNu1)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(rdoNam1)
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Cbb_Vitri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_Roles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtManv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoten1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSodt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(txt_Pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(cbb_Roles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNgayNhanViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNgaynghiviec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(rdoNam1)
                                .addGap(18, 18, 18)
                                .addComponent(RdoNu1))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cbb_Vitri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Tìm Kiếm:");

        jComboBox2.setBackground(new java.awt.Color(255, 252, 0));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NhanVien", "Quan Ly" }));

        btntim1.setBackground(new java.awt.Color(255, 252, 0));
        btntim1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btntim1.setText("Tim");
        btntim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntim1ActionPerformed(evt);
            }
        });

        btnthem1.setBackground(new java.awt.Color(255, 252, 0));
        btnthem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnthem1.setText("Thêm");
        btnthem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthem1ActionPerformed(evt);
            }
        });

        btnupdate1.setBackground(new java.awt.Color(255, 252, 0));
        btnupdate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate1.setText("Update");
        btnupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate1ActionPerformed(evt);
            }
        });

        btnxoa1.setBackground(new java.awt.Color(255, 252, 0));
        btnxoa1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnxoa1.setText("Xóa");
        btnxoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoa1ActionPerformed(evt);
            }
        });

        btn_New1.setBackground(new java.awt.Color(255, 252, 0));
        btn_New1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_New1.setText("New");
        btn_New1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_New1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tổng Nv Còn Làm");

        tongnv.setText("jLabel2");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttim1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tongnv)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(btntim1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn_New1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnxoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(btnupdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(btnthem1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txttim1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntim1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_New1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnthem1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnupdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tongnv)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnxoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel25.setText("BẢNG QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel25)
                        .addGap(0, 533, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanvien1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanvien1MouseClicked
        // TODO add your handling code here:
        try {
            index = tblNhanvien1.getSelectedRow();
            showDetail(index);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_tblNhanvien1MouseClicked

    private void btntim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntim1ActionPerformed
        // TODO add your handling code here:
        String tenNhanVien = txttim1.getText().trim();
        if (!tenNhanVien.isEmpty()) {
            // Gọi phương thức tìm kiếm nhân viên theo tên từ lớp DAO (DaoNhanVien)
            DaoNhanVien daoNhanVien = new DaoNhanVien();
            ArrayList<NhanVienOOP> danhSachNhanVien = daoNhanVien.findNhanVienByTen(tenNhanVien);

            if (!danhSachNhanVien.isEmpty()) {
                // Hiển thị danh sách nhân viên tìm được lên bảng
                model.setRowCount(0);
                for (NhanVienOOP nv : danhSachNhanVien) {
                    String gioiTinh = nv.isGioitinh() ? "Nam" : "Nữ";
                    model.addRow(new Object[]{
                        nv.getManv(),
                        nv.getHoten(),
                        gioiTinh,
                        nv.getSodt(),
                        nv.getEmail(),
                        nv.getDiachi(),
                        nv.getPass(),
                        nv.getNgaynhanviec(),
                        nv.getNgaynghiviec()
                    });
                }
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên với tên " + tenNhanVien, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                model.setRowCount(0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên nhân viên cần tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            model.setRowCount(0);
        }
        
    }//GEN-LAST:event_btntim1ActionPerformed

    private void btnthem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthem1ActionPerformed
        boolean gt=true;String chucvu="",vitri="";
        if(rdoNam1.isSelected()){
            gt=true;
        }else if(RdoNu1.isSelected()){
            gt=false;
        }
        if(cbb_Roles1.getSelectedIndex()==0){
            chucvu="Nhân Viên";
        }else if(cbb_Roles1.getSelectedIndex()==1){
            chucvu="Quản Lý";
        }
        if(Cbb_Vitri1.getSelectedIndex()==0){
            vitri="Kĩ thuật";
        }else if(Cbb_Vitri1.getSelectedIndex()==1){
            vitri="Thu ngân";
        }
        if(!check()){
        new DaoNhanVien().ADDNhanvien(txtManv1.getText(),
                txtHoten1.getText(),
                gt, txtSodt1.getText(),
                txtemail1.getText(), 
                txtDiachi1.getText(), 
                txt_Pass1.getText(), 
                chucvu, 
                TOOL_TIP_TEXT_KEY);
        }
        data();
    }//GEN-LAST:event_btnthem1ActionPerformed

    private void btnupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate1ActionPerformed
        // TODO add your handling code here:
        index = tblNhanvien1.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn hàng cần update!");
        } else {
            list.remove(index);
            NhanVienOOP nv = new NhanVienOOP();
            new DaoNhanVien().update(nv);
            nv.setManv(txtManv1.getText());
            nv.setHoten(txtHoten1.getText());
            boolean gt;
            if (rdoNam1.isSelected()) {
                gt = true;
            } else {
                gt = false;
            }
            nv.setGioitinh(gt);
            nv.setPass(txt_Pass1.getText());
            nv.setEmail(txtemail1.getText());
            nv.setSodt(txtSodt1.getText());
            nv.setDiachi(txtDiachi1.getText());
            nv.setRoles(cbb_Roles1.getSelectedItem().toString());
            nv.setVitri(Cbb_Vitri1.getSelectedItem().toString());
            Date lc = Date.valueOf(LocalDate.now());
            nv.setNgaynhanviec(lc);
            nv.setNgaynghiviec(null);

            if (!new DaoNhanVien().update(nv)) {
                JOptionPane.showMessageDialog(this, "Lỗi");
            } else {
                JOptionPane.showMessageDialog(this, "Lưu thành công!");
                list.add(nv);
            }
            
        }
    }//GEN-LAST:event_btnupdate1ActionPerformed

    private void btnxoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoa1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNhanvien1.getSelectedRow();
        if (selectedRow >= 0) {
            String maNhanVien = tblNhanvien1.getValueAt(selectedRow, 0).toString();
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa nhân viên này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                try {
                    DaoNhanVien daoNhanVien = new DaoNhanVien();
                    daoNhanVien.deleteNhanvien(maNhanVien);
                   
                    JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi xóa nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một nhân viên để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnxoa1ActionPerformed

    private void btn_New1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_New1ActionPerformed
        // TODO add your handling code here:
        txtManv1.setText(null);
        txtHoten1.setText(null);
        buttonGroup2.clearSelection();
        txtSodt1.setText(null);
        txtemail1.setText(null);
        txtDiachi1.setText(null);
        txt_Pass1.setText(null);
        cbb_Roles1.setSelectedIndex(0);
        Cbb_Vitri1.setSelectedIndex(0);
        txtNgayNhanViec.setText(null);
        txtNgaynghiviec.setText(null);
    }//GEN-LAST:event_btn_New1ActionPerformed

    private void txt_Pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Pass1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbb_Vitri1;
    private javax.swing.JRadioButton RdoNu1;
    private javax.swing.JButton btn_New1;
    private javax.swing.JButton btnthem1;
    private javax.swing.JButton btntim1;
    private javax.swing.JButton btnupdate1;
    private javax.swing.JButton btnxoa1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbb_Roles1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdoNam1;
    private javax.swing.JTable tblNhanvien1;
    private javax.swing.JLabel tongnv;
    private javax.swing.JTextArea txtDiachi1;
    private javax.swing.JTextField txtHoten1;
    private javax.swing.JTextField txtManv1;
    private javax.swing.JTextField txtNgayNhanViec;
    private javax.swing.JTextField txtNgaynghiviec;
    private javax.swing.JTextField txtSodt1;
    private javax.swing.JTextField txt_Pass1;
    private javax.swing.JTextField txtemail1;
    private javax.swing.JTextField txttim1;
    // End of variables declaration//GEN-END:variables
}
