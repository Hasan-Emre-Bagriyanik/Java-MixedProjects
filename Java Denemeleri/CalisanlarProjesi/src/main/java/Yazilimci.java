
public class Yazilimci extends Calisan {

    private String diller;
    
    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }

    
    public void format_at(String İsletim_sistemi){
        
        System.out.println(getAd() +" "+ İsletim_sistemi + "'ni yüklüyor." );
    }

    @Override
    public void Bilgileri_göster() {
        super.Bilgileri_göster();
        System.out.println("Yazılımcının bildiği diller: " + diller);
    }
    
    





    
}
