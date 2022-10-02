
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap){
        
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hoş Geldiniz...");
        System.out.println("******************************");
        System.out.println("Kullanıcı girişi ");
        System.out.println("******************************");
        int giris_hakki = 3;
                
        
        while(true){
            
            if(login.login(hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else{
                System.out.println("Yanlış kullanıcı adı veya parola girdiniz.");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkınız: " + giris_hakki);
            }
            if(giris_hakki == 0){
                System.out.println("Giriş hakkınız bitmiştir.");
                return;
            }           
        }
        
        while(true){
        System.out.println("********************************");
        String islemler = "1- Bakiye öğrenme\n"
                         +"2- Para yatırma\n"
                         +"3- Para çekme\n"
                         +"4- Çıkış için 0'a basınız\n";
        System.out.println(islemler);
        System.out.println("********************************");
        
        System.out.print("Lütfen bir işlem seçiniz: ");
        int islem = scanner.nextInt();
        
      
        switch (islem) {
            case 0:
                System.out.println("Programdan Çıkılyor...");
                return;
                
                
            
            case 1:
                System.out.println("Bakiye: " + hesap.getBakiye());
                break;
                
            case 2:
                System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz:");
                int tutar = scanner.nextInt();
                hesap.paraYatir(tutar);
                break;
                
            case 3:
                System.out.print("Lütfen çekmek istediğiniz miktarı giriniz:");
                int miktar = scanner.nextInt();
                hesap.paraCekme(miktar);
                break;
                
            
            default:
               System.out.println("Yanlış işlem yaptınız...");
               break;
               
        }
             
        }
        
    }
}
