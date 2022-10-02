
import java.util.PriorityQueue;
import java.util.Queue;


public class main {
    public static void main(String[] args) throws InterruptedException {
        
        
        System.out.println("Acil Servise Hoş Geldiniz...");
        
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        
        acilservis.offer( new Hasta("Murat Bey ","Yanık "));
        acilservis.offer( new Hasta("Emre Bey ","Apandisit "));
        acilservis.offer( new Hasta("Elif Hanım ","Baş Ağrısı "));
        acilservis.offer( new Hasta("Hasan Bey ","Yanık "));
        acilservis.offer( new Hasta("Ayşe Hanım ","Apandisit "));
        acilservis.offer( new Hasta("Mehmet Bey ","Baş Ağrısı "));
        
        int i= 1;
        
        while(acilservis.isEmpty() != true){
            
            System.out.println("*************************************");
            System.out.println(i + ". sırada");
            System.out.println(acilservis.poll());
            System.out.println("*************************************");
            Thread.sleep(1000);
            i++;
            
            
            
        }
        
    }
}
