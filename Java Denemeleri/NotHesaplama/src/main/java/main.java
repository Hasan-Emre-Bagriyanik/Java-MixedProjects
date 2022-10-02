
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("*********** HARF NOTU HESAPLAMA ***********\n");
        
        System.out.print("Lütfen vize notunuzu giriniz: ");
        int vize = input.nextInt();
        System.out.print("Lütfen final notunuzu giriniz: ");
        int fınal = input.nextInt();
        
        double ort =(vize*0.4) +(fınal*0.6);
        System.out.println("Ortalama: " + ort);
        
        
        if(ort >= 90)
        {
            System.out.println("Harf notu:AA");
        }
        else if (80 <= ort   &&   ort < 90)
        {
            System.out.println("Harf notu:BA");
        }
        else if (70 <= ort   &&   ort < 80)
        {
            System.out.println("Harf notu:BB");
        }
        else if (60 <= ort   &&   ort < 70)
        {
            System.out.println("Harf notu:CB");
        }
        else if (50 <= ort   &&   ort < 60)
        {
            System.out.println("Harf notu:CC");
        }
        else if (45 <= ort   &&   ort < 50)
        {
            System.out.println("Harf notu:DC");
        }
        else if (40 <= ort   &&   ort < 45)
        {
            System.out.println("Harf notu:DD");
        }
        else 
        {
            System.out.println("Harf notu:FF Kaldınız");
        }
        
                
        
        
    }
}
