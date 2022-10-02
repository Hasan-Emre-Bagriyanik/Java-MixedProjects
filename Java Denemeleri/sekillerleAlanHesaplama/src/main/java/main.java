
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "1- Karenin alanı\n"
                +"2-Dairenin alanı\n"
                +"3-Üçgenin alanı\n"
                +"çıkış için 0'a basınız.\n";
        
        while(true){
            
            System.out.println(islemler);
            System.out.print("Alanını almak istediğiniz bir şekil seçiniz: ");
            String sekil_turu = scanner.nextLine();
           
            
            Sekil sekil= null;
            
            if(sekil_turu.equals("0")){
                
                System.out.println("Sistemden çıkılıyor...");
                break;
            }
            else if(sekil_turu.equals("1")){
                System.out.print("Karenin kenarını giriniz: ");
                int kenar = scanner.nextInt();
                
                sekil = new Kare(kenar, "Kare1");
                
                sekil.alanHesaplama();
            }
            else if(sekil_turu.equals("2")){
                System.out.print("Dairenin yarıçapını giriniz: ");
                int yaricap = scanner.nextInt();
                
                sekil = new Daire(yaricap, "Daire1");
                
                sekil.alanHesaplama();
            }
            else if(sekil_turu.equals("3")){
                System.out.print("Üçgenin birinci kenarını giriniz:");
                int a = scanner.nextInt();
                System.out.print("Üçgenin ikinci kenarını giriniz:");
                int b = scanner.nextInt();
                System.out.print("Üçgenin üçüncü kenarını giriniz:");
                int c = scanner.nextInt();
                
                sekil = new Ucgen(a, b, c, "Üçgen1");
                
                sekil.alanHesaplama();


            }
            else {
                System.out.println("Hatalı işlem yaptınız...");
            }
            
            
            
        }
        
        
    }
    
}
