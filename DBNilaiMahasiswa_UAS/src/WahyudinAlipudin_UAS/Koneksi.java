package WahyudinAlipudin_UAS;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection koneksi;
    
    public static Connection Koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/inputnilai", "root", "");
            JOptionPane.showMessageDialog(null,"DATABASE Tersambung","Info",JOptionPane.INFORMATION_MESSAGE);
            return koneksi;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
}
