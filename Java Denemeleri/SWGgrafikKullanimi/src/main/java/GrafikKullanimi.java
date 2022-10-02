
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GrafikKullanimi extends JPanel{

    @Override
    public void paint(Graphics g) {
        
        g.setColor(Color.red);
        
        g.drawRect(600, 300, 50, 60);
        g.fillRect(500, 600, 50, 60);
        
        g.setColor(Color.blue);
        
        g.drawOval(300, 200, 40, 50);


    }

    public GrafikKullanimi() {
        
        setBackground(Color.black);
    }

    
    
    
}
