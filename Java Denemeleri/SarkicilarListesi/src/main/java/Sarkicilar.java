
import java.util.ArrayList;


public class Sarkicilar {
    
    private ArrayList<String> arraylist = new ArrayList<String>();
    
    public void bastir(){
        
        System.out.println("Şarkıcılar listesinde " + arraylist.size() + " kadar şarkıcı var.");
        
        for(int i=0; i< arraylist.size(); i++){
            System.out.println((i+1) + " Şarkıcı: " + arraylist.get(i));
        }
    }
    
    
    
    public void Sarkici_ekle(String isim){
        
        arraylist.add(isim);
        System.out.println("Şarkıcı listesi güncellendi...");
    }
    
    
    
    public void Sarkici_sil(int pozisyon ){
        
        String isim  = arraylist.get(pozisyon);
        arraylist.remove(pozisyon);
        
        System.out.println("Şarkıcı listesi güncellendi...");
    }
    
    
    public void Sarkici_guncelle(String yeni_isim , int pozisyon){
        
        arraylist.set(pozisyon, yeni_isim);
        System.out.println("Şarkıcı listesi güncellendi...");

    } 
    
    
    public void Sarkici_ara(String Sarkici_ismi){
        
        int pozisyon = arraylist.indexOf(Sarkici_ismi);
        
        if (pozisyon >= 0){
            
            System.out.println("Şarkıcı bulundu.");
            System.out.println(Sarkici_ismi + " isimli şsrkıcı " + (pozisyon+1) + ". nolu yerde...");
        }
        
    }
    
}
