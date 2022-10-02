
public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        
        System.out.println("Hayat hava yollarına hoş geldiniz ");
        
        String sartlar = "Yurtdışına çıkabilme kuralları...\n"
                +"Yurtdışı siyasi yasaklarının olmaması...\n"
                +"50 lira yurtdışı harcının yatırılmış olması...\n"
                +"Yurtdışına çıkabilmek için vizenizin olması";
        
        String message = "Yurtdışına çıkabilmek için bütün şartları uymanız gerekmektedir...";
        
       
        while(true){
            
            System.out.println("************************************************");
            System.out.println(message);
            System.out.println("************************************************");
            System.out.println(sartlar);
            
             Yolcu yolcu = new Yolcu();
        
            System.out.println("Yurtdışı harcınız kontrol ediliyor...");
            Thread.sleep(4000);
             
            if(yolcu.YurtDisiHarciKontrolu() == false){
                System.out.println(message);
                continue;
            }
            
            
            System.out.println("Siyasi yasapınız kontrol ediliyor...");
            Thread.sleep(4000);
            
            if(yolcu.SiyasiYasakKontrolu() == true){
                System.out.println(message);
                continue;
            }
                  
            
            System.out.println("Vize durumunuz kontrol edilyor...");
            Thread.sleep(4000);
            
            if(yolcu.VizeDurumuKontrolu() == false){
                System.out.println(message);
                continue;
            }
        
        
        System.out.println("Bütün işlemleriniz tamam. Artık yurtdışına çıkabilirsiniz...");
        break;
            
    }
        
        
        
        
        
        
        
        
        
    }
}
