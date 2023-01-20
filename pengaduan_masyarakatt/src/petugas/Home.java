package petugas;

import brain.*;
import javax.swing.JOptionPane;
import model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ILHAM
 */
public class Home extends javax.swing.JFrame {
    private TampilModel user;
    private Petugas PetugasM;
    private TampilModel[] dataP;
    /**
     * Creates new form Home
     */
    public Home(TampilModel Akun) {
        initComponents();
        setTitle("Halaman Petugas");
        this.user = Akun;
        this.dataP = this.PetugasM.Petugas();
        this.showPetugas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_delete = new javax.swing.JButton();
        btn_beriTanggapan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPetugas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_batalPilih = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_delete.setBackground(new java.awt.Color(255, 51, 51));
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_beriTanggapan.setBackground(new java.awt.Color(102, 255, 102));
        btn_beriTanggapan.setForeground(new java.awt.Color(0, 0, 0));
        btn_beriTanggapan.setText("Beri Tanggapan");

        tPetugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Masyarakat", "Tanggal ", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tPetugas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("HALAMAN PETUGAS");

        btn_logout.setBackground(new java.awt.Color(255, 0, 0));
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_batalPilih.setBackground(new java.awt.Color(255, 102, 102));
        btn_batalPilih.setForeground(new java.awt.Color(255, 255, 255));
        btn_batalPilih.setText("Batal Pilih");
        btn_batalPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalPilihActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(255, 204, 51));
        btn_back.setForeground(new java.awt.Color(0, 0, 0));
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_batalPilih)
                                .addGap(18, 18, 18)
                                .addComponent(btn_beriTanggapan))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(181, 181, 181)
                                .addComponent(btn_logout)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btn_back))
                    .addComponent(btn_logout))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_batalPilih)
                    .addComponent(btn_delete)
                    .addComponent(btn_beriTanggapan))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showPetugas() {
        DefaultTableModel tableModel = (DefaultTableModel) tPetugas.getModel();
        for(int i=0; i<this.dataP.length; i++){
            TampilModel sPetugas = this.dataP[i];
            tableModel.addRow(new String[] {
                sPetugas.ColumnD("id_pengaduan"),
                sPetugas.ColumnD("nama_masyarakat"),
                sPetugas.ColumnD("tgl_pengaduan"),
                sPetugas.ColumnD("status"),
            });
        }
    }
    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        stackFunction.logout(this);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_batalPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalPilihActionPerformed
       tPetugas.clearSelection();
    }//GEN-LAST:event_btn_batalPilihActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        setVisible(false);
        new Home(this.user).setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int pilihRow = tPetugas.getSelectedRow();
        if(pilihRow >= 0) {
            int confirm = JOptionPane.showConfirmDialog(this, "WARNING! Hapus data tersebut?");
            if(confirm == 0) {
                String id_petugas = this.dataP[pilihRow].ColumnD("id_petugas");
                boolean hapus = this.PetugasM.delete(id_petugas);
                
                if(hapus) {
                    stackFunction.tampilAlert(this, 1, "SUCCESS! Data telah dihapus");
                    stackFunction.hapusTabelRow(tPetugas, pilihRow);
                    this.dataP = this.PetugasM.Petugas();
                } else {
                    stackFunction.tampilAlert(this, 0, "ERROR! Data tidak dapat dihapus");
                }
            }
            
        } else {
            stackFunction.tampilAlert(this, 0, "Pilih salah satu data jika ingin menghapus!");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Home().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_batalPilih;
    private javax.swing.JButton btn_beriTanggapan;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tPetugas;
    // End of variables declaration//GEN-END:variables
}
