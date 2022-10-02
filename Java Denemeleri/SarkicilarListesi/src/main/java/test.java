
import java.util.Scanner;


public class test {
    
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleri_bastir(){
        System.out.println("\t 0-işlemleri görüntüle");
        System.out.println("\t 1-Şarkıcı görüntüle ");
        System.out.println("\t 2-Şarkıcı ekle");
        System.out.println("\t 3-Şarkıcı güncelle");
        System.out.println("\t 4-Şarkıcı sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan çık");
        
    }
    
    public static void sarkici_goruntule(){
        sarkicilar.bastir();
    }
     
    public static void sarkici_ekle(){
        System.out.print("Bir şarkıcı ismi giriniz: ");
        String isim = scanner.nextLine();
        
        sarkicilar.Sarkici_ekle(isim);
    }
    
    public static void sarkici_guncelle(){
        System.out.print("Bir şarkıcı ismi giriniz: ");
        String yeni_isim = scanner.nextLine();
        System.out.print("şarkıcının pozisyonunu giriniz: ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        
        sarkicilar.Sarkici_guncelle(yeni_isim, pozisyon-1);
    }
    
    
    public static void sarkici_sil(){
        
        System.out.print("şarkıcının pozisyonunu giriniz: ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
 
        sarkicilar.Sarkici_sil(pozisyon-1);
    }
    
    
    public static void sarkici_ara(){
        
        System.out.print("Aramak istediğiniz sarkıcı ismi giriniz: ");
        String Sarkici_ismi = scanner.nextLine();
        
        sarkicilar.Sarkici_ara(Sarkici_ismi);
    }
    
    
    
    
    public static void main(String[] args) {
        
        System.out.println("\t Şarkıcılar Listesine Hoş Geldiniz...");
        
        islemleri_bastir();
        boolean cikis =false;
        
        int islem;
        
        while(!cikis){
            
            System.out.print("Lütfen istediğiniz bir işlem seçiniz: ");
            islem = scanner.nextInt();
            scanner.nextLine();
            
            switch(islem){
                
                case 0:
                    islemleri_bastir();
                    break;
                    
                case 1:
                    sarkici_goruntule();
                    break;
                    
                case 2:
                    sarkici_ekle();
                    break;
                
                case 3:
                    sarkici_guncelle();
                    break;
                    
                case 4:
                    sarkici_sil();
                    break;
                    
                case 5:
                    sarkici_ara();
                    break;
                    
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    
                

                
                
                
                
            }
            
            
            
            
            
            
        }
        
        
        
        
        
        
    }
}
