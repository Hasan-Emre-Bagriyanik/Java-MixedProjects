
import java.util.Scanner;


public class main {
    
    public static int toplama(int a, int b){
        return (a+b);
    }
    public static int toplama(int a, int b, int c){
        return (a+b+c);
    }
    
    public static int cikarma(int a, int b){
        return (a-b);
    }
    
    
    public static double bolme(int a, int b){
        return ((double) a/b);
    }
     
    public static int carpma(int a, int b){
        return (a*b);
    }
    public static int carpma(int a, int b, int c){
        return (a*b*c);
    }
  
    
    
    public static void main(String[] args) {
        
        System.out.println("*******************************************");
        System.out.println("Gelişmiş hesap makinesine hoş geldiniz...");
        System.out.println("*******************************************\n");
        
        Scanner input = new Scanner(System.in);
        
        String islemler ="1-toplama işlemi\n"
                         +"2-çıkarma işlemi\n"
                         +"3-bölme işlemi\n"
                         +"4-çarpma işlemi\n"
                         +"5-çıkış yapmak için q'a basınız\n";
        
        
        
        while(true){
            
        System.out.println(islemler);
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        String islem = input.nextLine();
        
        
        if(islem.equals("q")){
            System.out.println("İşlemden çıkılıyor...");
            break;     
        }
        
        
        
        else if(islem.equals("1")){
            System.out.print("Kaç sayı toplayacaksınız (2 veya 3): ");
            int kacSayi = input.nextInt();
            
            if(kacSayi == 2){
                System.out.print("a:");
                int a =input.nextInt();
                System.out.print("b:");
                int b =input.nextInt();
                
                System.out.println("Toplama işleminin sonucu: " + toplama(a, b));   
            }
            else if(kacSayi == 3){
                System.out.print("a:");
                int a =input.nextInt();
                System.out.print("b:");
                int b =input.nextInt();
                System.out.print("c:");
                int c =input.nextInt();
              
                System.out.println("Toplama işleminin sonucu: " + toplama(a, b, c)); 
            }
            else{
                System.out.println("Hatalı sayı seçimi...");
            }    
        }
        
        
        
        
        else if(islem.equals("2")){
                                       
                System.out.print("a:");
                int a =input.nextInt();
                System.out.print("b:");
                int b =input.nextInt();
                
                System.out.println("Çıkarma işleminin sonucu: " + cikarma(a, b));   
                                  
        }
        
        
        
        
        else if (islem.equals("3")){
            
             System.out.print("a:");
             int a =input.nextInt();
             System.out.print("b:");
             int b =input.nextInt();
            
             System.out.println("Bölme  işleminin sonucu: " + bolme(a, b)); 
        }
        
        
        
        else if(islem.equals("4")){
             System.out.print("Kaç sayı çarpacaksınız (2 veya 3): ");
            int kacSayi = input.nextInt();
            
            if(kacSayi == 2){
                System.out.print("a:");
                int a =input.nextInt();
                System.out.print("b:");
                int b =input.nextInt();
                
                System.out.println("Çarpma işleminin sonucu: " +carpma(a, b));   
            }
            else if(kacSayi == 3){
                System.out.print("a:");
                int a =input.nextInt();
                System.out.print("b:");
                int b =input.nextInt();
                System.out.print("c:");
                int c =input.nextInt();
              
                System.out.println("Çarpma işleminin sonucu: " + carpma(a, b, c)); 
            }
            else{
                System.out.println("Hatalı sayı seçimi...");
            }    
        }
        
        
        
     else{
         System.out.println("Hatalı işlem yaptınız...");
        }
        
        
        
        
        }
        
        
    }
}
