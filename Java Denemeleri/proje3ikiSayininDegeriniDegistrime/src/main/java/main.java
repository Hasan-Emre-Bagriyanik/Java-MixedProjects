
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int birinci_sayi;
        int ikinci_sayi;
        
        System.out.println("Birinci sayıyı giriniz: ");
        birinci_sayi =scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        ikinci_sayi=scanner.nextInt();
        
        System.out.println("Değiştirilmeden önceki sayılar...");
        System.out.println("Birinci sayı: "+birinci_sayi+"İkinci sayı: "+ikinci_sayi);
        
        int gecici =birinci_sayi;
        birinci_sayi=ikinci_sayi;
        ikinci_sayi=gecici;
        System.out.println("Birinci sayı: "+birinci_sayi+"İkinci sayı: "+ikinci_sayi);
        
               
                
                
              
              
        
    }
    
}
