package model;
import java.sql.*;
import brain.*;
/**
 *
 * @author ILHAM
 */
public class Masyarakat extends MainModel {
    private final String[] namaColumn = {
        "nik",
        "nama",
        "username",
        "password",
        "telp"
    };
    
    public TampilModel Akun(String username){
        ResultSet dataM = this.tampilQuery("SELECT * FROM masyarakat WHERE username = '" +username+ "'");
        
        try{
            if(!dataM.next()){
                return null;
            }
            
        return new TampilModel(this.namaColumn, new String[]{
            dataM.getString("nik"),
            dataM.getString("nama"),
            dataM.getString("username"),
            dataM.getString("password"),
            dataM.getString("telp"),
            });
        }catch(SQLException execute){
            System.out.println("!, " + execute.getMessage());
            return null;
        }
    }
    
    public boolean registMas(String akun[]) {
        return this.manipulasiQuery("INSERT INTO masyarakat (nik, nama, username, password, telp) VALUES('"
                + akun[0] + "', '"
                + akun[1] + "', '"
                + akun[2] + "', '"
                + akun[3] + "', '"
                + akun[4] + "')"
        );  
    } 
 }
