
public class main {
    
    //Başka bir fonksiyondan asal sayı mı değil mi olarak main'in içine alma
    public static boolean asalMi(int sayi) {
        
        for(int i=2; i<sayi; i++){
            
            if(sayi%2 == 0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        //1'den 1000'e kadar olan asal sayılar
        
        for(int i=2; i<1000; i++){
            if(asalMi(i)){
                System.out.println(i);
            }
        }
        
    }
}
