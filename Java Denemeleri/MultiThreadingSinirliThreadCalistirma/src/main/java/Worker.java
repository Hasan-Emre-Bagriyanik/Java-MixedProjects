
import java.util.logging.Level;
import java.util.logging.Logger;


public class Worker  implements Runnable{
    
    private String isim;
    private String taskId;

    public Worker(String isim, String taskId) {
        this.isim = isim;
        this.taskId = taskId;
    }

    Worker(String valueOf, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void run() {
        
        
        try {
            System.out.println("Worker " + isim +" " + taskId +".işe başladı...");
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Worker " + isim +" " + taskId +".işe başladı...");




    }
    
    
    
}
