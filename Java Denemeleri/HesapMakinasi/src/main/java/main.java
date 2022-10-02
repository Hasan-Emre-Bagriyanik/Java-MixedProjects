
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("*********** HESAP MAKİNASI ***********\n\n");
        
        System.out.println("1-Toplama\n" + "2-Cikarma\n" + "3-Bolme\n" + "4-Carpma");
        System.out.print("İşlemlerden bir tanesini seçiniz: ");
        int secim = input.nextInt();
        int a,b;
        
        switch(secim){
            case 1 : 
                System.out.print("Birinci sayıyı giriniz: ");
                a = input.nextInt();
                System.out.print("İkinci sayıyı giriniz ");
                b = input.nextInt();
                System.out.println("Toplam: " + (a+b));
                break;
                
            case 2 : 
                System.out.print("Birinci sayıyı giriniz: ");
                a = input.nextInt();
                System.out.print("İkinci sayıyı giriniz ");
                b = input.nextInt();
                System.out.println("Fark: " + (a-b));
                break;
                
            case 3 : 
                System.out.print("Birinci sayıyı giriniz: ");
                a = input.nextInt();
                System.out.print("İkinci sayıyı giriniz ");
                b = input.nextInt();
                System.out.println("Bölüm: " + (a/b));
                break;
                
            case 4 : 
                System.out.print("Birinci sayıyı giriniz: ");
                a = input.nextInt();
                System.out.print("İkinci sayıyı giriniz ");
                b = input.nextInt();
                System.out.println("Çarpım: " + (a*b));
                break;
                
            default: 
                System.out.println("Yanlış seçim tekrar deneyiniz...");
                break;
        }
            
        
        
    }
}
