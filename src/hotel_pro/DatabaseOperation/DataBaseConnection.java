package hotel_pro.DatabaseOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;






public class DataBaseConnection {

    //Connection conn = null;
    public static Connection connectTODB()
    {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
//            com.mysql.cj.jdbc.Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","passwordmahitnahi");
          //  JOptionPane.showMessageDialog(null, "Connection Establishment");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
        
        
    }
    
}
