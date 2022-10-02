
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System .in);
        
        System.out.print("Birinci kenarı giriniz: ");
        int kenar1 = input.nextInt();
         System.out.print("İkinci kenarı giriniz: ");
        int kenar2 = input.nextInt();
        
        double h = Math.sqrt(kenar2*kenar2 + kenar1*kenar1);
        System.out.println("hipotenüs: " + h);
        
        
    }
    
}
