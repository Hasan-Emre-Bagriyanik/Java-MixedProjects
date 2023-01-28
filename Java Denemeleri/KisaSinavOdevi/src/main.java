
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for(Flowers flower : Flowers.values()){
            System.out.println(flower.getSiparisFlowers() +"-" + flower );
        }
        
        
        Flowers flower = Flowers.GUL;
      
        switch (flower) {
            case GUL:
                System.out.println("Gul cicegini siparis verdiniz.");
                break;
            case ORKİDE:
                System.out.println("Orkide cicegini siparis verdiniz.");
                break;
            case PAPATYA:
                System.out.println("Papatya cicegini siparis verdiniz.");
                break;
            case KAKTUS:
                System.out.println("Kaktüs cicegini siparis verdiniz.");
                break;
            default:
                System.out.println("Siparis vermek icin cicek secimi yapılmadı.");
                break; 
        }
     
    }
}
    
 
  