/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DTO.ThongKeDTO;
import java.util.ArrayList;
import java.util.Vector;
import DAO.ThongKeDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author PEERT
 */
public class GiaoDienThongKe extends javax.swing.JFrame {

    Vector title = new Vector();
    Vector data = new Vector();
    ArrayList<ThongKeDTO> ds = new ArrayList<>();

    public GiaoDienThongKe() {
        initComponents();
        LoadTitle();
        LoadData();
        LoadCbomaChuyenBay();
    }

    private void LoadCbomaChuyenBay() {
        DefaultComboBoxModel cbomodel = new DefaultComboBoxModel();
        ArrayList<String> lst = ThongKeDAO.getDataMaChuyenBay();
        for (String str : lst) {
            cbomodel.addElement(str);
        }
        cboMaChuyenBay.setModel(cbomodel);
    }

    private void LoadTitle() {
        title.add("Mã Chuyên Bay");
        title.add("Số Hiệu Máy Bay");
        title.add("Ngày Bay");
        title.add("Tổng Giá");
    }

    private void LoadData() {
        ds = ThongKeDAO.getDataThongKe();
        data.removeAllElements();
        for (ThongKeDTO dp : ds) {
            Vector v = new Vector();
            v.add(dp.getMaChuyenBay());
            v.add(dp.getShmb());
            v.add(dp.getNgayBay());
            v.add(dp.getTongGia());
            data.add(v);
        }
        tblThongKe.setModel(new DefaultTableModel(data, title));
    }

