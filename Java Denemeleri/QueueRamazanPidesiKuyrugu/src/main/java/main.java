
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class main {
    public static void main(String[] args) throws InterruptedException {
        
        //1 ile 10 arasında pide çıkacak
        //10 kişi olan ekmekleri alarak tek tek çıkacak
        
        Queue<String> pide_kuyrugu =new LinkedList<String>();
        Random random = new Random();
        
        System.out.println("Fırına Hoş Geldiniz...");
        
        pide_kuyrugu.offer("Ayşe");
        pide_kuyrugu.offer("Fatma");
        pide_kuyrugu.offer("Hayri");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Duygu");
        pide_kuyrugu.offer("Emre");
        pide_kuyrugu.offer("İrem");
        pide_kuyrugu.offer("Sametcan");
        pide_kuyrugu.offer("Ersin");
        pide_kuyrugu.offer("Veysel");
        
        
        int pide_sayisi = 1 + random.nextInt(10);
        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan pide sayısı: " + pide_sayisi);
        Thread.sleep(3000);
        
        while(pide_sayisi != 0){
            
            System.out.println(pide_kuyrugu.poll() + " pideyi aldı...");
            pide_sayisi --;
            Thread.sleep(1000);

        }
        System.out.println("Pide kalmadı...");
        
        System.out.println(pide_kuyrugu + " adlı kişiler pide alamadı...");

        
    }
}
