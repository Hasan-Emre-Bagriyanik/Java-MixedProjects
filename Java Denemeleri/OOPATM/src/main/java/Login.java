
import java.util.Scanner;


public class Login {
    public boolean login(Hesap hesap){
        
      Scanner scanner = new Scanner(System.in);
      String kullanici_adi;
      String parola;
      
        System.out.print("kullanıcı adı giriniz: ");
        kullanici_adi= scanner.nextLine();
        
        System.out.print("Parolanızı giriniz: ");
        parola = scanner.nextLine();
        
        return hesap.getKullanci_adi().equals(kullanici_adi)  &&   hesap.getParola().equals(parola);
    }

    


   
}
