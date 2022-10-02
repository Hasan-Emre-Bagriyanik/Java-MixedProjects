
import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        
        System.out.println("Beyblade programına hoş geldiniz...");
        System.out.println("Çıkış için q'a basınız");
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Bir Beyblade seçiniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkııyor...");
                break;
            }
            else{
                Beybaldefabrikasi fabrika = new Beybaldefabrikasi();
                Beyblade beyblade = fabrika.beybladeuret(islem);
                
                if(beyblade == null){
                    System.out.println("Lütfen geçerli bir beyblade giriniz...");
                }
                else{
                    beyblade.BilgileriGoster();
                    beyblade.saldir();
                    beyblade.KutsalCanavarOrtayacikar();
                    
                }
                
                
            }
              
            
        }
        
        
        
        
        
    }
}
