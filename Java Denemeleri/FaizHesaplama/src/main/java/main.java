
import java.util.Scanner;



//faiz uygulaması yatırılan paranın her sene %18 olacak şekilde hesaplanması

public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoş geldiniz... faiz oranımız %18'dir.");
        
        int anapara,vade;
        
        System.out.print("Bankamıza yatırmak istediğiniz tutarı giriniz: ");
        anapara = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vade ile yatırmak istiyorsunuz: ");
        vade = scanner.nextInt();
        
        double toplampara =anapara;
        double faiz_orani = 0.18;
        
        for (int i=0; i<vade; i++){
            toplampara= (anapara*faiz_orani)+toplampara;
            System.out.println((i+1) + ". yılın parası: "+ toplampara);
            
        }
        
        
    }
}