    private void LoadDataTheoMaChuyenBay(String macb) {
        ds = ThongKeDAO.getDataThongKeTheoMaChuyenBay(macb);
        data.removeAllElements();
        for (ThongKeDTO dp : ds) {
            Vector v = new Vector();
            v.add(dp.getMaChuyenBay());
            v.add(dp.getShmb());
            v.add(dp.getNgayBay());
            v.add(dp.getTongGia());
            data.add(v);
        }
        tblThongKe.setModel(new DefaultTableModel(data, title));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongKe = new javax.swing.JTable();
        cboMaChuyenBay = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblThongKe);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 595, 200));

        cboMaChuyenBay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        cboMaChuyenBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaChuyenBayActionPerformed(evt);
            }
        });
        getContentPane().add(cboMaChuyenBay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 339, -1));

        jLabel1.setText("Thống kê theo mã chuyến bay");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        jButton1.setText("Load Lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jButton2.setText("Xem Bản In Theo Chuyến Bay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 276, -1));

        jButton3.setText("In Thông Kê");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 298, 58));

        jScrollPane4.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 570, 420));

        jButton4.setText("Xem Bản In Tất Cả");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 276, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("QUẢN LÝ SÂN BAY");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jLabel16)
                .addContainerGap(528, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("THÔNG TIN ĐƯỜNG BAY");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(378, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 60, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cboMaChuyenBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaChuyenBayActionPerformed
        LoadDataTheoMaChuyenBay(cboMaChuyenBay.getSelectedItem().toString());
    }//GEN-LAST:event_cboMaChuyenBayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(Locale.US);
        df.applyPattern("#,###");
        jTextPane1.setContentType("text/html");
        HTMLDocument htmlDocument = (HTMLDocument) jTextPane1.getDocument();
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        ds = ThongKeDAO.getDataThongKeTheoMaChuyenBay(cboMaChuyenBay.getSelectedItem().toString());

        String htmlContent = "<html>\n"
                + "<head>\n"
                + "    <title>Hotel Invoice Template</title>\n"
                + "    <style>\n"
                + "        body {\n"
                + "            font-family: Arial, sans-serif;\n"
                + "        }\n"
                + "\n"
                + "        .invoice-header {\n"
                + "            text-align: center;\n"
                + "            margin-bottom: 20px;\n"
                + "        }\n"
                + "\n"
                + "        .invoice-details {\n"
                + "            margin-bottom: 20px;\n"
                + "        }\n"
                + "\n"
                + "        .invoice-details p {\n"
                + "            margin: 5px;\n"
                + "        }\n"
                + "\n"
                + "        .invoice-items {\n"
                + "            width: 100%;\n"
                + "            border-collapse: collapse;\n"
                + "        }\n"
                + "\n"
                + "        .invoice-items th,\n"
                + "        .invoice-items td {\n"
                + "            text-align: left;\n"
                + "            border-bottom: 1px solid #000;\n"
                + "            vertical-align: middle;\n"
                + "            font-size: xx-small;\n"
                + "        }\n"
                + "\n"
                + "        .total-amount {\n"
                + "            text-align: right;\n"
                + "        }\n"
                + "    </style>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <div class=\"invoice-header\">\n"
                + "        <h4 style=\"text-align: right;\">(Minh Quân - Quản lý chuyến bay)</h4>\n"
                + "		<h1 style=\"text-align: center;\">************* THỐNG KÊ HÓA ĐƠN *************</h1>\n"
                + "    </div>\n"
                + "	<table>\n"
                + "		<tbody>\n"
                + "			<tr>\n"
                + "				<td>Thời gian hiện tại:</td>\n"
                + "				<td>&nbsp &nbsp &nbsp " + day + "/" + month + "/" + year + "</td>\n"
                + "			</tr>\n"
                + "			<tr>\n"
                + "				<td>Tên nhân viên lập thống kê: </td>\n"
                + "				<td>&nbsp &nbsp &nbsp " + "Châu Minh Quân" + "</td>\n"
                + "			</tr>\n"
                + "			<tr>\n"
                + "				<td>Chi tiết thống kê: </td>\n"
                + "				<td></td>\n"
                + "			</tr>\n"
                + "		</tbody>\n"
                + "	</table>\n"
                + "	<br>\n"
                + "    <table class=\"invoice-items\">\n"
                + "        <thead>\n"
                + "            <tr>\n"
                + "                <th>Mã HĐ</th>\n"
                + "                <th>Mã NV</th>\n"
                + "                <th>Mã KH</th>\n"
                + "                <th>Mã Phòng</th>\n"
                + "            </tr>\n"
                + "        </thead>\n"
                + "        <tbody>\n";

        for (ThongKeDTO dsct : ds) {
            htmlContent += "            <tr>\n"
                    + "                <td>" + dsct.getMaChuyenBay().trim() + "</td>\n"
                    + "                <td>" + dsct.getShmb().trim() + "</td>\n"
                    + "                <td>" + dsct.getNgayBay() + "</td>\n"
                    + "                <td>" + String.valueOf(dsct.getTongGia()).trim() + "</td>\n"
                    + "            </tr>\n";
        };

        htmlContent += "</tbody>\n"
                + " </table>\n"
                + "<br><br><br><br><br><br><br>"
                + "<div style=\"text-align: right;\">\n"
                + "        <i style=\"text-align: right;\">TP.HCM, ngày " + day + " tháng " + month + " năm " + year + "</i>\n"
                + "        <p>Ký tên</p><br><br><br><br><br><br>\n"
                + "    </div>"
                + "</body>\n"
                + "</html>";

        try {
            jTextPane1.setDocument(htmlDocument);
            htmlDocument.setInnerHTML(htmlDocument.getRootElements()[0], htmlContent);
            int width = (int) (210 * 0.39 * Toolkit.getDefaultToolkit().getScreenResolution());
            int height = (int) (297 * 0.39 * Toolkit.getDefaultToolkit().getScreenResolution());
            jTextPane1.setPreferredSize(new Dimension(width, height));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(Locale.US);
        df.applyPattern("#,###");
        jTextPane1.setContentType("text/html");
        HTMLDocument htmlDocument = (HTMLDocument) jTextPane1.getDocument();
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        ds = ThongKeDAO.getDataThongKe();

        String htmlContent = "<html>\n"
                + "<head>\n"
                + "    <title>Hotel Invoice Template</title>\n"
                + "    <style>\n"
                + "        body {\n"
                + "            font-family: Arial, sans-serif;\n"
                + "        }\n"
                + "\n"
                + "        .invoice-header {\n"
                + "            text-align: center;\n"
                + "            margin-bottom: 20px;\n"
                + "        }\n"
                + "\n"
                + "        .invoice-details {\n"
                + "            margin-bottom: 20px;\n"
                + "        }\n"
                + "\n"
                + "        .invoice-details p {\n"
                + "            margin: 5px;\n"
                + "        }\n"
                + "\n"
                + "        .invoice-items {\n"
                + "            width: 100%;\n"
                + "            border-collapse: collapse;\n"
                + "        }\n"
                + "\n"
                + "        .invoice-items th,\n"
                + "        .invoice-items td {\n"
                + "            text-align: left;\n"
                + "            border-bottom: 1px solid #000;\n"
                + "            vertical-align: middle;\n"
                + "            font-size: xx-small;\n"
                + "        }\n"
                + "\n"
                + "        .total-amount {\n"
                + "            text-align: right;\n"
                + "        }\n"
                + "    </style>\n"
                + "</head>\n"
                + "<body>\n"
                + "    <div class=\"invoice-header\">\n"
                + "        <h4 style=\"text-align: right;\">(Minh Quân - Quản lý chuyến bay)</h4>\n"
                + "		<h1 style=\"text-align: center;\">************* THỐNG KÊ HÓA ĐƠN *************</h1>\n"
                + "    </div>\n"
                + "	<table>\n"
                + "		<tbody>\n"
                + "			<tr>\n"
                + "				<td>Thời gian hiện tại:</td>\n"
                + "				<td>&nbsp &nbsp &nbsp " + day + "/" + month + "/" + year + "</td>\n"
                + "			</tr>\n"
                + "			<tr>\n"
                + "				<td>Tên nhân viên lập thống kê: </td>\n"
                + "				<td>&nbsp &nbsp &nbsp " + "Châu Minh Quân" + "</td>\n"
                + "			</tr>\n"
                + "			<tr>\n"
                + "				<td>Chi tiết thống kê: </td>\n"
                + "				<td></td>\n"
                + "			</tr>\n"
                + "		</tbody>\n"
                + "	</table>\n"
                + "	<br>\n"
                + "    <table class=\"invoice-items\">\n"
                + "        <thead>\n"
                + "            <tr>\n"
                + "                <th>Mã HĐ</th>\n"
                + "                <th>Mã NV</th>\n"
                + "                <th>Mã KH</th>\n"
                + "                <th>Mã Phòng</th>\n"
                + "            </tr>\n"
                + "        </thead>\n"
                + "        <tbody>\n";

        for (ThongKeDTO dsct : ds) {
            htmlContent += "            <tr>\n"
                    + "                <td>" + dsct.getMaChuyenBay().trim() + "</td>\n"
                    + "                <td>" + dsct.getShmb().trim() + "</td>\n"
                    + "                <td>" + dsct.getNgayBay() + "</td>\n"
                    + "                <td>" + String.valueOf(dsct.getTongGia()).trim() + "</td>\n"
                    + "            </tr>\n";
        };

        htmlContent += "</tbody>\n"
                + " </table>\n"
                + "<br><br><br><br><br><br><br>"
                + "<div style=\"text-align: right;\">\n"
                + "        <i style=\"text-align: right;\">TP.HCM, ngày " + day + " tháng " + month + " năm " + year + "</i>\n"
                + "        <p>Ký tên</p><br><br><br><br><br><br>\n"
                + "    </div>"
                + "</body>\n"
                + "</html>";

        try {
            jTextPane1.setDocument(htmlDocument);
            htmlDocument.setInnerHTML(htmlDocument.getRootElements()[0], htmlContent);
            int width = (int) (210 * 0.39 * Toolkit.getDefaultToolkit().getScreenResolution());
            int height = (int) (297 * 0.39 * Toolkit.getDefaultToolkit().getScreenResolution());
            jTextPane1.setPreferredSize(new Dimension(width, height));

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (jTextPane1.getText().isEmpty())
                JOptionPane.showMessageDialog(this, "Lỗi", "Thông báo", 2);
            else
                jTextPane1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(GiaoDienThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        new GiaoDienQuanLy().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(GiaoDienThongKe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongKe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongKe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienThongKe.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboMaChuyenBay;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tblThongKe;
    // End of variables declaration//GEN-END:variables
}
