import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class FarkHesaplama
{
    //Ardisik Farklari Bir Yerde Tutmak icin Fark Dizisi adinda bir dizi listesi olusturdum.
    public static ArrayList<Integer> FarkDizisi = new ArrayList<Integer>();

    public static int ardisikMaksimumFark(ArrayList<Integer> SayiDizisi) throws InterruptedException
    {
        //Eger dizimizin boyutu 2den kucukse direkt 0 degerini donduruyor.
        if(SayiDizisi.size() < 2)
        {
            return 0;
        }
        else
        {
            for(int i=0;i<SayiDizisi.size();i++)
            {
                //Eger i indeksimiz dizinin son indeksine esitlediginde donguyu sonlandiriyor.
                if(i == SayiDizisi.size() -1)
                {
                    break;
                }
                else
                {
                    //Burada ardisik fark islemini yapip cikan sonucu farkdizisi adli arraylistemize aktariyor.
                    int ardisikFark = SayiDizisi.get(i+1) - SayiDizisi.get(i);
                    FarkDizisi.add(ardisikFark);
                }

            }
            System.out.println("Ardisik Farklar Hesaplaniyor...");
            Thread.sleep(1000);
            
            //Burada hesaplanan ardisik fark degerlerini yazdiriyor.
            System.out.println("Ardisik Fark Hesaplamalari :");
            for(int i=0;i<FarkDizisi.size();i++)
            {
                System.out.print(FarkDizisi.get(i) + " ");
            }
            System.out.println("");
            
            //Burada fark listemizi buyukten kucuge siraliyor.
            Collections.sort(FarkDizisi,Collections.reverseOrder());
            
            //Listemizi buyukten kucuge siraladigimiz icin ilk indeks en buyuk indeks oluyor ve onu donduruyoruz.
            return FarkDizisi.get(0);
        }

    }
    
   public static boolean devamMı(String secim)
   {
       //Kullanicidan alinan cevaba gore sistemin kapatilip yada tekrardan baslamasini saglayan fonksiyon.
        
        if(secim.equals("q"))
        {
            System.out.println("Programdan Cikis Yapiliyor...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
        else
        {
            System.out.println("Sistem Tekrardan Baslatiliyor...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
   }
}


public class main extends FarkHesaplama {

    //Burada assagida kullanacagim ozelliklerimi belirttim.
    public static ArrayList<Integer> SayiDizisi = new ArrayList<Integer>();
    public static Scanner scanner = new Scanner(System.in);
    public static FarkHesaplama farkHesaplama = new FarkHesaplama();
    public static boolean devamMı = true;

    
    public static void main(String[] args) throws InterruptedException {
        
        while(devamMı)
        {
            //Kullanicidan dizinin boyutunu aliyoruz.
            System.out.print("Dizinin Boyutunu Giriniz= ");
            int boyut = scanner.nextInt();
            
            int [] sayilar = new int[boyut];
            
            //Dizinin degerlerini kullanicidan aliyoruz.
            for(int i=0;i<boyut;i++)
            {
                System.out.print("Dizinin " + (i+1) + " Elemanini Giriniz= ");
                sayilar[i] = scanner.nextInt();
            }
            
            
            //Kullanicinin girdigi diziyi yazdirma islemi.
            System.out.println("Girilen Dizi :");
            for(int i=0;i<boyut;i++)
            {
                System.out.print(sayilar[i] + " ");
            }
            System.out.println("");
            
            //Girilen diziyi SayiDizisi adli arraylistemize aktariyoruz.
            for(int i=0;i<boyut;i++)
            {
                SayiDizisi.add(sayilar[i]);
            }
            
            //Burada SayiDizisi adli listemizi siralama islemi yapiyoruz.
            Collections.sort(SayiDizisi);
            
            //Siralanmis listemizi yazdirma islemi.
            System.out.println("Sayi Dizinizin Siralanmis Hali :");
            for(int i=0;i<SayiDizisi.size();i++)
            {
                System.out.print(SayiDizisi.get(i) + " ");
            }
            System.out.println("");
            
            //En yuksek farkı yazdirma islemi.
            System.out.println("En Yuksek Ardisik Fark= " + farkHesaplama.ardisikMaksimumFark(SayiDizisi));
            
            //Kullanicidan tekrardan islem yapmak istiyor mu diye soruyorum q ya basarsa programi kapatiyorum.
            System.out.print("Isleme Devam Etmek Istiyor Musunuz?(q-Cikis)= ");
            String secim = scanner.next();

            devamMı = farkHesaplama.devamMı(secim);
            
        }
        
        
    }
    
}