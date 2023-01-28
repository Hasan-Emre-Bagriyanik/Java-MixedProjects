
public class AnaSayfa {
    
    private int odaNo;
    private double fiyat;
    private int KisiSayisi;

    public int getOdaNo() {
        return odaNo;
    }

    public void setOdaNo(int odaNo) {
        this.odaNo = odaNo;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getKisiSayisi() {
        return KisiSayisi;
    }

    public void setKisiSayisi(int KisiSayisi) {
        this.KisiSayisi = KisiSayisi;
    }
        
    
    public AnaSayfa(){
        
    
    }
    
    public AnaSayfa(int odaNo){
        this.odaNo = odaNo;
        
    }
    
    public AnaSayfa(String odaNo){
        this.odaNo = Integer.parseInt(odaNo);
    }
    
    
}
