/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NA
 */
public class frmMain extends javax.swing.JFrame {
        String nis;
        String nama;
        String kelas;
        String email;
        String alamat;
        String JK="";
        
    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tNis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rLK = new javax.swing.JRadioButton();
        rPR = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        tKelas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tAlamat = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(166, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic School");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 70);

        jPanel2.setBackground(new java.awt.Color(96, 227, 96));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ISIAN DATA SISWA");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 10, 119, 15);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 80, 270, 40);

        jPanel3.setBackground(new java.awt.Color(96, 227, 96));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NIS");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 10, 59, 15);

        tNis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(tNis);
        tNis.setBounds(20, 30, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nama");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 70, 59, 15);

        tNama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(tNama);
        tNama.setBounds(20, 90, 240, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Jenis Kelamin");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 130, 230, 15);

        buttonGroup2.add(rLK);
        rLK.setText("Laki-laki");
        jPanel3.add(rLK);
        rLK.setBounds(20, 150, 70, 30);

        buttonGroup2.add(rPR);
        rPR.setText("Perempuan");
        jPanel3.add(rPR);
        rPR.setBounds(100, 150, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Kelas");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 190, 59, 15);

        tKelas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(tKelas);
        tKelas.setBounds(20, 210, 240, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Alamat");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 310, 59, 15);

        tEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(tEmail);
        tEmail.setBounds(20, 270, 240, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Email");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 250, 59, 15);

        tAlamat.setColumns(20);
        tAlamat.setRows(5);
        jScrollPane2.setViewportView(tAlamat);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 330, 240, 110);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-10, 130, 270, 460);

        jPanel4.setBackground(new java.awt.Color(96, 227, 96));
        jPanel4.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(80, 10, 80, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(170, 10, 80, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(260, 10, 80, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Refresh");
        jButton4.setMaximumSize(new java.awt.Dimension(80, 20));
        jButton4.setPreferredSize(new java.awt.Dimension(80, 20));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(350, 10, 80, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(440, 10, 80, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(270, 80, 610, 50);

        jPanel5.setBackground(new java.awt.Color(96, 227, 96));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama Siswa", "Jenis Kelami", "Kelas", "Email", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(270, 140, 610, 450);

        setSize(new java.awt.Dimension(888, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        alamat = tAlamat.getText();
        email = tEmail.getText();
        nis = tNis.getText();
        nama = tNama.getText();
        kelas = tKelas.getText();
// TODO add your handling code here:
        if ("".equals(nis)||"".equals(nama)||"".equals(kelas)||"".equals(email)||"".equals(alamat)) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi data", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            //String JK = "";
            if (rLK.isSelected()) {
                JK = "L";
            }else{
                JK = "P";
            }
            String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat)"
                    + "VALUES('"+nis+"','"+nama+"','"+JK+"','"+kelas+"','"+email+"','"+alamat+"')";
            int status = koneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
        if (baris!=-1){
            String NIS = jTable1.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = koneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih baris terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        tNis.setText("");
        tNama.setText("");
        tKelas.setText("");
        buttonGroup2.clearSelection();
        tEmail.setText("");
        tAlamat.setText("");
        tNis.setEditable(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        alamat = tAlamat.getText();
        email = tEmail.getText();
        nis = tNis.getText();
        nama = tNama.getText();
        kelas = tKelas.getText();
// TODO add your handling code here:
        if ("".equals(nis)||"".equals(nama)||"".equals(kelas)||"".equals(alamat)||"".equals(email)) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapidata", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            if (rLK.isSelected()) {
                JK ="L";
            } else{
                JK ="P";
            }
            String SQL = "UPDATE t_siswa SET NIS='"+nis+"',"
                    + "NamaSiswa='"+nama+"',"
                    + "JenisKelamin='"+JK+"',"
                    + "Kelas='"+kelas+"',"
                    + "Email='"+email+"',"
                    + "Alamat='"+alamat+"'"
                    + "WHERE NIS='"+nis+"'";
            int status = koneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
        if (baris!=-1){
            tNis.setText(jTable1.getValueAt(baris, 0).toString());
            tNis.setEditable(false);
            tNama.setText(jTable1.getValueAt(baris, 1).toString());
            if ("Laki-Laki".equals(jTable1.getValueAt(baris, 2).toString())) {
                rLK.setSelected(true);
            }else{
                rPR.setSelected(true);
            }
            tKelas.setText(jTable1.getValueAt(baris, 3).toString());
            tEmail.setText(jTable1.getValueAt(baris, 4).toString());
            tAlamat.setText(jTable1.getValueAt(baris, 5).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rLK;
    private javax.swing.JRadioButton rPR;
    private javax.swing.JTextArea tAlamat;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tKelas;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNis;
    // End of variables declaration//GEN-END:variables

    public void selectData() {
        String kolom[] = {"NIS","Nama Siswa","Jenis Kelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);        
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = koneksiDB.executeQuery(SQL);
        try {
            while (rs.next()) {                
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(3))) {
                    JenisKelamin = "Laki-Laki";
                }else{
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(4);
                String Email = rs.getString(5);
                String Alamat = rs.getString(6);
                String data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat};
                dtm.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setModel(dtm);
    }
}
