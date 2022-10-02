
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;


public class main {
    
    
    public static void kayittanAl(){
        
        File file = new File("kayit.bin");
        Scanner scanner = new Scanner(System.in);
        
        if(file.exists()){
            
            System.out.println("Kaydedilmiş bir oyununuz var. Kaydedilmiş oyununuzdan deavm etmek ister misiniz (yes ya da no): ");
            String cevap = scanner.nextLine();
            
            if(cevap.equals("yes")){
                kartlar = OyunKaydetme.kartdanAl();
                return;
            }
            
        }
        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('H');
        kartlar[2][3] = new Kart('D');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');
    }
    
    
    
    
    
    
    
    
    
    
    
    private static Kart[][] kartlar = new Kart[4][4];
    
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
     
      
      kayittanAl();
       oyun_tablasi();
       while(OyunBittiMi()== false){
       System.out.print("Çıkış yapmak için q'a basın (yes ya da no ): ");
       String cikis= scanner.nextLine();
       
       if(cikis.equals("yes")){
           System.out.print("Oyunu kaydetmek istiyor musunuz? (yes ya da no): ");
           String kayit = scanner.nextLine();
           
           if(kayit.equals("yes")){
               OyunKaydetme.OyunKayit(kartlar);
           }
           else{
               System.out.println("Oyun kaydedilmiyor...");
           }
           System.out.println("Programdan çıkılıyor...");
           break;
           
           
       }
       }
       
       
       tahminEt();
    }
    
    
    public static void tahminEt(){
        while(true){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci tahmin (i ve j değerlerini birer boşluk ile giriniz): ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        
        kartlar[i1][j1].setTahmin(true);
        oyun_tablasi();
        
        
        System.out.print("İkinci tahmin (i ve j değerlerini birer boşluk ile giriniz): ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        
        kartlar[i2][j2].setTahmin(true);
        oyun_tablasi();
        
        if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()){
            System.out.println("Tebrikler... Doğru tahmin");
            kartlar[i1][j1].setTahmin(true);
            kartlar[i2][j2].setTahmin(true);
        }
        else{
            System.out.println("Yanlış tahmin...");
            kartlar[i1][j1].setTahmin(false);
            kartlar[i2][j2].setTahmin(false);
            oyun_tablasi();
        }
        }
        
    }
    
    
    
    public static boolean OyunBittiMi(){
       for(int i=0; i<4; i++){
           for(int j=0;  j<4; j++){
               
               if(kartlar[i][j].setTahmin() == false){
                   return false;
               }                            
           }
       }
       return true;
    }
    
    
    
    public static void oyun_tablasi(){
        
        
        for(int i=0; i<4; i++){
            System.out.println("____________________");
            for(int j=0;  j<4; j++){
                
                if(kartlar[i][j].isTahmin()){
                    System.out.print(" |" + kartlar[i][j].getDeger() + "| ");
                }
                else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("____________________");
        
    }
    
    
}
