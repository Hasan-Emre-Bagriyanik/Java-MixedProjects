
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik problemlerine hoş geldiniz...");
        
        String islemler = " 1-Dairenin alanı hesaplama\n"
                +"2-Üçgenin çevresini hesaplama\n"
                +"3-İKi vektörün iç çarpımını hesaplama\n"
                +"4-Çıkış yapmak için q'a basınız\n";
        
        while(true){
            System.out.println("****************************************");
            System.out.println(islemler);
            System.out.println("****************************************");
            System.out.print("İşleminizi seçiniz: ");
            String secim = scanner.nextLine();
            
            
            if(secim.equals("q")){
                System.out.println("Sistemden çıkılıyor...");
                break;
            }
            else if(secim.equals("1")){
                System.out.print("Dairenin yarıçapını giriniz: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                Problemler.Matematik.Daire_alani(yaricap);
            }
            else if(secim.equals("2")){
                System.out.println("Üçgenin kenarlarını giriniz...");
                System.out.print("Birinci kenar: ");
                int kenar1 = scanner.nextInt();
                System.out.print("İkinci kenar: ");
                int kenar2 = scanner.nextInt();
                System.out.print("Üçüncü kenar: ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                Problemler.Matematik.Ucgenin_cevresi(kenar1, kenar2, kenar3);
                
            }
            else if (secim.equals("3")){
                
                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vektör2");
                
                
                Problemler.Fizik.ic_carpim(vec1, vec2);
                
            }
            else {
                System.out.println("Yanlış seçim yaptınız...");
            }
            
            
        }
        
        
        
    }
}
