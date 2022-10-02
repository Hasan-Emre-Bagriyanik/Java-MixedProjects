
public class Dragon extends Beyblade {
    
    private String kutsal_canavar;
    private String gizli_ozellik;

    public Dragon(String kutsal_canavar, String gizli_ozellik, String beybaldeci, int donusHizi, int saldiriGuc) {
        super(beybaldeci, donusHizi, saldiriGuc);
        this.kutsal_canavar = kutsal_canavar;
        this.gizli_ozellik = gizli_ozellik;
    }

    @Override
    public void BilgileriGoster() {
        super.BilgileriGoster(); 
        System.out.println("Kutsal canavar: " + kutsal_canavar);
        System.out.println("Gizli özellik: " + gizli_ozellik);
    }

    @Override
    public void KutsalCanavarOrtayacikar() {
        System.out.println(getBeybaldeci() + " " + kutsal_canavar + " 'ı ortaya çıkarıyor...");
        System.out.println(getBeybaldeci() + " 'in saldırısı:  Hayalet kasırgası ");
    }
    
    
    
    
}
