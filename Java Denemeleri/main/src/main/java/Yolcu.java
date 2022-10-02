
import java.util.Scanner;


public class Yolcu  implements YurtDisiKurallari {

    
    private int YurtDisiHarci;
    private boolean SiyasiYasak;
    private boolean VizeDurumu;
    
    Scanner scanner = new Scanner(System.in);
    
    public Yolcu(){
        
        
        System.out.print("Yurtdışı harc bedelini giriniz: ");
        this.YurtDisiHarci= scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Herhangi bir siyasi yasağınız var mı? (evet ya da hayır): ");
        String cevap = scanner.nextLine();
        
        if(cevap.equals("evet")){
            this.SiyasiYasak = true;
        }
        else{
            this.SiyasiYasak = false;
        }
        
        
        System.out.print("Yurtdışına gitmek için vizeniz var mı? (evet ya da hayır):");
        String cevap2 = scanner.nextLine();
        
        if(cevap2.equals("evet")){
            this.VizeDurumu = true;
        }
        else{
            this.VizeDurumu = false;
        }
        
    }
    
    
    
    
    @Override
    public boolean YurtDisiHarciKontrolu() {
        if(YurtDisiHarci < 50){
            System.out.println("Yurtdışı harcınızı tam yatırınız... ");
            return false;
        }
        else{
            System.out.println("Yurtdışı harcınız tam olarak yatırılmıştır...");
            return true;
        }
    }

    @Override
    public boolean SiyasiYasakKontrolu() {
        if(this.SiyasiYasak == true){
            System.out.println("Siyasi yasak durumunuz bulunmaktadır...");
            return true;
        }
        else{
            System.out.println("Siyasi yasak durumunuz bulunmamaktadır...");
            return false;
        }
    }

    @Override
    public boolean VizeDurumuKontrolu() {
        
        if(this.VizeDurumu == true){
            System.out.println("Vizeniz bulunmaktadır...");
            return true;
        }
        else{
            System.out.println("Vizeniz bulunmamaktadır...");
            return false;
        }
        
    }
    
    
}
