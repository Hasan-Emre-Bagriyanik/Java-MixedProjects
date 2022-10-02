
public class Daire extends Sekil {
    
    private int yaricap;

    public Daire(int yaricap, String isim) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    public void alanHesaplama() {
        
        double alan = Math.PI* yaricap*yaricap;
        System.out.println(getIsim()+ "'in alanı: " + alan);
                
        
    }

    

    
}
