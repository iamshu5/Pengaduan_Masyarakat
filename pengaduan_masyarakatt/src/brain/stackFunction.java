package brain;

//import javax.swing.JOptionPane;
import java.sql.Date;
import javax.swing.*;
import javax.swing.table.*;

public class stackFunction {
    public static void tampilAlert(JFrame parentFrame, int status, String message) {
        String dialogAlert = (status == 1) ? "SUCCSESS" : "ERROR";
        int iconAlert = (status == 1) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE;
        JOptionPane.showMessageDialog(parentFrame, message, dialogAlert, iconAlert);
    }
    
    
    public static void hapusTabelRow(JTable tabel, int row) {
        DefaultTableModel tabelModel = (DefaultTableModel) tabel.getModel();
        tabelModel.removeRow(row);
    }
            
    public static void logout(JFrame currentFrame) {
        tampilAlert(currentFrame, 0, "Anda Sudah Logout");
        currentFrame.setVisible(false);
        new login().setVisible(true);
    }
    
    public static String tanggal() {
        return new Date(System.currentTimeMillis()).toString();
    }
}
