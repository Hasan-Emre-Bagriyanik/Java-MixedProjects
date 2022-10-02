
import java.util.Scanner;


public class main {
    
    public static int EbobBulma(int sayi1, int sayi2) {
        
        int ebob = 1;
        
        for(int i=1; i<=sayi1  &&  i<=sayi2; i++){
        
            if((sayi1 % i == 0) && (sayi2 % i == 0)){
                ebob = i;
            }
        }
        return ebob;
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı giriniz: ");
        int birinci_sayi = input.nextInt();
        
        System.out.print("İkinci sayıyı giriniz: ");
        int ikinci_sayi = input.nextInt();
        
        System.out.println("Sayının ebobu: " + EbobBulma(birinci_sayi, ikinci_sayi));
    }
}
