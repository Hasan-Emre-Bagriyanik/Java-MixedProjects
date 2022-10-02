
public class Yonetici extends Calisan{

        private int sorumlu_kisi_sayisi;

    
    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void Bilgileri_göster() {
        super.Bilgileri_göster(); 
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı: " + sorumlu_kisi_sayisi);
    }
    
    public void zamYap(int zamMiktari){
        
        System.out.println(getAd() + "adlı yönetici çalışanlara " + zamMiktari + " TL zam yaptı...");
        
    }
    
    
    
    
    
    
}
