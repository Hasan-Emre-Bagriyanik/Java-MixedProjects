
import java.util.Scanner;


public class Proje2TutarHesaplama {

    public static void main(String[] args) {
    
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Aracınız kilometrede kaç kuruş yakıyor (Örnek:0,33): ");
        double kurus =input.nextDouble();
        System.out.print("Aracınızla kaç kilometre gittiniz: ");
        int km =input.nextInt();
        System.out.println("Aracınızın toplam yaktığı tutar: ");
        double toplam =input.nextDouble();
        
    }
}
