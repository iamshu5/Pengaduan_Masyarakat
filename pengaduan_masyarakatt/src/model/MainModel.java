package model;
import java.sql.*;

/**
 *
 * @author ILHAM
 */
public class MainModel {
    public Connection koneksi;
    
    public MainModel() {
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            this.koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/pengaduan_masyarakat_ilham", "root", "");
        }catch(SQLException execute) {
            System.out.println("Tidak Dapat Terhubung ke Database");
            System.out.println(execute.getMessage());
        }
    }
    
//    Get Data
    public ResultSet tampilQuery(String query) {
        try{
            Statement stmnt = this.koneksi.createStatement();
            return stmnt.executeQuery(query);
        }catch(SQLException execute){
            System.out.println("Tidak dapat menampilkan Data! " + execute.getMessage());
            return null;
        }
    }
    
//    Ubah Data
    public boolean manipulasiQuery(String query) {
         try{
            Statement statement = this.koneksi.createStatement();
            statement.executeUpdate(query);
            return true;
        }catch(SQLException execute){
            System.out.println("Tidak dapat mengubah data! " + execute.getMessage());
            return false;
        }
    }
    
    public int numRows(String query) {
        try{
            Statement stmnt = this.koneksi.createStatement();
            ResultSet ex = stmnt.executeQuery(query);
            int baris = 0;
            
            while(ex.next()){
                baris++;
            }
            return baris;
            
        }catch(SQLException execute) {
            System.out.println("Gagal Menampilkan Data! " + execute.getMessage());
            return 0;
        }
    }
}