
public class Daire extends Sekil {//Daire abstract sınıfından extends ettildi...
    
    private int yaricap;

    public Daire(int yaricap, String isim) {//Constructor...
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    public void alanHesaplama() {//Abstract sınıfından oluşturduğumuz metotun gövdesini burda yazıldı...
        
        double alan = Math.PI* yaricap*yaricap;
        System.out.println(getIsim()+ "'nin alanı: " + alan);
                
        
    }

    

    
}
