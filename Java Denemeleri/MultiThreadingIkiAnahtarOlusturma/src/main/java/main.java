
import javafx.concurrent.Worker;


public class main {
    public static void main(String[] args) {
         
        ListWorker worker = new ListWorker();
        
        /*long baslangic = System.currentTimeMillis();
        
        worker.DegerAta();
        
        long bitis = System.currentTimeMillis();
        
        System.out.println("Geçen zaman: " + (bitis-baslangic));*/
        
        worker.calistir();
    }
}
