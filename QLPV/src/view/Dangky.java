package view;

import Validator.DataValidator;
import Validator.MessageLogin;
import connection.LoadData;
import controller.Controller;
import javax.swing.JOptionPane;
import model.NhanVien;
import model.TaiKhoan;

public class Dangky extends javax.swing.JFrame {
    String role;

    public Dangky() {
        initComponents();

    }
    private boolean validForm()
    {
        if (!DataValidator.validateIsNumber(ipSDT, "Điện thoại phải là số")) {
            return false;
        }
        if (!DataValidator.validatePhone10(ipSDT, "Số điện thoại phải 10 ký tự")) {
            return false;
        }
        return true;
    }
    private boolean checkIP(){
        
        String name = ipName.getText();
       if(ipName.getText().length() == 0){
            return false;
       }
        new LoadData();
         for (TaiKhoan tk : Controller.arrayListTaiKhoan) 
              if (name.equals(tk.getTenDangNhap().trim())) {
                  JOptionPane.showMessageDialog(null, "Tên Đăng Nhập đã tồn tại","Thông báo",1);
                   return false;
              }
       if(!ipXacthucMK.getText().equals(ipPass.getText()) ) {
           JOptionPane.showMessageDialog(null, "Xác thực mật khẩu không trùng khớp","Thông báo",1);
           return false;
       }
    
    return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ipName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btDangky = new javax.swing.JButton();
        lbDK = new javax.swing.JLabel();
        ipPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        ipXacthucMK = new javax.swing.JPasswordField();
        jrAdmin = new javax.swing.JRadioButton();
        jrNhanvien = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ipHovaten = new javax.swing.JTextField();
        ipSDT = new javax.swing.JTextField();
        hienMK = new javax.swing.JCheckBox();
        lbExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đăng ký");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên đăng nhập");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mật khẩu");

        btDangky.setBackground(new java.awt.Color(0, 0, 0, 5));
        btDangky.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btDangky.setForeground(new java.awt.Color(255, 255, 255));
        btDangky.setText("Đăng ký");
        btDangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangkyActionPerformed(evt);
            }
        });

        lbDK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDK.setForeground(new java.awt.Color(255, 255, 255));
        lbDK.setText("Đăng nhập");
        lbDK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDKMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Xác Thực Mật khẩu");

        buttonGroup1.add(jrAdmin);
        jrAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jrAdmin.setText("Admin");

        buttonGroup1.add(jrNhanvien);
        jrNhanvien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jrNhanvien.setForeground(new java.awt.Color(255, 255, 255));
        jrNhanvien.setSelected(true);
        jrNhanvien.setText("Nhân viên");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SDT");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Họ và tên");

        hienMK.setForeground(new java.awt.Color(255, 255, 255));
        hienMK.setText("Hiện mật khẩu");
        hienMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hienMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ipName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ipPass)
                            .addComponent(ipXacthucMK))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ipHovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ipSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrAdmin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jrNhanvien)))))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btDangky, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbDK, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hienMK)
                                .addGap(81, 81, 81))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipHovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipXacthucMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrNhanvien)
                    .addComponent(jrAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDangky, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDK)
                    .addComponent(hienMK))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 380, 390));

        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exittt.png"))); // NOI18N
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        getContentPane().add(lbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 20, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/bg_login.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(728, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(728, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            String val = i + "";
            float f = Float.parseFloat(val);
            this.setOpacity(f);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_formWindowOpened

    
    private void lbDKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDKMouseClicked
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbDKMouseClicked

    
    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_lbExitMouseClicked

    private void btDangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangkyActionPerformed
        // TODO add your handling code here:
          StringBuilder sb = new StringBuilder();
          DataValidator.validateEmpty(ipName, sb, "Tên đăng nhập không được để trống");
          DataValidator.validateEmpty(ipPass, sb, "Mật khẩu không được để trống");
          DataValidator.validateEmpty(ipHovaten, sb, "Họ và tên không được để trống");
          DataValidator.validateEmpty(ipSDT, sb, "SDT không được để trống");
          DataValidator.validateEmpty(ipXacthucMK, sb, "Xác Thực Mật khẩu không được để trống");
          if(sb.length()>0){
            MessageLogin.showErrorDangnhap(this, sb.toString(), "Lỗi");
            return;
        }
          if (!validForm()) {
            return;
        }
        if(checkIP()){
                if (jrAdmin.isSelected()) {
                role = "admin";
                TaiKhoan tk = new TaiKhoan(ipName.getText(), ipPass.getText(), role);
                NhanVien nv = new NhanVien(ipSDT.getText(),ipHovaten.getText(),ipName.getText(),0);
                connection.InsertData.insertTaiKhoan(tk);
                connection.InsertData.insertNhanVien(nv);
            }   else if (rootPaneCheckingEnabled) {
                role = "nhân viên";
                TaiKhoan tk = new TaiKhoan(ipName.getText(), ipPass.getText(), role);
                NhanVien nv = new NhanVien(ipSDT.getText(),ipHovaten.getText(),ipName.getText(),0);
                connection.InsertData.insertTaiKhoan(tk);
                connection.InsertData.insertNhanVien(nv);
                }
                new DangNhap().setVisible(true);
                this.dispose();
        }
    }//GEN-LAST:event_btDangkyActionPerformed

    private void hienMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hienMKActionPerformed
        // TODO add your handling code here:
        if (hienMK.isSelected()) {
            ipPass.setEchoChar((char) 0);
            ipXacthucMK.setEchoChar((char) 0);
        }else{
            ipPass.setEchoChar('*');
            ipXacthucMK.setEchoChar('*');
        }
    }//GEN-LAST:event_hienMKActionPerformed

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
            java.util.logging.Logger.getLogger(Dangky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dangky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dangky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dangky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dangky().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangky;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox hienMK;
    private javax.swing.JTextField ipHovaten;
    private javax.swing.JTextField ipName;
    private javax.swing.JPasswordField ipPass;
    private javax.swing.JTextField ipSDT;
    private javax.swing.JPasswordField ipXacthucMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrAdmin;
    private javax.swing.JRadioButton jrNhanvien;
    private javax.swing.JLabel lbDK;
    private javax.swing.JLabel lbExit;
    // End of variables declaration//GEN-END:variables
}
