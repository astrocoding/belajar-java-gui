/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg5.pkg1;

/**
 *
 * @author zaenalalfian
 */
public class FormMenu extends javax.swing.JFrame {
    private String username;
    private String level;

    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
        initComponents();
        
    }

    public void setUsername(String u){
    username = u;
    
    }
    public void setLevel(String l){
    level = l;
    if(level.equals("siswa")){
        FormSiswa siswa = new FormSiswa();
        jMenu2.hide();
        jMenu3.hide();
        jMenu4.hide();
        jMenu6.hide();
        siswa.sembunyikan();
        
     }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        menubar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        formSiswa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        formjurusan = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        formKelas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        formMapel = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        formNilai = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        formUser = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        formAbout = new javax.swing.JMenuItem();
        exitAja = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menubar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/dataSiswa.png"))); // NOI18N
        jMenu1.setText("Data Siswa");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        formSiswa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        formSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/menu.png"))); // NOI18N
        formSiswa.setText("Form Siswa");
        formSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formSiswaActionPerformed(evt);
            }
        });
        jMenu1.add(formSiswa);

        menubar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/document-viewer.png"))); // NOI18N
        jMenu2.setText("Data Jurusan");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        formjurusan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        formjurusan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/menu.png"))); // NOI18N
        formjurusan.setText("Form Jurusan");
        formjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formjurusanActionPerformed(evt);
            }
        });
        jMenu2.add(formjurusan);

        menubar.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/data.png"))); // NOI18N
        jMenu3.setText("Data Kelas");
        jMenu3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        formKelas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        formKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/menu.png"))); // NOI18N
        formKelas.setText("Form Kelas");
        formKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formKelasActionPerformed(evt);
            }
        });
        jMenu3.add(formKelas);

        menubar.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/preferences-system-windows.png"))); // NOI18N
        jMenu4.setText("Data Mapel");
        jMenu4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        formMapel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        formMapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/menu.png"))); // NOI18N
        formMapel.setText("Form Mapel");
        formMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formMapelActionPerformed(evt);
            }
        });
        jMenu4.add(formMapel);

        menubar.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/dataNilai.png"))); // NOI18N
        jMenu6.setText("Data Nilai");
        jMenu6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        formNilai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        formNilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/menu.png"))); // NOI18N
        formNilai.setText("Form Nilai");
        formNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNilaiActionPerformed(evt);
            }
        });
        jMenu6.add(formNilai);

        menubar.add(jMenu6);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/system-users.png"))); // NOI18N
        jMenu5.setText("Data User");
        jMenu5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        formUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        formUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/menu.png"))); // NOI18N
        formUser.setText("Form User");
        formUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formUserActionPerformed(evt);
            }
        });
        jMenu5.add(formUser);

        menubar.add(jMenu5);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/help-about.png"))); // NOI18N
        help.setText("Help");
        help.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        formAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        formAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/menu.png"))); // NOI18N
        formAbout.setText("About");
        formAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAboutActionPerformed(evt);
            }
        });
        help.add(formAbout);

        exitAja.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitAja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas/icon/menu.png"))); // NOI18N
        exitAja.setText("Exit");
        exitAja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAjaActionPerformed(evt);
            }
        });
        help.add(exitAja);

        menubar.add(help);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formjurusanActionPerformed
      int count = 0;
      FormJurusan fj = new FormJurusan();
   
        jPanel2.add(fj);
        fj.show();
        ++count;
          System.out.println(count);   
    }//GEN-LAST:event_formjurusanActionPerformed

    private void formSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formSiswaActionPerformed
        int count = 0;
        FormSiswa fs = new FormSiswa();
   
        jPanel2.add(fs);
        fs.show();
        ++count;
          System.out.println(count);
    }//GEN-LAST:event_formSiswaActionPerformed

    private void formMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formMapelActionPerformed
        int count = 0;
        FormMapel fs = new FormMapel();
      
        jPanel2.add(fs);
        fs.show();
        ++count;
        System.out.println(count);
    }//GEN-LAST:event_formMapelActionPerformed

    private void formKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formKelasActionPerformed
        int count = 0;
        FormKelas fs = new FormKelas();
   
        jPanel2.add(fs);
        fs.show();
        ++count;
        System.out.println(count);
    }//GEN-LAST:event_formKelasActionPerformed

    private void formNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNilaiActionPerformed
        int count = 0;
        FormNilai fs = new FormNilai();
        
        jPanel2.add(fs);
        fs.show();
        ++count;
        System.out.println(count);
    }//GEN-LAST:event_formNilaiActionPerformed

    private void formAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAboutActionPerformed
        int count = 0;
        FormAbout fs = new FormAbout();
   
        jPanel2.add(fs);
        fs.show();
        ++count;
        System.out.println(count);
    }//GEN-LAST:event_formAboutActionPerformed

    private void formUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formUserActionPerformed
        int count = 0;
        FormUser fs = new FormUser();
   
        jPanel2.add(fs);
        fs.show();
        ++count;
        System.out.println(count);
    }//GEN-LAST:event_formUserActionPerformed

    private void exitAjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAjaActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitAjaActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitAja;
    private javax.swing.JMenuItem formAbout;
    private javax.swing.JMenuItem formKelas;
    private javax.swing.JMenuItem formMapel;
    private javax.swing.JMenuItem formNilai;
    private javax.swing.JMenuItem formSiswa;
    private javax.swing.JMenuItem formUser;
    private javax.swing.JMenuItem formjurusan;
    private javax.swing.JMenu help;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menubar;
    // End of variables declaration//GEN-END:variables
}
