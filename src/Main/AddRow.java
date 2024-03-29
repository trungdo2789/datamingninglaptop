/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.LaptopInfo;
import Model.Setting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author dttr2
 */
public class AddRow extends javax.swing.JFrame {

    public int type;
    String laptopid;
    Main main;
    /**
     * Creates new form AddRow
     */
    public AddRow(int type, String laptopid, Main main) {

        initComponents();
        this.main=main;
        SpinnerNumberModel model;
        JSpinner.NumberEditor editor;
        model = new SpinnerNumberModel(0.0, -1000.0, 1000.0, 0.1);
        SpinnerNumberModel model1 = new SpinnerNumberModel(0.0, -1000.0, 1000.0, 0.1);
        spnManHinh.setModel(model);
        editor = new JSpinner.NumberEditor(spnManHinh);
        spnManHinh.setEditor(editor);
        spnTrongLuong.setModel(model1);
        JSpinner.NumberEditor editor1 = new JSpinner.NumberEditor(spnTrongLuong);
        spnTrongLuong.setEditor(editor1);

        Iterator it = DAO.loaibonho.keySet().iterator();
        while (it.hasNext()) {
            cbxOCung.addItem(it.next().toString());

        }

        this.type = type;
        this.laptopid = laptopid;
        init();

    }

    void init() {
        if (type == 1) {
            lCpu.setVisible(false);
            txbCpu.hide();
            lGpu.setVisible(false);
            txbGpu.hide();

            txbName.disable();
            cbxOCung.disable();
            spnDungLuong.setEnabled(false);
            spnGia.setEnabled(false);
            spnManHinh.setEnabled(false);
            spnRam.setEnabled(false);
            spnTrongLuong.setEnabled(false);
            LaptopInfo laptopInfo = Setting.GetLaptopInfo();
            String[] in = (String[]) laptopInfo.getData().get( laptopid);
            if (in == null) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin laptop trong kho dữ liệu ! " + Setting.GetSettingData().getFileProduct());
                return;
            }
            txbName.setText(in[(int) laptopInfo.getHeader().get("name")]);
            cbxOCung.setSelectedItem(in[(int) laptopInfo.getHeader().get("loaibonho")]);
            spnDungLuong.setValue(Integer.valueOf(in[(int) laptopInfo.getHeader().get("dungluongbonho")]));
            spnGia.setValue(Double.valueOf(in[(int) laptopInfo.getHeader().get("gia")]));
            spnManHinh.setValue(Double.valueOf(in[(int) laptopInfo.getHeader().get("manhinh")]));
            spnRam.setValue(Integer.valueOf(in[(int) laptopInfo.getHeader().get("ram")]));
            spnTrongLuong.setValue(Double.valueOf(in[(int) laptopInfo.getHeader().get("trongluong")]));
            txbCpuVal.setText(in[(int) laptopInfo.getHeader().get("cpu")]);
            txbGpuVal.setText(in[(int) laptopInfo.getHeader().get("gpu")]);

        }
        //edit
        if (type == 2) {
            LaptopInfo laptopInfo = Setting.GetLaptopInfo();
            String[] in = (String[]) laptopInfo.getData().get(laptopid);
            if (in == null) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin laptop trong kho dữ liệu ! " + Setting.GetSettingData().getFileProduct());
                return;
            }
            txbName.setText(in[(int) laptopInfo.getHeader().get("name")]);
            cbxOCung.setSelectedItem(in[(int) laptopInfo.getHeader().get("loaibonho")]);
            spnDungLuong.setValue(Integer.valueOf(in[(int) laptopInfo.getHeader().get("dungluongbonho")]));
            spnGia.setValue(Double.valueOf(in[(int) laptopInfo.getHeader().get("gia")]));
            spnManHinh.setValue(Double.valueOf(in[(int) laptopInfo.getHeader().get("manhinh")]));
            spnRam.setValue(Integer.valueOf(in[(int) laptopInfo.getHeader().get("ram")]));
            spnTrongLuong.setValue(Double.valueOf(in[(int) laptopInfo.getHeader().get("trongluong")]));
            txbCpuVal.setText(in[(int) laptopInfo.getHeader().get("cpu")]);
            txbGpuVal.setText(in[(int) laptopInfo.getHeader().get("gpu")]);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txbName = new javax.swing.JTextField();
        spnRam = new javax.swing.JSpinner();
        cbxOCung = new javax.swing.JComboBox<>();
        spnDungLuong = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        txbCpu = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lCpu = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        spnGia = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spnTrongLuong = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txbGpu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lGpu = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        spnManHinh = new javax.swing.JSpinner();
        btnOk = new javax.swing.JButton();
        txbCpuVal = new javax.swing.JTextField();
        txbGpuVal = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jLabel10.setText("Name:");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setText("Loai O Cung:");

        jLabel12.setText("Ram(GB):");

        jLabel13.setText("Dung Luong(GB):");

        jLabel14.setText("Cpu:");

        txbCpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbCpuKeyReleased(evt);
            }
        });

        lCpu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lCpu.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lCpuValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lCpu);

        jLabel1.setText("Gia(USD):");

        jLabel2.setText("TrongLuong(KG):");

        jLabel3.setText("Gpu:");

        txbGpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbGpuKeyReleased(evt);
            }
        });

        lGpu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lGpu.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lGpuValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lGpu);

        jLabel4.setText("Man Hinh(inch):");

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        txbCpuVal.setEditable(false);
        txbCpuVal.setBackground(new java.awt.Color(0, 204, 204));

        txbGpuVal.setEditable(false);
        txbGpuVal.setBackground(new java.awt.Color(0, 204, 204));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(txbName, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spnDungLuong)
                                .addComponent(cbxOCung, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel4)
                                .addComponent(spnManHinh)
                                .addComponent(jLabel14)
                                .addComponent(txbCpuVal)
                                .addComponent(txbCpu)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnReset)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnOk))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(txbGpu)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnRam)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnGia)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnTrongLuong, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txbGpuVal, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxOCung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnTrongLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnDungLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(spnGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spnManHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbCpuVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spnRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(txbGpuVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txbGpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOk)
                            .addComponent(btnReset))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txbCpuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbCpuKeyReleased

        ArrayList<String> l1 = new ArrayList<>();
        int i = 0;
        Iterator it = DAO.hm_cpu.entrySet().iterator();
        while (it.hasNext() && i < 5) {
            Map.Entry pair = (Map.Entry) it.next();
            if (pair.getKey().toString().indexOf(txbCpu.getText().toLowerCase().trim()) > -1) {
                l1.add(pair.getKey().toString());
                i++;
            }
        }
        lCpu.setListData(l1.toArray(new String[l1.size()]));
    }//GEN-LAST:event_txbCpuKeyReleased

    private void txbGpuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbGpuKeyReleased
        ArrayList<String> l1 = new ArrayList<>();
        int i = 0;
        Iterator it = DAO.hm_gpu.entrySet().iterator();
        while (it.hasNext() && i < 5) {
            Map.Entry pair = (Map.Entry) it.next();
            if (pair.getKey().toString().indexOf(txbGpu.getText().toLowerCase().trim()) > -1) {
                l1.add(pair.getKey().toString());
                i++;
            }
//                it.remove(); // avoids a ConcurrentModificationException
        }
        lGpu.setListData(l1.toArray(new String[l1.size()]));
    }//GEN-LAST:event_txbGpuKeyReleased

    private boolean validateForm() {
        if (txbName.getText().trim().length() < 3) {
            JOptionPane.showMessageDialog(this, "Ten phai chua nhieu hon 3 ky tu!");
            return false;
        }
        if (Float.valueOf(spnTrongLuong.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(this, "Trong luong phai lon hon 0!");
            return false;
        }
        if (Float.valueOf(spnTrongLuong.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(this, "Trong luong phai lon hon 0!");
            return false;
        }
        if (Float.valueOf(spnDungLuong.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(this, "Dung luong o cung phai lon hon 0!");
            return false;
        }
        if (Float.valueOf(spnGia.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(this, "Gia phai lon hon 0!");
            return false;
        }
        if (Float.valueOf(spnRam.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(this, "Ram phai lon hon 0!");
            return false;
        }
        if (Float.valueOf(spnManHinh.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(this, "Kich thuoc man hinh phai lon hon 0!");
            return false;
        }
        if (txbCpuVal.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Hay chon mot loai cpu!");
            return false;
        }
        if (txbGpuVal.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Hay chon mot loaigpu!");
            return false;
        }
        return true;
    }

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (type == 1) {
            this.dispose();
        }
        if (validateForm()) {
            HashMap row = new HashMap();
            row.put("name", txbName.getText());
            row.put("manhinh", spnManHinh.getValue());
            row.put("cpu", txbCpuVal.getText().toLowerCase().trim());
            row.put("ram", spnRam.getValue());
            row.put("loaibonho", cbxOCung.getSelectedItem().toString().toLowerCase().trim());
            row.put("dungluongbonho", spnDungLuong.getValue());
            row.put("gpu", txbGpuVal.getText().toLowerCase().trim());
            row.put("trongluong", spnTrongLuong.getValue());
            row.put("gia", spnGia.getValue());
            row.put("id", laptopid);
            try {
                if (type == 2) {
                    DAO.updateRowToDataProduct(row);
                    JOptionPane.showMessageDialog(this, "Cập nhật dữ liệu thành công!");
                    main.init();
                    main.save=true;
                    this.dispose();
                } else if (type == 0) {
                    DAO.insertNewRowToDataProduct(row);
                    JOptionPane.showMessageDialog(this, "Thêm dữ liệu thành công!");
                    main.init();
                    main.save=true;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Lỗi");
                System.out.println(this.getClass().getName() + "---" + ex.getMessage());
                Setting.GetSettingData().writeLog(this.getClass().getName() + "---" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        init();
    }//GEN-LAST:event_btnResetActionPerformed

    private void lCpuValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lCpuValueChanged
        if (!"".equals(lCpu.getSelectedValue())) {
            txbCpuVal.setText(lCpu.getSelectedValue());
        }
    }//GEN-LAST:event_lCpuValueChanged

    private void lGpuValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lGpuValueChanged
        if (!"".equals(lGpu.getSelectedValue())) {
            txbGpuVal.setText(lGpu.getSelectedValue());
        }
    }//GEN-LAST:event_lGpuValueChanged

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddRow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddRow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddRow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddRow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddRow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbxOCung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lCpu;
    private javax.swing.JList<String> lGpu;
    private javax.swing.JSpinner spnDungLuong;
    private javax.swing.JSpinner spnGia;
    private javax.swing.JSpinner spnManHinh;
    private javax.swing.JSpinner spnRam;
    private javax.swing.JSpinner spnTrongLuong;
    private javax.swing.JTextField txbCpu;
    private javax.swing.JTextField txbCpuVal;
    private javax.swing.JTextField txbGpu;
    private javax.swing.JTextField txbGpuVal;
    private javax.swing.JTextField txbName;
    // End of variables declaration//GEN-END:variables
}
