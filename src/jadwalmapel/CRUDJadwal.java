/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadwalmapel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author Dell
 */
public class CRUDJadwal extends javax.swing.JFrame {

    /**
     * Creates new form CRUDJadwal
     */
    public CRUDJadwal() {
        initComponents();
        showTable();
        formKosong();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGuru = new javax.swing.JTextField();
        txtSelesai = new javax.swing.JTextField();
        comboHari = new javax.swing.JComboBox<>();
        comboKelas = new javax.swing.JComboBox<>();
        txtMulai = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCRUD = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtTambah = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        pane3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        pane2 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 246, 246));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setText("Jam Selesai : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 400, 130, 13);

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Cheri", 1, 30)); // NOI18N
        jLabel3.setText("    APLIKASI CRUD DATABASE \"JADWAL MAPEL\"");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 650, 80);

        jLabel4.setText("Nama Mapel : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 100, 80, 13);

        jLabel5.setText("Guru Pengampu : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 160, 130, 13);

        jLabel6.setText("Kelas : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 220, 130, 20);

        jLabel7.setText("Hari : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 280, 130, 13);

        jLabel8.setText("Jam Mulai : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 340, 130, 13);

        txtGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuruActionPerformed(evt);
            }
        });
        getContentPane().add(txtGuru);
        txtGuru.setBounds(30, 180, 260, 30);

        txtSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(txtSelesai);
        txtSelesai.setBounds(30, 420, 260, 30);

        comboHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Senin", "Selasa", "Rabu", "Kamis", "Jumat" }));
        comboHari.setBorder(null);
        comboHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHariActionPerformed(evt);
            }
        });
        getContentPane().add(comboHari);
        comboHari.setBounds(30, 300, 260, 30);

        comboKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XI RPL 1 ", "XI RPL 2", "XI RPL 3", "XI RPL 4", "XI RPL 5", "XI RPL 6" }));
        comboKelas.setBorder(null);
        getContentPane().add(comboKelas);
        comboKelas.setBounds(30, 240, 260, 30);

        txtMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMulaiActionPerformed(evt);
            }
        });
        getContentPane().add(txtMulai);
        txtMulai.setBounds(30, 360, 260, 30);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama);
        txtNama.setBounds(30, 120, 220, 30);

        txtID.setEditable(false);
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtID.setEnabled(false);
        txtID.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(txtID);
        txtID.setBounds(250, 120, 40, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("ID :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 100, 40, 13);

        tableCRUD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Mapel", "Guru Pengampu", "Kelas", "Hari", "Jam Mulai", "Jam Selesai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCRUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCRUDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCRUD);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(330, 160, 590, 300);

        btnHapus.setBackground(new java.awt.Color(255, 153, 153));
        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.setBorder(new javax.swing.border.MatteBorder(null));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus);
        btnHapus.setBounds(520, 110, 100, 30);

        btnEdit.setBackground(new java.awt.Color(255, 153, 153));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.setBorder(new javax.swing.border.MatteBorder(null));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(650, 110, 100, 30);

        btnUpdate.setBackground(new java.awt.Color(255, 153, 153));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(new javax.swing.border.MatteBorder(null));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(770, 110, 100, 30);

        txtTambah.setBackground(new java.awt.Color(255, 153, 153));
        txtTambah.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtTambah.setText("TAMBAH");
        txtTambah.setBorder(new javax.swing.border.MatteBorder(null));
        txtTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTambahActionPerformed(evt);
            }
        });
        getContentPane().add(txtTambah);
        txtTambah.setBounds(390, 110, 100, 30);

        jScrollPane3.setBackground(new java.awt.Color(102, 102, 102));

        pane3.setEditable(false);
        pane3.setBackground(new java.awt.Color(228, 228, 228));
        pane3.setBorder(null);
        pane3.setAutoscrolls(false);
        pane3.setEnabled(false);
        pane3.setVerifyInputWhenFocusTarget(false);
        jScrollPane3.setViewportView(pane3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(320, 90, 610, 380);

        jScrollPane4.setBackground(new java.awt.Color(102, 102, 102));

        pane2.setEditable(false);
        pane2.setBackground(new java.awt.Color(228, 228, 228));
        pane2.setBorder(null);
        pane2.setAutoscrolls(false);
        pane2.setEnabled(false);
        pane2.setVerifyInputWhenFocusTarget(false);
        jScrollPane4.setViewportView(pane2);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(10, 90, 300, 380);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 940, 80);

        setSize(new java.awt.Dimension(951, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuruActionPerformed

    private void txtSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelesaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelesaiActionPerformed

    private void txtMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMulaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMulaiActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            String sql ="DELETE FROM mapel WHERE id ='"+txtID.getText()+"'";
            java.sql.Connection conn =(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Berhasil Menghapus Data");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        showTable();
        formKosong();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // Edit Data
        try {
            String sql ="UPDATE mapel SET nama = '"+txtNama.getText()+"', guru = '"+txtGuru.getText()+"', kelas = '"+comboKelas.getSelectedItem()+"', hari = '"+comboHari.getSelectedItem()+"', jam_mulai = '"+txtMulai.getText()+"', jam_selesai = '"+txtSelesai.getText()+"' WHERE id = '"+txtID.getText()+"'";
            java.sql.Connection conn=(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Mengedit Data");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal : "+e.getMessage());
        }
        showTable();
        formKosong();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        showTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void comboHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHariActionPerformed
        
    }//GEN-LAST:event_comboHariActionPerformed

    private void txtTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTambahActionPerformed
        try {
            String sql = "INSERT INTO mapel (nama, guru, kelas, hari, jam_mulai, jam_selesai) VALUES ('"+txtNama.getText()+"','"+txtGuru.getText()+"','"+comboKelas.getSelectedItem()+"','"+comboHari.getSelectedItem()+"','"+txtMulai.getText()+"','"+txtSelesai.getText()+"')";
            java.sql.Connection conn =(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        showTable();
        formKosong();
    }//GEN-LAST:event_txtTambahActionPerformed

    private void tableCRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCRUDMouseClicked
        // Menampilkan data kedalam form pengisian:
        int baris = tableCRUD.rowAtPoint(evt.getPoint());
        String id = tableCRUD.getValueAt(baris, 0).toString();
        txtID.setText(id);
        String nama =tableCRUD.getValueAt(baris, 1).toString();
        txtNama.setText(nama);
        String guru = tableCRUD.getValueAt(baris, 2).toString();
        txtGuru.setText(guru);
        String kelas = tableCRUD.getValueAt(baris, 3).toString();
        comboKelas.setSelectedItem(kelas);
        String hari = tableCRUD.getValueAt(baris, 4).toString();
        comboHari.setSelectedItem(hari);
        String mulai =tableCRUD.getValueAt(baris, 5).toString();
        txtMulai.setText(mulai);
        String selesai = tableCRUD.getValueAt(baris, 6).toString();
        txtSelesai.setText(selesai);
    }//GEN-LAST:event_tableCRUDMouseClicked

    private void showTable(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Nama Mapel");
        model.addColumn("Guru Pengampu");
        model.addColumn("Kelas");
        model.addColumn("Hari");
        model.addColumn("Jam Mulai");
        model.addColumn("Jam Selesai");
        
        //menampilkan data database kedalam tabel
        try {
            String sql = "SELECT * FROM mapel";
            java.sql.Connection conn=(Connection)koneksi.koneksi();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
            }
            tableCRUD.setModel(model);
        } catch (Exception e) {
        }
    }
    
    private void formKosong(){
        txtID.setText(null);
        txtNama.setText(null);
        txtGuru.setText(null);
        comboKelas.setSelectedItem(this);
        comboHari.setSelectedItem(this);
        txtMulai.setText(null);
        txtSelesai.setText(null);  
    }
    
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
            java.util.logging.Logger.getLogger(CRUDJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboHari;
    private javax.swing.JComboBox<String> comboKelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane pane2;
    private javax.swing.JTextPane pane3;
    private javax.swing.JTable tableCRUD;
    private javax.swing.JTextField txtGuru;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMulai;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSelesai;
    private javax.swing.JButton txtTambah;
    // End of variables declaration//GEN-END:variables
}
