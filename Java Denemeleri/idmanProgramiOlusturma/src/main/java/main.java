
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("İdman programımıza Hoş geldiniz...");
        
        String idmanlar = "Geçerli idmanlar...\n"
                        +"purbee\n"
                        +"pushup\n"
                        +"situp\n"
                        +"squat\n";
        
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturunuz.");
        
        System.out.print("Purbee sayısı: ");
        int purbee = scanner.nextInt();
        System.out.print("Pushup sayısı: ");
        int pushup = scanner.nextInt();
        System.out.print("Situp sayısı: ");
        int situp = scanner.nextInt();
        System.out.print("Squat sayısı: ");
        int squat = scanner.nextInt();
        
        scanner.nextLine();
        
        
        Idman idman = new Idman(purbee, pushup, situp, squat);
        
        System.out.println("İdman başlıyor...");
        
        while(idman.IdmanBittiMi()== false){
            System.out.print("İdman türleri (Purbee,Pushup,Situp,Squat):");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapmak istiyorsunuz:");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            
            idman.hararetYapti(tur, sayi);
            
        }
        
    }
}
