
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class main {

    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();
        
        Map<Character,Integer> frekans = new TreeMap<Character,Integer>();
        
        Character c = null;
        for(int i=0; i<cumle.length(); i++){
            c = cumle.charAt(i);
            
        }
        
        
        if (frekans.containsKey(c)){
            frekans.replace((Character) c, frekans.get(c) + 1);
        }
        else {
            frekans.put((Character) c, 1);
            
        }
        
        
        for(Map.Entry<Character,Integer> entry : frekans.entrySet() ){
            System.out.println("Karakter: " + entry.getKey() + " " + entry.getValue() + " kadar geçiyor...");
        }
        
        
        
        
        
    }
}
