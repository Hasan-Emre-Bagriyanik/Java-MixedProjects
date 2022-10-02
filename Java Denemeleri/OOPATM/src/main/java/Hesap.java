
public class Hesap {
    
    private String kullanci_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanci_adi, String parola, int bakiye) {
        this.kullanci_adi = kullanci_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanci_adi() {
        return kullanci_adi;
    }

    public void setKullanci_adi(String kullanci_adi) {
        this.kullanci_adi = kullanci_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
       
    
    public void paraYatir(int tutar){
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }
    
    public void paraCekme(int tutar) {
        if(bakiye-tutar < 0){
            System.out.println("Yeterli bakiyeniz yoktur...");
            
           
            
        }
        else{
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
            
        }
        
    }
    
}
