

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "1-Karenin alanı\n"    //İŞlemler tek tek yazıldı...
                +"2-Dairenin alanı\n"
                +"3-Üçgenin alanı\n"
                +"çıkış için 0'a basınız.\n";
        
        while(true){//Döngüye kullanıcı programdan çık diyene kadar dönmesini istedik...
            
            System.out.println(islemler);
            System.out.print("Yapmak istediğiniz bir işlem seçiniz: ");
            String sekil_turu = scanner.nextLine();//Kullanıcıdan işlem seçmesi istenildi...
           
            
            Sekil sekil= null;
            
            if(sekil_turu.equals("0")){
                
                System.out.println("Sistemden çıkılıyor...");
                break;//Break komutu ile döngüye son verildi...
            }
            else if(sekil_turu.equals("1")){
                System.out.print("Karenin kenarını giriniz: ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Kare(kenar, "Kare");//Burada obje oluşturuldu sekili extends eden kare için...
                
                sekil.alanHesaplama();//Override ettiğimiz metotu çağırdık...
                System.out.println("");
                
            }
            else if(sekil_turu.equals("2")){
                System.out.print("Dairenin yarıçapını giriniz: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Daire(yaricap, "Daire");//Burada obje oluşturuldu sekili extends eden daire için...
                
                sekil.alanHesaplama();//Override ettiğimiz metotu çağırdık...
                System.out.println("");
            }
            else if(sekil_turu.equals("3")){
                System.out.print("Üçgenin birinci kenarını giriniz:");
                int a = scanner.nextInt();
                System.out.print("Üçgenin ikinci kenarını giriniz:");
                int b = scanner.nextInt();
                System.out.print("Üçgenin üçüncü kenarını giriniz:");
                int c = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Ucgen(a, b, c, "Üçgen");//Burada obje oluşturuldu sekili extends eden üçgen için...
                
                sekil.alanHesaplama();//Override ettiğimiz metotu çağırdık...
                System.out.println("");


            }
            else {
                System.out.println("Hatalı işlem yaptınız...");
                System.out.println("");
            }
            
            
            
        }
        
        
    }
    
}

