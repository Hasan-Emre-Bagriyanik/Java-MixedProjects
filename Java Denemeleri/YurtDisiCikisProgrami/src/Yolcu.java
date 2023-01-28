

import java.util.Scanner;


public class Yolcu implements YurtDisiKurallari{//Interface sınıfını implements ediliyor...
    
    
    private int harc;
    private boolean siyasiYasak;//Özellikler belirleniyor...
    private boolean vizeDurumu;
    
    
    public Yolcu() {//Constructor...
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatırdığınız Harç Bedeli : ");
        this.harc = scanner.nextInt();//Harç bedelini kullanıcıdan istenmektedir...
        scanner.nextLine();
        
        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu(evet ya da hayır) ? ");
        
        String cevap = scanner.nextLine();//Siyasi yasağının olup olmadığını kullanıcıdan evet ya da hayır diye isteniliyor...
        
        if (cevap.equals("evet")) {
            
            this.siyasiYasak = true;
        } 
        else {
            this.siyasiYasak = false;
        }
        System.out.print("Vizeniz bulunuyor mu ? (evet ya da hayır)");
        
        String cevap2 = scanner.nextLine();//Vizenin olup olmadığını kullanıcıdaan evet ya da hayır diye istenilmektedir...
        
        if (cevap2.equals("evet") ){
            this.vizeDurumu = true;
            
        }
        else {
            this.vizeDurumu = false;
        }
        
        System.out.println("");
        System.out.println("");
        
        
        
    }

    @Override //Interface sınıfından metotları tek tek override ediyoruz ve gövdelerini yazıyoruz...
    public boolean yurtdisiHarciKontrol() {
        if (this.harc < 15) {
            
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırın...");
            System.out.println("");
            return false;
        }
        else {
            System.out.println("Yurtdışı harcı işlemi tamamdır...");
            System.out.println("");
            return true;
        }
    }

    @Override//Interface sınıfından metotları tek tek override ediyoruz ve gövdelerini yazıyoruz...
    public boolean siyasiYasakKontrol() {
        
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasağınız bulunuyor.Yurtdışına çıkamazsınız...");
            System.out.println("");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor...");
            System.out.println("");
            return true;
        }
    }

    @Override//Interface sınıfından metotları tek tek override ediyoruz ve gövdelerini yazıyoruz...
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            
            System.out.println("Vize işlemleri tamamdır...");
            System.out.println("");
            return true;
        }
        else {
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır...");
            System.out.println("");
            return false;
        }

    }
    
    
}
