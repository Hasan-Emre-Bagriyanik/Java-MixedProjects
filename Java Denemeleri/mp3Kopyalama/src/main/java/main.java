
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {
    
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();
    
    public static void dosyaOku (){
        
        try {
            FileInputStream in = new FileInputStream("Bilal Sonses & Arda Han - Dayanırım (Official Video).m4a");
            
            int oku;
            
            while((oku = in.read()) != -1){
                icerik.add(oku);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
        
        
    }
    
    
    public static void Kopyala (String dosyaismi){
        
        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);
            
            for(int deger : icerik){
                out.write(deger);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public static void main(String[] args) {
        
        dosyaOku();
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Kopyala("emre.m4a");


            }
        });
         Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Kopyala("emre.m4a");


            }
        });
         Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Kopyala("emre.m4a");


            }
        });
        
        long baslangic = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();
        
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        long bitis = System.currentTimeMillis();
        
        System.out.println("Kopyalama süresi: " + (bitis - baslangic)/1000);
        
    }
}
