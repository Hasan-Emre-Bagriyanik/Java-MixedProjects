
import java.util.Scanner;

//Armstrong sayı her basamağındaki sayının basamak değeri ile çarpılması ve bu aynı sayıya eşit olması demektir.
//örneğin; 1634 sayısı 1*4  6*4  3*4  4*4  şeklindedir.


public class main {
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayı = scanner.nextInt();
        System.out.print("Sayının basamak sayısını giriniz: ");
        int basamak_sayısı = scanner.nextInt();
        
        
        int gecici_sayı = sayı;
        int toplam = 0;
        
        do {            
            
            int basamak_degeri = gecici_sayı % 10;
            gecici_sayı /= 10;
            
            toplam += (int) Math.pow(basamak_degeri, basamak_sayısı);
                                            
            
        } while (gecici_sayı > 0);
        
        
        if (sayı == toplam)
        {
            System.out.println("Bu sayı bir Amrstrong sayıdır...");
        }
        else{
             System.out.println("Bu sayı bir Amrstrong sayı değildir...");
        }
        
        
        
        
        
        
        
    }
}
