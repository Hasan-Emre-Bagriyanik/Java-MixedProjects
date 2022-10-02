
import java.util.Scanner;


public class main {
    
    public static int ebobBulma(int a , int b){
        
        int ebob = 1;
        
        for(int i=1; i<=a  && i<=b; i++){
            
            if((a%i == 0)  && (b%i == 0)){
                ebob=i;
            }
        }
        return ebob;
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci sayı giriniz: ");
        int a = scanner.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        int b = scanner.nextInt();
        
        
        System.out.println("Sayıların ebobu: " + ebobBulma(a, b));
        
    }
}
