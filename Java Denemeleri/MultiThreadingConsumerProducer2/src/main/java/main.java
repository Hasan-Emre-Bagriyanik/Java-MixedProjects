
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.nio.cs.ext.PCK;


public class main {
    public static void main(String[] args) {
         
        
        ProducerConsumer pc = new ProducerConsumer();
        
       Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                
                 pc.produce();

            }
       });
        
       Thread consumer =  new Thread(new Runnable() {
            @Override
            public void run() {
                pc.consume();
                
            }
       });
        
       producer.start();
       consumer.start();
      
       
       
        try {
            producer.join();
            consumer.join();
           
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
