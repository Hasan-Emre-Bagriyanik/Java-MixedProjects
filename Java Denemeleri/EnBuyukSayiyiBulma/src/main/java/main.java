
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print("Birinci sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c = input.nextInt();
        
        int max = -1;
        
        if(a >= b  &&  a >= c)
        {
            max = a;
            
        }
        else if(b >= a  &&  b >= c)
        {
            max = b;
        }  
        else
        {
            max = c;
        }
        System.out.println("maksimum sayı: " + max);
}
}