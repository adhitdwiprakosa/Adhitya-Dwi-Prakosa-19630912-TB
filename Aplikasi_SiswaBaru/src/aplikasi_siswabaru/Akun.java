




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_siswabaru;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GaliH_
 */
public class Akun extends javax.swing.JFrame {

    /**
     * Creates new form Akun
     */
    public Akun() {
        initComponents();
        tampil();
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
        jButton1 = new javax.swing.JButton();
        txt_nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmb_role = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_akun = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txt_cari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_refresh = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel1.setText("Kelola Akun");

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 69);

        txt_nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nama);
        txt_nama.setBounds(10, 96, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 75, 33, 15);

        cmb_role.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- PILIH --", "Admin", "Petugas" }));
        getContentPane().add(cmb_role);
        cmb_role.setBounds(10, 260, 126, 21);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Role");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 240, 40, 15);

        txt_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_user);
        txt_user.setBounds(10, 144, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 59, 15);

        txt_pass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_pass);
        txt_pass.setBounds(10, 200, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 180, 59, 15);

        tbl_akun.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_akun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_akun.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_akun.setShowHorizontalLines(false);
        tbl_akun.setShowVerticalLines(false);
        tbl_akun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_akunMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_akun);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 350, 610, 210);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(390, 320, 51, 23);

        txt_cari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txt_cari);
        txt_cari.setBounds(70, 311, 306, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cari Data");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 320, 56, 15);

        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_refresh);
        btn_refresh.setBounds(450, 320, 80, 23);

        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(540, 320, 76, 23);

        lbl_id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_id.setText("ID");
        getContentPane().add(lbl_id);
        lbl_id.setBounds(550, 300, 20, 14);

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan);
        btn_simpan.setBounds(450, 130, 79, 42);

        btn_ubah.setText("Perbarui");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ubah);
        btn_ubah.setBounds(450, 180, 79, 42);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_siswabaru/logo sma.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 70, 300, 280);

        setSize(new java.awt.Dimension(632, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void refresh(){
        txt_nama.setText("");
        txt_user.setText("");
        txt_pass.setText("");
        cmb_role.setSelectedIndex(0);
        lbl_id.setText("");
        tampil();
    }
    private void tampil(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nama");
        tbl.addColumn("Username");
        tbl.addColumn("Password");
        tbl.addColumn("Role");
        tbl_akun.setModel(tbl);
        try {
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM akun");
            int no = 0;
            while (res.next()) {
                tbl.addRow(new Object[]{
                    
                    res.getString("id"),
                    res.getString("nama"),
                    res.getString("username"),
                    res.getString("password"),
                    res.getString("role"),
                          
                });
                tbl_akun.setModel(tbl);
                no++;   
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane,"Gagal Menampilkan Data");
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refresh();
        dispose();
        new Menu2().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM akun WHERE nama LIKE '%" + txt_cari.getText() + "%'" + "");
            //ResultSet res = statement.executeQuery("SELECT * FROM tb_siswa");

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID");
            tbl.addColumn("Nama");
            tbl.addColumn("Username");
            tbl.addColumn("Password");
            tbl.addColumn("Role");
            tbl_akun.setModel(tbl);

            int no = 0;
            while (res.next()) {
                tbl.addRow(new Object[]{
                    
                    res.getString("id"),
                    res.getString("nama"),
                    res.getString("username"),
                    res.getString("password"),
                    res.getString("role"),
                });
                tbl_akun.setModel(tbl);
                no++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Gagal Menampilkan Data");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          String DELETE, id = lbl_id.getText();
        try {
            Statement statement;
            statement = (Statement) koneksi.getConnection().createStatement();
            DELETE = "DELETE FROM akun WHERE id='"+id+"'";
            statement.executeUpdate(DELETE);
            JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
            refresh();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Data Gagal Dihapus"+e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbl_akunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_akunMouseClicked
        // TODO add your handling code here:
        int i = tbl_akun.getSelectedRow();
        if (i==-1){
            return;
        }

        
         String id = (String) tbl_akun.getValueAt(i,0);
        lbl_id.setText(id);
        
        String nama = (String) tbl_akun.getValueAt(i,1);
        txt_nama.setText(nama);

        String user = (String) tbl_akun.getValueAt(i,2);
        txt_user.setText(user);
         String pass = (String) tbl_akun.getValueAt(i,3);
        txt_pass.setText(pass);
        
        String role =(String) tbl_akun.getValueAt(i,4);
        if (role.equals("Admin")) {
            cmb_role.setSelectedIndex(1);
        } else if (role.equals("Petugas")) {
            cmb_role.setSelectedIndex(2);
        }

 

        
    }//GEN-LAST:event_tbl_akunMouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        
       String nama,username,password,role, INSERT;
       
        nama = txt_nama.getText();
        username = txt_user.getText();
        password = txt_pass.getText();
        role = (String) cmb_role.getSelectedItem();
        
        try {
            Statement statement;
            statement = (Statement) koneksi.getConnection().createStatement();
            INSERT = "INSERT INTO akun VALUES (null,'"+nama+"','"+username+"','"+password+"','"+role+"')";
            statement.executeUpdate(INSERT);
            JOptionPane.showMessageDialog(null,"Data Akun Berhasil Disimpan");
            refresh();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Data Akun Gagal Disimpan"+e.getMessage());
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // TODO add your handling code here:
        String nama,username,password,role, INSERT;

        nama = txt_nama.getText();
       username = txt_user.getText();
        role = (String) cmb_role.getSelectedItem();
        password = txt_pass.getText();
       
        try {
            Statement statement;
            statement = (Statement) koneksi.getConnection().createStatement();
            INSERT = "INSERT INTO akun VALUES (null,'"+nama+"','"+username+"','"+password+"','"+role+"',')";
            statement.executeUpdate(INSERT);
            JOptionPane.showMessageDialog(null,"Data Siswa Berhasil Disimpan");
            refresh();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Data Siswa Gagal Disimpan"+e.getMessage());
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

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
            java.util.logging.Logger.getLogger(Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Akun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JComboBox<String> cmb_role;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tbl_akun;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    private void masuk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}