package model;
import java.sql.*;

public class Laporann extends MainModel {
    private final String[] namaColumn = {
        "id_pengaduan",
        "nik",
        "tgl_pengaduan",
        "subjek",
        "isi_laporan",
        "status",
        "nama_masyarakat",
    };
    
//  Menampilkan Data Laporan 
    public TampilModel[] semuaLaporan(){
        String query ="SELECT * FROM pengaduan";
        int jumlahLaporan = this.numRows(query);
        ResultSet dataLap = this.tampilQuery(query);
        
        TampilModel[] tampil = new TampilModel[jumlahLaporan];
        int i = 0;
        
        try{
            while(dataLap.next()) {
                tampil[i] = new TampilModel(this.namaColumn, new String[] {
                    dataLap.getString("id_pengaduan"),
                    dataLap.getString("nik"),
                    dataLap.getString("tgl_pengaduan"),
                    dataLap.getString("subjek"),
                    dataLap.getString("isi_laporan"),
                    dataLap.getString("status"),
                });
                i++;
            }
            return tampil;
        }
        catch(SQLException execute) {
            System.out.println("Tidak dapat menampilkan Data Laporan! " + execute.getMessage());
            return null;
        }
    }

    
//    Query Verifikasi Data     
    public boolean verification(String id) {
        return this.manipulasiQuery("UPDATE pengaduan SET status = 'proses' WHERE id_pengaduan = '"+id+ "'" );
    }
    
//    Query Tambah
    public boolean tambahLap(String[] dataLap) {
        return this.manipulasiQuery("INSERT INTO pengaduan (nik, tgls_pengaduan, subjek, isi_laporan, status VALUES ('"
                + dataLap[0] + ", '"
                + dataLap[1] + ", '"
                + dataLap[2] + ", '"
                + dataLap[3] + ", '"
                + dataLap[4] + "')"
        );
    }
    
//    Query Hapus
    public boolean delete(String id) {
        this.manipulasiQuery("DELETE FROM tanggapan WHERE id_pengaduan = '" +id+ "'");
        return this.manipulasiQuery("DELETE FROM pengaduan WHERE id_pengaduan = '" +id+ "'");
    }
    
//    
    public TampilModel[] laporanPetugas() {
        String query = "SELECT pengaduan.*, masyarakat.nama AS nama_masyarakat FROM pengaduan LEFT JOIN masyarakat ON masyarakat.nik = pengaduan.nik";
        int jumlahLaporan = this.numRows(query);
        ResultSet dataLap = this.tampilQuery(query);
        
        TampilModel[] tampil = new TampilModel[jumlahLaporan];
        int i=0;
        
        try{
            while(dataLap.next()) {
                tampil[i] = new TampilModel(this.namaColumn, new String[] {
                    dataLap.getString("id_pengaduan"),
                    dataLap.getString("nik"),
                    dataLap.getString("tgl_pengaduan"),
                    dataLap.getString("subjek"),
                    dataLap.getString("isi_laporan"),
                    dataLap.getString("status"),
                    dataLap.getString("nama_masyarakat"),
                });
                i++;
            }
            return tampil;
            
        }catch(SQLException execute) {
            System.out.println("Tidak ada data yang dapat ditampilkan " + execute.getMessage());
            return null;
        }
    }
}
