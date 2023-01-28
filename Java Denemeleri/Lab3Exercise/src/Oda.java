
import java.util.Scanner;


public class Oda {
    
    private int odaNo;
    private double fiyat;
    private int kisiSayisi;

    //constructer
    public Oda() {
        
    }
    
    public Oda(int odaNo){
        this.odaNo = odaNo;
    }

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
        return kisiSayisi;
    }

    public void setKisiSayisi(int kisiSayisi) {
        this.kisiSayisi = kisiSayisi;
    }
    
    
    
    
    public static Oda odaOlustur(){
        
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Lütfen oda bilgilerinizi giriniz... ");
        return new Oda();
    }
    
    
    public static Oda odaOlusturNo(int odaNo){
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Lütfen oda bilgilerinizi giriniz: ");
        System.out.print("Oda no giriniz: ");
        int No =klavye.nextInt();
        return new Oda(No);
        
    }
    
}
