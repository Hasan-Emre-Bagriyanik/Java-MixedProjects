

public class Kare extends Sekil{//Kare abstract sınıfından extends ettildi...
    
    private int kenar;

    public Kare(int kenar, String isim) {//Constructor...
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesaplama() {//Abstract sınıfından oluşturduğumuz metotun gövdesini burda yazıldı...
        
        double alan = kenar*kenar;
        System.out.println(getIsim()+ "'nin alanı: " + alan);
        
                
        
    }
    
    
}
