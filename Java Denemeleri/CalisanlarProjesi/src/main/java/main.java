
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        
        //Çalışanlar programı
        //çalışan sınıfı olarak bir üst sınıf oluşturduk
        //Yazılımcı ve  Yönetici olarak birer alt sınıf oluşturduk
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Çalışanlar programına Hoşgeldiniz...");
        
        String islemler = "1- Yazılımcı işlemleri\n"
                        +"2-Yönetici işlemleri\n"
                        +"3-çıkış yapmak için 0'a basınız\n";
        while(true){
            
            System.out.println("******************************");
            System.out.println(islemler);
            System.out.println("******************************");
            
            System.out.print("Yapmak istediğiniz bir işlem seçiniz: ");
            String islem =input.nextLine();
            switch(islem){
                
                case "0":
                    System.out.println("Programdan çıkılıyor... Yine bekleriz...");
                    return;
                    
                case "1":
                    Yazilimci yazilimci =new Yazilimci("Hasan Emre", "Bağrıyanık", 555, "C,Java,C,C#");
                    
                        String Yazilimci_islemi = "1-Format at\n"
                                                 +"2-Bilgileri göster\n"
                                                 +"3- Çıkış için 0'a basınız\n";
                       
                        System.out.println("***********************************");
                        System.out.println(Yazilimci_islemi);
                        System.out.println("***********************************");
                         while(true){
                        System.out.print("Yapmak istediğiniz bir işlem seçiniz: ");
                        String Yazilimci_islem = input.nextLine();
                        
                        switch(Yazilimci_islem){
                            
                            case "0" :
                                System.out.println("Yazılım programından çıkılıyor...");
                                return;
                                
                                
                            case "1":
                                System.out.print("Format atmak istediğiniz bir işletim sistemi giriniz:");
                                String isletim_sistemi = input.nextLine();
                                yazilimci.format_at(isletim_sistemi);
                                
                                break;
                                
                            case"2":
                                yazilimci.Bilgileri_göster();
                                break;
                                
                            default:
                                System.out.println("Yanlış seçim yaptınız...");     
                                break;
                        }    
                    }
                
                    
                    
                case "2": 
                    Yonetici yonetici = new Yonetici("Hasan Emre", "Bağrıyanık",568,250);
                    
                    String Yonetici_islemi = "1-Bilgileri göstermek\n"
                                            +"2-Zam yapmak\n"
                                            +"3-Çıkış için 0'a basınız\n";
                    
                    
                    while(true){
                    
                    System.out.println("**************************************");
                    System.out.println(Yonetici_islemi);
                    System.out.println("**************************************");
                    
                    System.out.print("Yapmak istediğiniz bir işlem seçiniz: ");
                    String Yonetici_islem = input.nextLine();
                    
                    switch(Yonetici_islem){
                        
                        case "0":
                            System.out.println("Yönetici programından çıkılıyor...");
                            return;
                        
                            
                        case "1":
                            yonetici.Bilgileri_göster();
                            break;
                            
                        case "2":
                            System.out.print("Zam miktarını giriniz: ");
                            int zam = input.nextInt();
                            yonetici.zamYap(zam);
                            input.nextLine();
                            break;
                         
                        default:
                            System.out.println("Yanlış işlem seçtiniz...");
                            break;
                        
                        }
                    }
                    
                    default:
                        System.out.println("Yanlış işlem seçtiniz...");
                        break;
                    
                    
            }
        }
        
        
        
    }
}
