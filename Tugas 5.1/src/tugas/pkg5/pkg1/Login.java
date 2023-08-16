/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg5.pkg1;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author zaenalalfian
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    void lgn(){
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/db_sekolah", "root", "KANGCODING100");
        pst = con.prepareStatement("SELECT level FROM user WHERE username = ? AND password = ?");
        pst.setString(1, usnm.getText());
        pst.setString(2, String.valueOf(pas.getPassword()));
        rs = pst.executeQuery();
        if(rs.next()){
            FormMenu utama = new FormMenu();
            
            JOptionPane.showMessageDialog(null, "Login Berhasil");
            utama.setLevel(rs.getString(1));
            utama.show();
        
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "Username atau Password salah!! ", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Login Error" + e.getStackTrace());
        }
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usnm = new javax.swing.JTextField();
        pas = new javax.swing.JPasswordField();
        lgn_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        register_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        close_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/username.png"))); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/password.png"))); // NOI18N
        jLabel2.setText("Password");

        usnm.setName("Username"); // NOI18N
        usnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usnmKeyTyped(evt);
            }
        });

        pas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasActionPerformed(evt);
            }
        });
        pas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pasKeyTyped(evt);
            }
        });

        lgn_btn.setBackground(new java.awt.Color(51, 204, 255));
        lgn_btn.setForeground(new java.awt.Color(0, 0, 0));
        lgn_btn.setText("Login");
        lgn_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgn_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("EXCELSIOR SANS", 0, 36)); // NOI18N
        jLabel3.setText("LOGIN FORM");

        register_btn.setBackground(new java.awt.Color(0, 204, 0));
        register_btn.setForeground(new java.awt.Color(0, 0, 0));
        register_btn.setText("Register");
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/kangcoding.png"))); // NOI18N
        jLabel4.setText("ZAENAL ALFIAN");

        close_btn.setBackground(new java.awt.Color(255, 51, 51));
        close_btn.setForeground(new java.awt.Color(255, 255, 255));
        close_btn.setText("Close");
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usnm, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pas, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lgn_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(register_btn)
                                .addGap(64, 64, 64)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lgn_btn)
                    .addComponent(register_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(close_btn))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lgn_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgn_btnActionPerformed
           lgn();
           
    }//GEN-LAST:event_lgn_btnActionPerformed

    private void usnmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usnmKeyTyped
        if(usnm.getText().length()==12 ){
            evt.consume();
        }
    }//GEN-LAST:event_usnmKeyTyped

    private void pasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pasKeyTyped
        if (pas.getPassword().length == 12){
            evt.consume();
        }
    }//GEN-LAST:event_pasKeyTyped

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        // Register new user
        Register lk = new Register();
        lk.setVisible(true);
        lk.setEnabled(true);
        lk.setLocation(0,0);
        this.dispose();
    }//GEN-LAST:event_register_btnActionPerformed

    private void pasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasActionPerformed

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
       System.exit(0);
    }//GEN-LAST:event_close_btnActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton lgn_btn;
    private javax.swing.JPasswordField pas;
    private javax.swing.JButton register_btn;
    private javax.swing.JTextField usnm;
    // End of variables declaration//GEN-END:variables
}
