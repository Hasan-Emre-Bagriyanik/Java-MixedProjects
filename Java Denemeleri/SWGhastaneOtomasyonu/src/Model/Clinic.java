
package Model;

import Helper.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Clinic {
    
    private int id;
    private String name;
    
    DatabaseConnector conn = new DatabaseConnector();
    
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement preparedStatement = null;
    
    

    public Clinic(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Clinic () {
        
    }
    
    public ArrayList<Clinic> getlist () throws SQLException  {
        
        ArrayList<Clinic> list = new ArrayList<>();
        Clinic obj;
        Connection con = conn.ConnDB();
        
        try{
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM clinic");
            while(rs.next()){
                obj = new Clinic();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                list.add(obj);
                
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            rs.close();
            st.close();
            con.close();
        }
        return list;
    }
    
    
    public boolean addClinic(String name) throws SQLException{
        
        String query = "INSERT INTO clinic (name) VALUES (?)";
        boolean key = false;
        Connection con = conn.ConnDB();
        try{
            st = con.createStatement();
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
            key = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        if(key == true){
            return true;
        }
        else{
            return false;
        }
        
        
       
    }
    
    
    
    
     public boolean deleteClinic(int id) throws SQLException{
        
        String query = "DELETE FROM clinic WHERE id = ?";
        boolean key = false;
        Connection con = conn.ConnDB();
        try{
            st = con.createStatement();
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            key = true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        if(key == true){
            return true;
        }
        else{
            return false;
        }
        
        
       
    }
    
    
     
     
     
     
     
     
     
     public boolean updateClinic(int id , String name) throws SQLException{
        
        String query = "UPDATE clinic SET  name = ?  WHERE id = ?";
        boolean key = false;
        Connection con = conn.ConnDB();
        
        try{
            st = con.createStatement();
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            key = true;
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        
        if(key == true){
            return true;
        }
        else{
            return false;
        }
        
        
       
    }
    
     
     public Clinic getFetch(int id) throws SQLException{
         Connection con = conn.ConnDB();
         st = con.createStatement();
         rs = st.executeQuery("SELECT * FROM clinic WHERE id = " + id);
         Clinic c = new Clinic();
         while(rs.next()){
             c.setId(rs.getInt("id"));
             c.setName(rs.getString("name"));
             break;
         }
         
         return c;
         
     }
     
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
