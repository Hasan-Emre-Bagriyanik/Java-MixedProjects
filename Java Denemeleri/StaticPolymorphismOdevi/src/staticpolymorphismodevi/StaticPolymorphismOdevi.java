
package staticpolymorphismodevi;


public class StaticPolymorphismOdevi {
    
    
    //Static Polymorphism metot ve operatörlerin aşırı yüklenmesi (overload) olarak belirtilir.
    
    

    public void carpma(int x){//carpma adında bir metot oluşturduk integer şeklinde...
        int sonuc = x*x;//İşlemleri yapıyoruz...
        //Yaptığımız işlemleri println yerine printf şeklinde yazdırıyoruz...
        System.out.printf("Integer çarpma sonucu: %d * %d = %d\n" ,x,x, sonuc);
        
    }
    
    public void carpma(double x){//Yine carpma adında bir metot oluşturduk ama bu sefer integer yerine double kullandık...
        double sonuc = x*x;//İşlemleri yapıyoruz...
        //Yaptığımız işlemleri println yerine printf şeklinde yazdırıyoruz...
        System.out.printf("Double çarpma sonucu: %f * %f = %f\n" ,x,x, sonuc);
        
    }
     
    
    
    
    public void toplama(int a, int b){//toplama adında bir metot oluşturduk integer şeklinde...
        int sonuc = a + b;//İşlemleri yapıyoruz...
        //Yaptığımız işlemleri println yerine printf şeklinde yazdırıyoruz...
        System.out.printf("Integer toplama sonucu: %d + %d  = %d \n", a , b , sonuc);
    }
    
    public void toplama(int a, int b, int c){//toplama adında yine bir metot oluşturduk ama bu sefer fazladan bir parametre ekledik.
        int sonuc = a + b + c;//İşlemleri yapıyoruz...
        //Yaptığımız işlemleri println yerine printf şeklinde yazdırıyoruz...
        System.out.printf("Integer toplama sonucu: %d + %d + %d = %d \n",a , b , c , sonuc);
    }
  
    public void toplama(double a, double b){//Yine toplama adında bir metot oluşturduk ama bu sefer integer yerine double kullandık...
        double sonuc = a + b;//İşlemleri yapıyoruz...
        //Yaptığımız işlemleri println yerine printf şeklinde yazdırıyoruz...
        System.out.printf("Double toplama sonucu: %f + %f = %f \n", a , b  , sonuc);
    }
    
    public void toplama(double a, double b, double c){//toplama adında yine bir metot oluşturduk ama bu sefer fazladan bir parametre ekledik.
        double sonuc = a + b + c;//İşlemleri yapıyoruz...
        //Yaptığımız işlemleri println yerine printf şeklinde yazdırıyoruz...
        System.out.printf("Double toplama sonucu: %f + %f +%f = %f \n" , a ,b ,c ,sonuc);
    }
      
    
  
    
    
     public void cikarma(int a, int b){//cikarma adında bir metot oluşturduk integer şeklinde...
        int sonuc = a - b;//İşlemleri yapıyoruz...
        //Yaptığımız işlemleri println yerine printf şeklinde yazdırıyoruz...
        System.out.printf("Integer çıkarma sonucu: %d - %d  = %d \n", a , b , sonuc);
    }
    
    public void cikarma(double a, double b){//Yine cikarma adında bir metot oluşturduk ama bu sefer integer yerine double kullandık...
        double sonuc = a - b;//İşlemleri yapıyoruz...
        //Yaptığımız işlemleri println yerine printf şeklinde yazdırıyoruz...
        System.out.printf("Double çıkarma sonucu: %f - %f = %f \n", a , b  , sonuc);
    }
    
   
    
     
   
    public static void main(String[] args) {
        //Yukarıdaki sınıfdan bir obje oluşturduk...
        StaticPolymorphismOdevi poly = new StaticPolymorphismOdevi();
        //Oluşturduğumuz objeye atadığımız değer ile işlemlerimizi tek tek buraya çağırıyoruz...
        poly.carpma(8);
        poly.carpma(8.2);
        
        poly.toplama(18, 90);
        poly.toplama(5, 11,15);
        poly.toplama(18.5, 48.7);
        poly.toplama(78.8, 5.50, 147.9);
        
        poly.cikarma(156, 487);
        poly.cikarma(485.8,65.6);
        
        
    }
}
