
public class Beyblade {
    
    private String beybaldeci;
    private int donusHizi;
    private int saldiriGuc;

    public Beyblade(String beybaldeci, int donusHizi, int saldiriGuc) {
        this.beybaldeci = beybaldeci;
        this.donusHizi = donusHizi;
        this.saldiriGuc = saldiriGuc;
    }

    public String getBeybaldeci() {
        return beybaldeci;
    }

    public void setBeybaldeci(String beybaldeci) {
        this.beybaldeci = beybaldeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGuc() {
        return saldiriGuc;
    }

    public void setSaldiriGuc(int saldiriGuc) {
        this.saldiriGuc = saldiriGuc;
    }

   
    
    
    public void saldir(){
        System.out.println(beybaldeci +" "+donusHizi + " ve " + saldiriGuc + " ile saldırıyor...");
    }
    
    public void KutsalCanavarOrtayacikar(){
        System.out.println("Bu beybladenin kutsal canavarı bulunmuyor...");
    }
    
    public void BilgileriGoster(){
        System.out.println("Beybladeci ismi: " + beybaldeci);
        System.out.println("Dönüş hızı: " + donusHizi);
        System.out.println("Saldırı gücü: " + saldiriGuc);
            
    }
    
}
