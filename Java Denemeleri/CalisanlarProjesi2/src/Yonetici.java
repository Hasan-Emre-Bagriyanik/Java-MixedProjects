
public class Yonetici extends Calisan2{
    private int sorumlu_kisi_sayisi;
    
    public Yonetici(String ad,String soyad,int sorumlu_kisi_sayisi, int id){
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("Sorumlu kişi sayısı: " + sorumlu_kisi_sayisi);
    }
    
    public void zamYap(int zamMiktari) {
        System.out.println(getAd() + " adlı kişi çalışanlara " + zamMiktari + " TL zam yaptı...");
    }
    
    
    
}
