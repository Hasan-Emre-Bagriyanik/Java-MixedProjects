
import java.util.Scanner;


public class ATMkodu {

    public static void main(String[] args) {
               
        System.out.println("*********** ATM KODU ************\n");
        Scanner input = new Scanner(System.in);
        int bakiye =1000;
        String islemler = "1.işlem: Bakiye öğrenme\n"
                        +"2.işlem: Para çekme\n"
                        +"3.işlem: Para yatırma\n"
                        +"Çıkış yapmak için q'a basın";
        
        System.out.println(islemler);
        
        System.out.println("************************************");
        
        
        while(true)
        {
            System.out.print("Lütfen bir işlem seçiniz: ");
            String islem = input.nextLine();
            
         if(islem.equals("q")){
             System.out.println("Sistemden çıkılıyor...");
             break;  
         }
         else if (islem.equals("1")) {
             System.out.println("Bakiyeniz: " + bakiye);
             
         }
         else if (islem.equals("2")) {
             
             System.out.print("Çekmek istediğiniz tutarı giriniz: ");
             int tutar = input.nextInt();
             input.nextLine();
             if(bakiye-tutar < 0){
                 System.out.println("Yetersiz bakiye... \n  Bakiyeniz: " + bakiye);
             }
             else{
                 bakiye-=tutar;
                 System.out.println("Yeni bakiyeniz: " + bakiye);             }
                
            }
                
         else if(islem.equals("3")){
             System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
             int tutar = input.nextInt();
             input.nextLine();
             
             bakiye += tutar;
             System.out.println("Yeni bakiyeniz: " + bakiye);
             
         }
         else {
             System.out.println("Yanlış işlem seçtiniz...");
             
                 
         }
                
            
            
            
            
        }
        
        
        
        
        
        
        
            
    }
}

    

