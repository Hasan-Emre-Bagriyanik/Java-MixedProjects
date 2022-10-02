
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen kilonuzu giriniz: ");
        int kilo = input.nextInt();
        System.out.print("Lütfen boyunuzu giriniz: ");
        double boy = input.nextDouble();
        
        double bki = kilo / (boy*boy);
        
        System.out.println("bki: " + bki);
        
        if(18.5 >= bki)
        {
            System.out.println("Zayıf");
        }
        else if (18.5 <= bki  &&  bki < 25)
        {
            System.out.println("Normal");
        }
        else if (25 <= bki   &&  bki < 30)
        {
            System.out.println("Fazla kilolu");
        }
        else
        {
            System.out.println("Obez");
        }
        
        
        
        
    }
}
