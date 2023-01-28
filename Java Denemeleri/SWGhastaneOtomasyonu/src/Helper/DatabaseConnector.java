package Helper;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnector {
   
    Connection c = null;

    public DatabaseConnector() {
    }
    
    public Connection ConnDB(){
        
        try{
            this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?user=root&password=heb203941");
            return c;
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public class Databes {
    
    public static final String kullanici_adi = "root";
    public static final  String parola = "";
    
    public static final String db_ismi = "demo";
    
    public static final String host = "localhost";
    
    public static final int port = 3306;
    
}
    

}
