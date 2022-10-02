
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("Kulanıcı Girişine Hoş Geldiniz...");
        System.out.println("**********************************");
        
        String sis_kulanici_adi ="Hasan Emre";
        String sis_parola ="203941";
        
        int giris_hakki = 3;
        
         while(true){
             
             
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        String kullanici_adi = input.nextLine();
        System.out.print("Parolanızı Giriniz: ");
        String parola = input.nextLine();
               
                        

            if(kullanici_adi.equals(sis_kulanici_adi)  &&   parola.equals(sis_parola)){
                System.out.println("Sisteme hoş geldiniz...");
                break;

            }
            else if (kullanici_adi.equals(sis_kulanici_adi)  &&   !parola.equals(sis_parola)){
                System.out.println("Parolanız yanlış...");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkınız: " + giris_hakki);
                
            }
            else if (!kullanici_adi.equals(sis_kulanici_adi)  &&   parola.equals(sis_parola)){
                System.out.println("Kullanıcı Adınız yanlış...");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkınız: " + giris_hakki);
                
            }
            else {
                System.out.println("Kullanıcı Adınız ve parolanız yanlış...");
                 giris_hakki -= 1;
                 System.out.println("Kalan Giriş Hakkınız: " + giris_hakki);
                   
            }
             
            
        
        }
        if(giris_hakki == 0){
                System.out.println("Giriş Hakkınız Bitmiştir. Tekrar Bekleriz...");
            }
       
        
    }
}
