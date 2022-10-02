
import java.util.Scanner;


public class ArmstrongSayiOlupOlmadigiKontrolu {

    public static void main(String[] args) {
       
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayı = scanner.nextInt();
        System.out.println("Sayının basamak sayısını giriniz: ");
        int basamak_sayısı = scanner.nextInt();
        
        
        int gecici_sayı = sayı;
        int toplam = 0;
        
        do {            
            
            int basamak_degeri = gecici_sayı % 10;
            gecici_sayı /= 10;
            
            toplam = (int) Math.pow(basamak_degeri, basamak_sayısı);
                                            
            
        } while (gecici_sayı > 0);
        
        
        if (sayı == toplam)
        {
            System.out.println("Bu sayı bir Amrsttrong sayıdır...");
        }
        else{
             System.out.println("Bu sayı bir Amrsttrong sayı değildir...");
        }
        
        
        
        
    }
}
