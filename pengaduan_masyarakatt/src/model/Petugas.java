package model;
import java.sql.*;

/**
 *
 * @author ILHAM
 */
public class Petugas extends MainModel {
//    Final Private Memodifikasi Default Method
    private final String[] NamaColumn = {
        "id_petugas",
        "nama_petugas",
        "username",
        "password",
        "telp",
        "level",
    };
    
    public TampilModel Akun(String username){
        ResultSet dataP = this.tampilQuery("SELECT * FROM petugas WHERE username = '" +username+ "'");
        try{
            if(!dataP.next()){
                return null;
            }
            
            return new TampilModel(this.NamaColumn, new String[] {
                dataP.getString("id_petugas"),
                dataP.getString("nama_petugas"),
                dataP.getString("username"),
                dataP.getString("password"),
                dataP.getString("telp"),
                dataP.getString("level"),
            });
            
        }catch(SQLException execute) {
            System.out.println(execute.getMessage());
            return null;
        }
    }
    
    public TampilModel[] Petugas() {
       String query = "SELECT * FROM petugas";
        int jumlahPetugas = this.numRows(query);
        ResultSet dataP = this.tampilQuery(query);
        
        TampilModel[] tampil = new TampilModel[jumlahPetugas];
        int i=0;
        
        try {
            while(dataP.next()) {
                tampil[i] = new TampilModel(this.NamaColumn, new String[] {
                    dataP.getString("id_petugas"),
                    dataP.getString("nama_petugas"),
                    dataP.getString("username"),
                    dataP.getString("password"),
                    dataP.getString("telp"),
                    dataP.getString("level"),
                });
            
                i++;
            }
            
            return tampil;
        } catch(SQLException execute) {
            System.out.println("Gagal mendapatkan seluruh data petugas, " + execute.getMessage());
            return null;
        }
    }
    
    public boolean delete(String id_petugas) {
        return this.manipulasiQuery("DELETE FROM petugas WHERE id_petugas = '" +id_petugas+ "'");
    }
    
    public boolean PetugasAdd(String[] newPetugas) {
        return this.manipulasiQuery("INSERT INTO petugas (nama_petugas, username, password, telp, level) VALUES ('"
                + newPetugas[0] + "', '"
                + newPetugas[1] + "', '"
                + newPetugas[2] + "', '"
                + newPetugas[3] + "', '"
                + newPetugas[4] + "')"
        );
    }
    
    public boolean edit(String id_petugas, String[] petugasEdit) {
        return this.manipulasiQuery("UPDATE petugas SET nama_petugas = '"
                + petugasEdit[0] + "', username = '"
                + petugasEdit[1] + "', password = '"
                + petugasEdit[2] + "', telp = '"
                + petugasEdit[3] + "', level = '"
                + petugasEdit[4] + "' WHERE id_petugas = '" +id_petugas+ "'");
    }
}
