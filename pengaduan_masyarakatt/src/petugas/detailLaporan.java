package petugas;
import model.*;
import brain.*;
/**
 *
 * @author ILHAM
 */
public class detailLaporan extends javax.swing.JFrame {
    private TampilModel user;
    private Laporann LaporanM;
    private TampilModel dataLap;
    public detailLaporan(TampilModel Akun, TampilModel pLaporan) {
        setTitle("Halaman Detail Laporan Petugas");
        this.user = Akun;
        this.dataLap = pLaporan;
        
        initComponents();
        id.setText(pLaporan.ColumnD("id_pengaduan"));
        subjek.setText(pLaporan.ColumnD("subjek"));
        tgl_pengaduan.setText(pLaporan.ColumnD("tgl_pengaduan"));
        status_pengaduan.setText(pLaporan.ColumnD("status"));
        isiLaporan.setText(pLaporan.ColumnD("isi_laporan"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        status_pengaduan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        isiLaporan = new javax.swing.JTextArea();
        tanggapanLaporan = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        subjek = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tgl_pengaduan = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("STATUS PENGADUAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 285, -1, -1));
        getContentPane().add(status_pengaduan, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 313, 288, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DETAIL LAPORAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 35, 153, -1));

        jLabel6.setText("ISI LAPORAN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 87, -1, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 81, 37, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 115, 288, -1));

        isiLaporan.setColumns(20);
        isiLaporan.setRows(5);
        jScrollPane1.setViewportView(isiLaporan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 121, 346, 116));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        tanggapanLaporan.setViewportView(jTextArea2);

        getContentPane().add(tanggapanLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 341, 346, 213));

        jLabel3.setText("SUBJEK");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 155, 49, -1));

        jLabel7.setText("TANGGAPAN LAPORAN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 313, -1, -1));
        getContentPane().add(subjek, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 183, 288, -1));

        jLabel4.setText("TGL PENGADUAN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 223, 102, -1));
        getContentPane().add(tgl_pengaduan, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 245, 288, -1));

        btn_back.setBackground(new java.awt.Color(255, 204, 51));
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
       setVisible(false);
       new Home(this.user).setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JTextField id;
    private javax.swing.JTextArea isiLaporan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField status_pengaduan;
    private javax.swing.JTextField subjek;
    private javax.swing.JScrollPane tanggapanLaporan;
    private javax.swing.JTextField tgl_pengaduan;
    // End of variables declaration//GEN-END:variables
}
