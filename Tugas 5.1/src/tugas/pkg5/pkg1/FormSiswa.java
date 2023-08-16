/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg5.pkg1;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KANG KODING
 */
public class FormSiswa extends javax.swing.JInternalFrame {
    Connection con;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel tm;
    
    /**
     * Creates new form FormSiswa
     */
    public FormSiswa() {
        initComponents();
        connect();
        refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputNis = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        inputPhone = new javax.swing.JTextField();
        inputAlamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSiswa = new javax.swing.JTable();
        tblTambah = new javax.swing.JButton();
        tblUbah = new javax.swing.JButton();
        tblHapus = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("EXCELSIOR SANS", 0, 24)); // NOI18N
        jLabel1.setText("Form Siswa");

        jLabel2.setText("Nis");

        jLabel3.setText("Nama");

        jLabel4.setText("Phone");

        jLabel5.setText("Alamat");

        tabelSiswa.setAutoCreateRowSorter(true);
        tabelSiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelSiswa);

        tblTambah.setText("Tambah");
        tblTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblTambahActionPerformed(evt);
            }
        });

        tblUbah.setText("Ubah");
        tblUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblUbahActionPerformed(evt);
            }
        });

        tblHapus.setText("Hapus");
        tblHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputNis)
                                .addComponent(inputNama)
                                .addComponent(inputPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addComponent(inputAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tblTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tblUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tblHapus)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tblTambah)
                    .addComponent(tblUbah)
                    .addComponent(tblHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblTambahActionPerformed
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO murid VALUES (?,?,?,?)");
            ps.setString(1, inputNis.getText());
            ps.setString(2, inputNama.getText());
            ps.setString(3, inputPhone.getText());
            ps.setString(4, inputAlamat.getText());
            ps.executeUpdate();
            
            refresh();
            inputNis.setText("");
            inputNama.setText("");
            inputPhone.setText("");
            inputAlamat.setText("");
        } catch(Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
        }
    }//GEN-LAST:event_tblTambahActionPerformed

    private void tblUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblUbahActionPerformed
        try {
            con.createStatement().executeUpdate("UPDATE murid SET nama='"+inputNama.getText()+"', phone='"+inputPhone.getText()+"', alamat='"+inputAlamat.getText()+"' where nis='"+inputNis.getText()+"'");
            refresh();
            inputNis.setText("");
            inputNama.setText("");
            inputPhone.setText("");
            inputAlamat.setText("");
        } catch(Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
        }
    }//GEN-LAST:event_tblUbahActionPerformed

    private void tblHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblHapusActionPerformed
        int k = JOptionPane.showConfirmDialog(null, "Yakin Mau di hapus? ", "Warning", JOptionPane.YES_NO_OPTION);
       if(k == JOptionPane.YES_OPTION){
       try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM murid WHERE nis=?");
            ps.setString(1, inputNis.getText());
            ps.executeUpdate();
            
            refresh();
            inputNis.setText("");
            inputNama.setText("");
            inputPhone.setText("");
            inputAlamat.setText("");
        } catch(Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
        }
       }
    }//GEN-LAST:event_tblHapusActionPerformed

    private void tabelSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSiswaMouseClicked
        inputNis.setText(tm.getValueAt(tabelSiswa.getSelectedRow(),0).toString());
        inputNama.setText(tm.getValueAt(tabelSiswa.getSelectedRow(),1).toString());
        inputPhone.setText(tm.getValueAt(tabelSiswa.getSelectedRow(),2).toString());
        inputAlamat.setText(tm.getValueAt(tabelSiswa.getSelectedRow(),3).toString());
    }//GEN-LAST:event_tabelSiswaMouseClicked

    private void connect() {
        
        con = null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/db_sekolah", "root","");
           
       }catch(Exception e){
           System.out.println("Gagal Mengkoneksikan Ke database");
       }
    }

    
    private void refresh() {
        tm = new DefaultTableModel(null, new Object[] { "Nis", "Nama Siswa", "No Telp", "Alamat" });
        tabelSiswa.setModel(tm);
        tm.getDataVector().removeAllElements();
 
       
        try {
            PreparedStatement s = con.prepareStatement("SELECT * FROM murid");
            ResultSet r = s.executeQuery();
            while(r.next()) {
                Object[] data = {
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4)
                   
                };
                tm.addRow(data);
            }
        } catch(Exception e) {
            System.out.print("ERROR KUERI KE DATABASE:\n" + e + "\n\n");
        }

    }

    public void sembunyikan(){
        tblTambah.setEnabled(false);
        tblUbah.setEnabled(false);
        tblHapus.setEnabled(false);
        tblTambah.hide();
        tblUbah.hide();
        tblHapus.hide();
        inputNis.hide();
        inputNama.hide();
        inputPhone.hide();
        inputAlamat.hide();
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField inputAlamat;
    public javax.swing.JTextField inputNama;
    public javax.swing.JTextField inputNis;
    public javax.swing.JTextField inputPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelSiswa;
    public javax.swing.JButton tblHapus;
    public javax.swing.JButton tblTambah;
    public javax.swing.JButton tblUbah;
    // End of variables declaration//GEN-END:variables
}