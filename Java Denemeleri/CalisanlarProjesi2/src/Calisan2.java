
public class Calisan2 {
    
    private String ad;
    private String soyad;
    private int id;
    
    public Calisan2(String ad,String soyad,int id){
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }  
        
    public void bilgileri_goster(){
        System.out.println("Adı: " + ad);
        System.out.println("Soyadı: " + soyad);
        System.out.println("İd: " + id);
    }
    
    public String getAd(){
        return ad;
    }
    public void setAd(String ad){
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
