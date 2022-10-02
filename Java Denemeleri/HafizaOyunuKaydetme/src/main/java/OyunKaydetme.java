
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OyunKaydetme {
    
    public static void OyunKayit (Kart[][] kartlar) throws IOException{
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayit.bin"))){
            
            System.out.println("Oyun kaydediliyor...");
            
            out.writeObject(kartlar);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OyunKaydetme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    public static Kart[][] kartdanAl (){
          
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayit.bin"))){
            
            Kart[][] cikti = (Kart[][])in.readObject();
            
            
           return cikti;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OyunKaydetme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OyunKaydetme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OyunKaydetme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
