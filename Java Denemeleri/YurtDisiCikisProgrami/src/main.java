
public class main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz....");
        
        //Şartları kullanıcıya maddeler halinde iletiliyor...
        String sartlar = "Yurtdışı Çıkış Kuralları...\n"
                         +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"
                         +"15 Tl harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                         +"Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor";
        
        
        while(true) {
            System.out.println("*******************************************");
            System.out.println(sartlar);//Şartlar ekrana yazdırılıyor...
            System.out.println("*******************************************");
            
            
            Yolcu yolcu = new Yolcu();//Yolcu sınıfından obje (kopya) oluşturduldu...
            //Dikkat Interface sınıfından obje(kopya) oluşturulamaz...
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");//Tek tek işlemler gerçekleşiyor...
            
            Thread.sleep(3000);//Sistem gerçekçi olsun diye 3 saniye bekleme verildi...
            if (yolcu.yurtdisiHarciKontrol() == false) {
                
                System.out.println(message);
                System.out.println("");
                System.out.println("");
                continue;
                
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");//Tek tek işlemler gerçekleşiyor...
            Thread.sleep(3000);
            
            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                System.out.println("");
                System.out.println("");
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");//Tek tek işlemler gerçekleşiyor...
            Thread.sleep(3000);
            
            if (yolcu.vizeDurumuKontrol() == false){
                System.out.println(message);
                System.out.println("");
                System.out.println("");
                continue;
            }
            System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz...");//İşlem tamamlandı diye ekrana yazdırılıyor...
            break;
            
            
        }
        
        
    }
}

