
public class Problemler {
    
    
    public static class Matematik{
        
        public static void Daire_alani (int yaricap){
            
            System.out.println("Dairenin alanı: " + (yaricap* yaricap* Math.PI));
        
    }
        
        
        public static void Ucgenin_cevresi(int kenar1, int kenar2, int kenar3){
            
            System.out.println("Üçgenin çevresi: " + (kenar1 + kenar2 + kenar3));
            
        }
        
        
    }
    
    
    
    
    public static class Fizik{
        
        public static void ic_carpim (Vec vec1 , Vec vec2){
            
            int ic_carpim = vec1.getI()*vec2.getI() + vec1.getJ()* vec2.getJ() + vec1.getK()* vec2.getK();
            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + " iç çsrpım sonucu: " + ic_carpim);
             
            
        }
        
    }
    
}
