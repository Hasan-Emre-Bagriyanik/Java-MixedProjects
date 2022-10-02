
public class Drayga extends Beyblade {
    private String kutsal_canavar;

    public Drayga(String kutsal_canavar, String beybaldeci, int donusHizi, int saldiriGuc) {
        super(beybaldeci, donusHizi, saldiriGuc);
        this.kutsal_canavar = kutsal_canavar;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster(); 
        System.out.println("Kutsal canavar: " + kutsal_canavar);
    }

    @Override
    public void KutsalCanavarOrtayacikar() {
         System.out.println(getBeybaldeci() + " " + kutsal_canavar + " 'ı ortaya çıkarıyor...");
        System.out.println(getBeybaldeci() + " 'in saldırısı: Kaplan Pençesi ");
        
        
    }
    
    
    
    
    
    
}
