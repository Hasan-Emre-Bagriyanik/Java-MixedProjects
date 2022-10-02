
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
       
        double boy,bki;
       Scanner input =new Scanner(System.in);
       
        System.out.print("Lutfen kilonuzu giriniz:");
        int kilo=input.nextInt();
        System.out.print("Lutfen boyunuzu giriniz (Ornegin:1,80 gibi) : ");
        boy=input.nextDouble();
        
        bki= kilo / (boy*boy);
        System.out.println("Kilo boy indeksiniz: " +bki);
                
                
        
        
        
    }
}
