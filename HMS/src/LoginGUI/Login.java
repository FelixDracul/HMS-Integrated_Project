/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginGUI;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Kulitha Abeywardena
 */
public class Login extends javax.swing.JFrame {
    
    String type = "n";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        unameTB = new javax.swing.JTextField();
        docRBtn = new javax.swing.JRadioButton();
        recRBtn = new javax.swing.JRadioButton();
        PharmRBtn = new javax.swing.JRadioButton();
        logBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passTB = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        unameTB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        docRBtn.setBackground(new java.awt.Color(0, 102, 102));
        docRBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        docRBtn.setForeground(new java.awt.Color(255, 255, 255));
        docRBtn.setText("Doctor");
        docRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docRBtnActionPerformed(evt);
            }
        });

        recRBtn.setBackground(new java.awt.Color(0, 102, 102));
        recRBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        recRBtn.setForeground(new java.awt.Color(255, 255, 255));
        recRBtn.setText("Receptionist");
        recRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recRBtnActionPerformed(evt);
            }
        });

        PharmRBtn.setBackground(new java.awt.Color(0, 102, 102));
        PharmRBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PharmRBtn.setForeground(new java.awt.Color(255, 255, 255));
        PharmRBtn.setText("Pharmacist");
        PharmRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmRBtnActionPerformed(evt);
            }
        });

        logBtn.setBackground(new java.awt.Color(204, 255, 204));
        logBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logBtn.setText("Log In");
        logBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("ADAM.CG PRO", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Login");

        passTB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginGUI/Webp.net-resizeimage.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(docRBtn)
                        .addGap(18, 18, 18)
                        .addComponent(recRBtn)
                        .addGap(18, 18, 18)
                        .addComponent(PharmRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passTB, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unameTB, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(logBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel3)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unameTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PharmRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(logBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        try{
            if(type=="n"){
                JOptionPane.showMessageDialog(null, "Select Employee Type!");
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms?serverTimezone=UTC", "root", "");
            String sql = "select * from users where username=? and password=? and type=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, unameTB.getText());
            pst.setString(2, passTB.getText());
            pst.setString(3, type);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                if(type=="d"){
                    JOptionPane.showMessageDialog(null, "Logged In!");
                    this.hide();
                    DoctorGUI.DoctorMain d = new DoctorGUI.DoctorMain();
                    d.show();
                    this.dispose();
                }
                else if(type=="r"){
                    JOptionPane.showMessageDialog(null, "Logged In!");
                    this.hide();
                    ReceptionistGUI.ReceptionistMain r = new ReceptionistGUI.ReceptionistMain();
                    r.show();
                    this.dispose();
                }
                else if(type=="p"){
                    JOptionPane.showMessageDialog(null, "Logged In!");
                    this.hide();
                    PharmacistGUI.PharmacistMain p = new PharmacistGUI.PharmacistMain();
                    p.show();
                    this.dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Login Details!");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
    }//GEN-LAST:event_logBtnActionPerformed

    private void docRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docRBtnActionPerformed
        type = "d";
    }//GEN-LAST:event_docRBtnActionPerformed

    private void recRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recRBtnActionPerformed
        type = "r";
    }//GEN-LAST:event_recRBtnActionPerformed

    private void PharmRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmRBtnActionPerformed
        type = "p";
    }//GEN-LAST:event_PharmRBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton PharmRBtn;
    private javax.swing.JRadioButton docRBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logBtn;
    private javax.swing.JPasswordField passTB;
    private javax.swing.JRadioButton recRBtn;
    private javax.swing.JTextField unameTB;
    // End of variables declaration//GEN-END:variables
}
