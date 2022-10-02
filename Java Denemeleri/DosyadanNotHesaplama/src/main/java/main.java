
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {
    
    
    public static String HarfNotuHesaplama (String isim, int vize1, int vize2, int finalnot){
        
        String cikti="";
        
        double toplamNot = (vize1 * 3/10.0 ) + (vize2 *3/10.0) + (finalnot * 4/10.0);
        
        if(toplamNot >= 90){
            cikti = isim + "Bu dersten AA aldı...";
        }
        else if (toplamNot >=80){
            cikti= isim + " Bu dersten BA aldı...";
        }
        else if (toplamNot >=70){
            cikti= isim + " Bu dersten BB aldı...";
        }
        else if (toplamNot >=60){
            cikti= isim + " Bu dersten CB aldı...";
        }
        else if (toplamNot >=55){
            cikti= isim + " Bu dersten CC aldı...";
        }
        else if (toplamNot >=50){
            cikti= isim + " Bu dersten DC aldı...";
        }
        else if (toplamNot >=45){
            cikti= isim + " Bu dersten DD aldı...";
        }
        else if (toplamNot >=40){
            cikti= isim + " Bu dersten FF aldı...";
        }
        return cikti;
        
    }
    public static void main(String[] args) {
        
        
        
        try(Scanner scanner = new Scanner(new FileReader("Not.txt"));
                FileWriter writer = new FileWriter("Notlar3.txt")){
            
            while(scanner.hasNextLine()){
                
                String ogrenciBilgileri = scanner.nextLine();
                
                String[] ogrenciArray = ogrenciBilgileri.split(",");
                
                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalnot = Integer.valueOf(ogrenciArray[3]);
                
               String cikti= HarfNotuHesaplama(ogrenciArray[0], vize1, vize2, finalnot);
               writer.write(cikti + "\n");
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
       
        
    }
}
