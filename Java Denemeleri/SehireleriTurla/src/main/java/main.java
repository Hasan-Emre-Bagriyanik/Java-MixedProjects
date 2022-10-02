
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class main {
    
    public static void islemleri_bastir(){
        
        System.out.println("0- İşlemleri görüntüle");
        System.out.println("1- Bir sonraki şehire git");
        System.out.println("2- Bir önceki şehire git");
        System.out.println("3- Uygulamadan çık");
    }
    
    
    public static void sehirleri_turla(LinkedList<String> sehirler){
        
        ListIterator<String> iterator = sehirler.listIterator();
        
        
        
        islemleri_bastir();
        
        Scanner scanner = new Scanner(System.in);
        
        if(!iterator.hasNext()){
            System.out.println("Şehir bulunmamaktadır...");
        }
        
        boolean cıkıs =false;
        boolean ileri =true;
    
        
        while(!cıkıs){
            
            System.out.print("Yapmak istediğiniz bir işlem seçiniz: ");
            int islem = scanner.nextInt();
            
            switch(islem){
                
                case 0:
                    islemleri_bastir();
                    break;
                    
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri=true;
                    }
                    
                    
                    if(iterator.hasNext()){
                        System.out.println("Şehre gidiliyor: " + iterator.next());
                    }
                    else{
                        System.out.println("Gidilecek şehir kalmadı...");
                    }
                    break;
                    
                    
                case 2:
                    
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                       ileri = false;
                    }
                    
                    
                    if(iterator.hasPrevious()){
                       
                        System.out.println("Bir önceki şehire gidiliyor..." + iterator.previous());
                    }
                    else{
                        System.out.println("Şehir turu başlıyor...");
                    }
                    break;
                    
                case 3:
                    cıkıs = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
                         
            }
        
        } 
        
    }
    
    
    public static void main(String[] args) {
        
        LinkedList<String> sehirler = new LinkedList<String>();
        
        sehirler.add("Kırklareli");
        sehirler.add("Hatay");
        sehirler.add("Ankara");
                
        sehirleri_turla(sehirler);
        
    }
    
    
}
