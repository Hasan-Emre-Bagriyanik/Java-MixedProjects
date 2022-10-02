
public class Kare extends Sekil{
    
    private int kenar;

    public Kare(int kenar, String isim) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesaplama() {
        
        double alan = kenar*kenar;
        System.out.println(getIsim()+ "'in alanı: " + alan);
        
                
        
    }
    
    
}
