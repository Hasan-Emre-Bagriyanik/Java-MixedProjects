
public class Yazilimci extends Calisan2 {
    
    private String diller;
    
    public Yazilimci(String ad,String soyad,int id,String diller){
        super(ad, soyad, id);
        this.diller = diller;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("Yazılımcının bildiği diller: " + diller);
    }
    
    
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd() + " " + isletim_sistemi + "yüklüyor...");
    }
    
}
