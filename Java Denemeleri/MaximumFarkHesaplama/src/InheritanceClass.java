
import java.util.ArrayList;
import java.util.Collections;


public class InheritanceClass {
    //Ardisik Farklari Bir Yerde Tutmak icin Fark Dizisi adinda bir dizi listesi olusturdum.
    public static ArrayList<Integer> diziFarki = new ArrayList<Integer>();

    public static int maxArdisikFark(ArrayList<Integer> SayiDizisi) throws InterruptedException
    {
        //Dizimizin boyutu 2'den kucukse 0 degerini donduruyor.
        if(SayiDizisi.size() < 2)
        {
            return 0;
        }
        else
        {
            for(int i=0;i<SayiDizisi.size();i++)
            {
                //Indexsimiz dizinin son elemanina gelmis ise islem sonlaniyor.
                if(i == SayiDizisi.size() -1)
                {
                    break;
                }
                else
                {
                    //Ardisik iki sayiyinin farkini alip sonucu diziFarkina ekliyor.
                    int ardisikFark = SayiDizisi.get(i+1) - SayiDizisi.get(i);
                    diziFarki.add(ardisikFark);
                }

            }
          
            //Burada hesaplanan diziFark ni yazdiriyoruz.
            System.out.println("Ardisik iki sayinin fark islemi sonucu...");
            for(int i=0;i<diziFarki.size();i++)
            {
                System.out.print(diziFarki.get(i) + " ");
            }
            System.out.println("");
            
            //Burada diziFark dizimizi buyukten kucuge siraliyor.
            Collections.sort(diziFarki,Collections.reverseOrder());
            
            //Siralama sonucunda ilk sayi en buyuk olacagi icin ilk degeri durduruyoruz.
            return diziFarki.get(0);
        }
    }
}
