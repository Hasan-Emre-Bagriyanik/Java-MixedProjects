
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main extends InheritanceClass{
      
    //Burada kullanacagi seyler tanimlandi.
    public static ArrayList<Integer> dizidekiSayilar = new ArrayList<Integer>();
    public static Scanner klavye = new Scanner(System.in);
    public static main maxFarkHesaplama = new main();
    public static boolean tamamMi = true;


    public static void main(String[] args)throws InterruptedException  {
   
   
        while(tamamMi)
        {
            //Kullanicidan dizinin boyutunu aliniyor.
            System.out.print("Hesaplamak istediginiz dizinin boyutunu giriniz: ");
            int boyut = klavye.nextInt();
            
            int [] sayilar = new int[boyut];
            
            //Kullanıcıdan aldigimiz boyut kadar tekrar kullanicidan deger aliyoruz.
            for(int i=0;i<boyut;i++)
            {
                System.out.print("Dizinin " + (i+1) + ". Elemanini Giriniz: ");
                sayilar[i] = klavye.nextInt();
            }
            
            
            //Kullanicinin giridigi diziyi yazdiriyoruz.
            System.out.println("\nOlusan Dizi...");
            for(int i=0;i<boyut;i++)
            {
                System.out.print(sayilar[i] + " ");
            }
            System.out.println("");
            
            //Girilen diziyi dizidekiSayilar dizimize aktariyoruz.
            for(int i=0;i<boyut;i++)
            {
                dizidekiSayilar.add(sayilar[i]);
            }
            
            //Burada dizidekiSayilar dizimiz siralama islemi yapiyor.
            Collections.sort(dizidekiSayilar);
            
            //Siralamis oldugumuz diziyi ekrana yazdiriyoruz.
            System.out.println("\nDizimizin siralanmis hali bu sekilde...");
            for(int i=0;i<dizidekiSayilar.size();i++)
            {
                System.out.print(dizidekiSayilar.get(i) + " ");
            }
            System.out.println("");
            
            //Farklar arasindan farki en buyuk olan sayiyi yazdiriyoruz.
            System.out.println("\nIki ardisik sayinin maximum farki: " + maxFarkHesaplama.maxArdisikFark(dizidekiSayilar));
            
            //Kullanicidan tekrardan islem yapmak istiyor mu istemiyor mu diye soru soruluyor cevaba göre islemler devam edecek 
            System.out.println("");
            System.out.print("\nIslemden Cikmak Istiyor Musunuz?(Islemden Cıkmak Icin 0'a basın): ");
            String secim = klavye.next();
            tamamMi = maxFarkHesaplama.tamamMi(secim);
            
        }
        
        
    }
    
    
     public static boolean tamamMi(String secim)
   {
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










