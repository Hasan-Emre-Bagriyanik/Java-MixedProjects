
import java.awt.BorderLayout;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        
        System.out.println("Kumanda Programına Hoş Geldiniz... ");
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler ="İşlemler...\n" 
                +"1-Kanalları göster\n"
                +"2-Kanal ekle\n"
                +"3-Kanal sil\n"
                +"4-Kanal sayısı öğrenme\n"
                +"Çıkış için q'a basınız\n";
        
        Kumanda kumanda = new Kumanda();
        
        while(true){
            System.out.println(islemler);
            System.out.print("İşleminizi seçiniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                kanallariGoster(kumanda);
            }
             else if(islem.equals("2")){
                System.out.print("Kanal adı giriniz: ");
                String kanall = scanner.nextLine();
                kumanda.kanalEkle(kanall);
            }
             else if(islem.equals("3")){
                System.out.print("Silinecek olan kanalı giriniz: ");
                String kanaal = scanner.nextLine();
                kumanda.kanalSil(kanaal);
            }
             else if(islem.equals("4")){
                System.out.println("Kanal Sayısı: " + kumanda.kanalSayisi());
            }
             else {
                 System.out.println("Hatalı işlem yaptınız...");
             }
            
        }
        
        
        
        
    }
    
    public static void kanallariGoster(Kumanda kumanda){
        
        if(kumanda.kanalSayisi() == 0){
            System.out.println("Kanal bulunmamaktadır...");
        }
        else{
            for(String kanal : kumanda){
                System.out.println("Kanallar: " + kanal);
            }
        }
        
        
    }
}
