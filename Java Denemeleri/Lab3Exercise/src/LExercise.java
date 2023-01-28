
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;


public class LExercise {
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        Oda[] odalar = new Oda[10];
        String secim = null;
        int sayac =0;
        
        while(true){
            
            MenuBilesenleri.printMenu();
            System.out.print("Lütfen bir işlem seçiniz: ");
            secim = klavye.nextLine();
            
            
            if(secim.equals("1")){
                Oda myoda = Oda.odaOlustur();
                
                System.out.print("Lütfen oda no giriniz: ");
                myoda.setOdaNo(klavye.nextInt());
                System.out.print("Lütfen fiyat giriniz: ");
                myoda.setFiyat(klavye.nextDouble());
                System.out.print("Lütfen Kişi sayısını giriniz: ");
                myoda.setKisiSayisi(klavye.nextInt());
                odalar[sayac++] = myoda;
                
            }
            else if(secim.equals("2")){
                
                
            }
            else if(secim.equals("3")){
                
                System.out.println("Kayıtlı odalar");
                
                for(Oda odaitem: odalar ){
                    if(odaitem != null){
                        System.out.println();
                        System.out.println("Oda No : " + odaitem.getOdaNo() +  "Fiyat: " + odaitem.getFiyat() + "Kişi Sayısı: " + odaitem.getKisiSayisi());
                        
                    }
                }
                
            }
            else if(secim.equals("4")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else{
                System.out.println("Hatalı işlem yaptınız...");
            }
        }
    }
}
