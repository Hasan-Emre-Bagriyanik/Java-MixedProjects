
public class Dranza extends Beyblade {
    
    private String kutsal_canavar;
    
    public Dranza(String beybaldeci, int donusHizi, int saldiriGuc, String kutsal_canavar) {
        super(beybaldeci, donusHizi, saldiriGuc);
        this.kutsal_canavar = kutsal_canavar;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster();
        System.out.println("Kutsal Canavar: " + kutsal_canavar);
    }

    @Override
    public void KutsalCanavarOrtayacikar() {
        System.out.println(getBeybaldeci() + " " + kutsal_canavar + " 'ı ortaya çıkarıyor...");
        System.out.println(getBeybaldeci() + " 'in saldırısı: Alev Kılıcı");
    }
    

    
    
  
    
}
