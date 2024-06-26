/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import connection.LoadData;
import model.Ve;
import static controller.Controller.*;
import model.TaiKhoan;

/**
 *
 * @author PC
 */
public class GiaoDienThongTinVe extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienThongTinVe
     */
    public GiaoDienThongTinVe() {
        initComponents();
        Title.setText("Thông Tin Hành Khách " + (controller.Controller.dsVeChon.size()+1));
       lableMaGhe.setText(dsGheChon.get(dsVeChon.size() ));
        System.out.println(dsGheChon.size());
       if((controller.Controller.dsVeChon.size())== controller.Controller.dsGheChon.size()){
            jButton1.setText("Xác Nhận Đặt Vé");
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

        jLabel2 = new javax.swing.JLabel();
        jTextFieldSDT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lableMaGhe = new javax.swing.JLabel();
        baoLoi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtGia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NHẬP THÔNG TIN VÉ");
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("SĐT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 70, -1, 21));

        jTextFieldSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSDTActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 72, 181, 31));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel3.setText("Tên Hành Khách");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, 83, 19));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 121, 181, 31));

        jLabel4.setText("Mã Ghế");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 170, 44, 28));

        Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Title.setText("Title");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 6, 275, 31));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("Tiếp Theo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 238, -1, 25));

        lableMaGhe.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        getContentPane().add(lableMaGhe, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 170, 177, 28));

        baoLoi.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(baoLoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 269, 183, 25));

        jLabel1.setText("Giá");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 40, -1));

        txtGia.setText("500000");
        getContentPane().add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 180, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSDTActionPerformed
       private boolean checkIP(){
           if(jTextFieldName.getText().length() == 0){
                baoLoi.setText("Họ Tên không được để trống");
                return false;
        }
           
        String str = jTextFieldSDT.getText();
       if (str.length() != 10) {
            baoLoi.setText("Số điện thoại không hợp lệ");
            return false;
       }
            
       for (int i = 0; i < str.length(); i++) 
            if (!Character.isDigit(str.charAt(i))){
                baoLoi.setText("Số điện thoại không hợp lệ");
                return false;
        } 
       return true;
       }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(checkIP()){
                dsVeChon.add(new Ve(cb.getMaChuyenBay(),jTextFieldName.getText(),jTextFieldSDT.getText(),dsGheChon.get(dsVeChon.size() ), Integer.parseInt(txtGia.getText())));
                if((dsVeChon.size())<dsGheChon.size()){
                     new GiaoDienThongTinVe().setVisible(true);
                     this.dispose();
                }
                else{

                    connection.InsertData.insertVe(dsVeChon);
                    if(cb.getSoGheTrong()==soLuongVeChon){
                        connection.UpdateData.capNhatHetVe(cb.getMaChuyenBay());
                    }
                    dsVeChon.removeAll(dsVeChon);
                    arrayListTimChuyenBay.remove(arrayListTimChuyenBay);
                     for (TaiKhoan taiKhoan : arrayListTaiKhoan) {
                        if(tk.getTenDangNhap().equals(taiKhoan.getTenDangNhap())){
                            controller.Controller.tk=taiKhoan;
                            break;
                        }       
                    }
                    new GiaoDienChuyenBay().setVisible(true);
                    this.dispose();
                }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongTinVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienThongTinVe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel baoLoi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSDT;
    private javax.swing.JLabel lableMaGhe;
    private javax.swing.JLabel txtGia;
    // End of variables declaration//GEN-END:variables
}
