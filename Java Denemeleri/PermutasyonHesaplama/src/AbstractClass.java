
import java.util.ArrayList;


abstract class AbstractClass {
     static void permutasyonHesaplama(ArrayList<Integer> dizidekiSayilar, int Index2)
    {
        for(int Index1 = Index2; Index1 < dizidekiSayilar.size(); Index1++)
        {
            //swap fonksiyonu belirtilen listedeki belirtilen elemanlarin yerini degistirmek icin kullanilir.
            java.util.Collections.swap(dizidekiSayilar, Index1, Index2);
            //Burada index2'yi 1 arttirarak ve fonksiyonu uygulayarak yine degistirme islemi gerceklestirmis oluyoruz.
            permutasyonHesaplama(dizidekiSayilar, Index2+1);
            java.util.Collections.swap(dizidekiSayilar, Index2, Index1);
        }
        if (Index2 == dizidekiSayilar.size() -1)
        {
            //Burada index2 sayi dizimizin son indeksine esit oldugunda dizimizdeki elemanlari yazdiriyor.
            //Buradaki Arrays.toString fonksiyonu diziye ait elemanları toplu bir şekilde string olarak geri döndüren fonksiyondur.
            System.out.println(java.util.Arrays.toString(dizidekiSayilar.toArray()));
        }   
    }
    
    //Sistemin durdurulmasi ya da tekrar baslatilmasi gibi olayi absatract ile tanimlandi.    
    abstract boolean tamamMi(String secim);
}
