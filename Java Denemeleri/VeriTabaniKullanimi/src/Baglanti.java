
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Baglanti {
    
    private String kullanici_adi = "root";
    private String parola = "";
    
    private String db_ismi = "demo";
    
    private String host = "localhost";
    
    private int port = 3306;
    
    private Connection con = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    
    
    
    
    public void commitverollback(){
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            con.setAutoCommit(false);
            
            String sorgu1 = "Delete From calisanlar where id = 3";
            String sorgu2 = "Update calisanlar Set email = 'hasanemrebgrynk03@gmail.com' where id = 1";
            
            System.out.println("Güncellemeden önce...");
            calisanlariGetir();
            
            Statement statement = con.createStatement();
            
            statement.executeUpdate(sorgu1);
            statement.executeUpdate(sorgu2);
            
            System.out.print("İşlemler kaydedilsin mi (yes/no): ");
            String cevap = scanner.nextLine();
            
            if(cevap.equals("yes")){
                con.commit();
                calisanlariGetir();
                System.out.println("Çalışanlar dosyası güncellenmiştir...");
            }
            else{
                con.rollback();
                System.out.println("Çalışanlar dosyası güncellenmemiştir...");
                calisanlariGetir();
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public void preparedCalisanlariGetir(int id){
       
       String sorgu = "Select * From calisanlar where id = ?";
       
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                
                System.out.println("Ad: "+ ad + "  Soyad: " + soyad + "  email: " + email);
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public void calisanlariEkle(){
        
        try {
            statement = con.createStatement();
            
            String ad = "Sefa";
            String soyad = "EKİN";
            String email = "sefaekin@gmail.com";
            
            String sorgu = "Insert Into calisanlar (ad,soyad,email) VALUES (" + "'" + ad + "'" + ",'" + soyad +"'" + ",'" + email + "'" +")";  
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void calisanlariSil(){
        
        try {
            statement = con.createStatement();
            
            String sorgu = "Delete from calisanlar where id > 3";
            
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
         
    
    public void calisanlariGuncelle(){
        
        try {
            statement = con.createStatement();
            
            String sorgu = "update calisanlar Set email = 'hasanemrebgrynk03gmail.com' where id = 1";
            
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public void calisanlariGetir(){
        
        String sorgu = "Select * From calisanlar";
        
        try {
            statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("id: " +  id + "  Adı: " + ad + "  Soyadı: " + soyad + "  email: " + email);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public Baglanti(){
        
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı...");
        }
        
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı başarılı...");
        } catch (SQLException ex) {
            //System.out.println("Bağlantı başarısız...");
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Baglanti comrol = new Baglanti();
        comrol.commitverollback();
        //Baglanti baglanti = new Baglanti();
       // baglanti.preparedCalisanlariGetir(3);
        /*System.out.println("Eklemeden Önce ...");
        baglanti.calisanlariGetir();
        System.out.println("******************************************");
        baglanti.calisanlariEkle();
        baglanti.calisanlariGetir();
        System.out.println("******************************************");
        System.out.println("Güncellendeikten sonra...");
        baglanti.calisanlariGuncelle();
        baglanti.calisanlariGetir();
        System.out.println("********************************************");
        baglanti.calisanlariSil();
        baglanti.calisanlariGetir();*/
                
    }
    
}
