
import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        
        System.out.println("YGS LYS Birincisi Belirleme Program�na Ho� Geldiniz...");
        
        String islemler = "1-E�it a��rl�k puan� hesaplama\n"
                +"2-Say�sal puan� hesaplama\n"
                +"��k�� i�in q'a bas�n�z\n";
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            System.out.println("***************************************");
            System.out.println(islemler);
            System.out.println("***************************************");
            
            System.out.print("L�tfen bir i�lem se�iniz: ");
            String islem = scanner.nextLine();
            
            //Birinci ��renci i�in
            System.out.print("Birinci ��rencinin ismi: ");
            String isim1 = scanner.nextLine();
            System.out.print("Netler (T�rk�e Matemetik Edebiyat Fizik) �eklinde netleri birer bo�luk ile giriniz: ");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();
            
            //ikinci ��renci i�in
            System.out.print("�kinci ��rencinin ismi: ");
            String isim2 = scanner.nextLine();
            System.out.print("Netler (T�rk�e Matemetik Edebiyat Fizik) �eklinde netleri birer bo�luk ile giriniz: ");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            scanner.nextLine();
            
            //���nc� ��renci i�in
                        
            System.out.print("���nc� ��rencinin ismi: ");
            String isim3 = scanner.nextLine();
            System.out.print("Netler (T�rk�e Matemetik Edebiyat Fizik) �eklinde netleri birer bo�luk ile giriniz: ");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();
            
            
            if(islem.equals("q")){
                System.out.println("Programdan ��k�l�yor...");
                break;
                
            }
            else if(islem.equals("1")){
                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, matematik1, edebiyat1, fizik1, isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, matematik2, edebiyat2, fizik2, isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                EsitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                
                System.out.println("B�rinci e�it a��rl�k ��rencisi: " + birinci.getIsim());
            }
            else if(islem.equals("2")){
                Sayisal ogrenci1 = new Sayisal(turkce1, matematik1, edebiyat1, fizik1, isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2, matematik2, edebiyat2, fizik2, isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3, matematik3, edebiyat3, fizik3, isim3);
                
                Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                
                System.out.println("B�rinci say�sal ��rencisi: " + birinci.getIsim());   
                
            }
            else{
                System.out.println("Ge�ersiz i�lem yapt�n�z...");
            }
            
            
        }
        
        
        
    }
    
    public static <E extends Aday> E birinci (E e1, E e2, E e3){
        
        if(e1.Puan_Hesaplama()>e2.Puan_Hesaplama()  &&  e1.Puan_Hesaplama()>e3.Puan_Hesaplama()){
            return e1;
        }
        else if(e2.Puan_Hesaplama()>e1.Puan_Hesaplama()  &&  e2.Puan_Hesaplama()>e3.Puan_Hesaplama()){
            return e2;
        }
        else if(e3.Puan_Hesaplama()>e1.Puan_Hesaplama()  &&  e3.Puan_Hesaplama()>e2.Puan_Hesaplama()){
            return e3;
        }
        else{
            return e1;
        }
        
        
    }
    
    
}
