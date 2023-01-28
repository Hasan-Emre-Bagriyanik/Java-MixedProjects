
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;





public class main extends AbstractClass{
    public static ArrayList<Integer> SayiArr = new ArrayList<Integer>();
    public static Scanner klavye = new Scanner(System.in);
    public static boolean tamamMi = true;
    public static main islem = new main();
    
    public static void main(String[] args) throws InterruptedException{
       
        System.out.println("Permutasyon Hesaplamaya Hosgeldiniz...");
        
        while(tamamMi){
            
         
            //Dizinin boyutunu kullanicidan istiyoruz.
            System.out.print("Islem Yapmak Istediginiz Dizinin Boyutunu Giriniz: ");
            int boyut = klavye.nextInt();

            int [] dizidekiSayilar = new int [boyut];
            //Dizinin boyutu 1'den buyuk olmali eger kucuk olursa siralama islemi gerceklesmez
            if(boyut > 1)
            {
                //Kullanicidan aldigimiz dizinin boyutu kadar kullanicidan sayilari aliyoruz
                for(int i=0;i<boyut;i++)
                {
                    System.out.printf("Dizinin "+ (i+1) +". Sayisini Giriniz: " );
                    dizidekiSayilar[i] = klavye.nextInt();
                }
                System.out.println("");

                //Kullanicidan aldigimiz degerleri kullanici gorsun diye yazdiriyoruz
                System.out.println("Girilen Sayilarin Dizisi :");
                for(int i=0;i<boyut;i++)
                {
                    System.out.print(dizidekiSayilar[i] + " ");
                }

                System.out.println("\n\nDizinin Permutasyonlari...");
                
                
                //Dizinin elemanlarini tek tek arrayliste ekliyoruz
                for(int i=0;i<boyut;i++)
                {
                    SayiArr.add(dizidekiSayilar[i]);
                }

                AbstractClass.permutasyonHesaplama(SayiArr, 0);
                System.out.println("");
                //Kullanicidan tekrardan islem yapmak istiyor mu istemiyor mu diye soru soruluyor cevaba göre islemler devam edecek 
                System.out.print("Islemden Cikmak Istiyor Musunuz?(Islemden Cıkmak Icin 0'a basın): ");
                String secim = klavye.next();

                tamamMi = islem.tamamMi(secim);
            }
            else
            {
                System.out.println("Hatali Islem Yaptiniz...");
            }
        }
        
        
    }
    
    
    

    @Override
    boolean tamamMi(String secim) {
        
         //Kullanicinin verdigi cevaba gore islemimizi ya kapatiyoruz ya da devam ettiriyoruz
        
        if(secim.equals("0"))
        {
            System.out.println("Programdan Cikiliyor...");
            return false;
        }
        else
        {
            System.out.println("Program Basa Geri Donuyor...");
            return true;
        }



    }
}
