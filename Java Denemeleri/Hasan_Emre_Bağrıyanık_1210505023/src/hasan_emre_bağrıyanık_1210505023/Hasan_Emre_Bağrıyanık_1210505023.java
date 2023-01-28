package hasan_emre_bağrıyanık_1210505023;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.ir.BreakNode;

public class Hasan_Emre_Bağrıyanık_1210505023 {

    
    
    public static void MatrisToplama() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci matris");
        System.out.print("Matrisin satır sayısını giriniz: ");
        int a = scanner.nextInt();
        System.out.print("Matrisin sütün sayısını giriniz: ");
        int b = scanner.nextInt();

        int birinciMatris[][] = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("Matrisin değeri [%d] [%d]: ",(i+1),(j+1) );
                birinciMatris[i][j] = scanner.nextInt();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }
               

        System.out.println("\n\nBirinci matrisin değeri...\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d ", birinciMatris[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");

        System.out.println("İkinci matris");
        System.out.print("Matrisin satır sayısını giriniz: ");
        int c = scanner.nextInt();
        System.out.print("Matrisin sütün sayısını giriniz: ");
        int d = scanner.nextInt();

        if (a == c && b == d) {

            int ikinciMatris[][] = new int[c][d];

            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.printf("Matrisin değeri [%d] [%d]: ",(i+1),(j+1) );
                    ikinciMatris[i][j] = scanner.nextInt();
                }
            }
            
            try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }
            

            System.out.println("\n\nİkinci matrisin değeri...\n");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.printf("%d ", ikinciMatris[i][j]);
                }
                System.out.println("");
            }
            System.out.println("\n\n");

            int ToplamMatris[][] = new int[a][b];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {

                    ToplamMatris[i][j] = birinciMatris[i][j] + ikinciMatris[i][j];
                }
            }
            
            try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }
            

            System.out.println("İki matrisin toplamları...");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.printf("%d ",ToplamMatris[i][j]);
                }
                System.out.println("");
            }
            System.out.println("\n\n");

        } else {
            System.out.println("\n\nİki matrisin satır ve sütun sayıları eşit olmak zorundadır.\n\n");

        }

    }
    
    
    
    
    
    

    public static void MatrisCıkarma() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci matris");
        System.out.print("Matrisin satır sayısını giriniz: ");
        int a = scanner.nextInt();
        System.out.print("Matrisin sütün sayısını giriniz: ");
        int b = scanner.nextInt();

        int birinciMatris[][] = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("Matrisin değeri [%d] [%d]: ",(i+1),(j+1) );
                birinciMatris[i][j] = scanner.nextInt();
            }
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }
            

        System.out.println("\n\nBirinci matrisin değeri...\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d ", birinciMatris[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");

        System.out.println("İkinci matris");
        System.out.print("Matrisin satır sayısını giriniz: ");
        int c = scanner.nextInt();
        System.out.print("Matrisin sütün sayısını giriniz: ");
        int d = scanner.nextInt();

        if (a == c && b == d) {

            int ikinciMatris[][] = new int[c][d];

            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.printf("Matrisin değeri [%d] [%d]: ",(i+1),(j+1) );
                    ikinciMatris[i][j] = scanner.nextInt();
                }
            }
            
            
            try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }
            

            System.out.println("\n\nİkinci matrisin değeri...\n");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.printf("%d ", ikinciMatris[i][j]);
                }
                System.out.println("");
            }
            System.out.println("\n\n");

            int MatrisFarkı[][] = new int[a][b];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {

                    MatrisFarkı[i][j] = birinciMatris[i][j] - ikinciMatris[i][j];
                }
            }

            try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            System.out.println("İki matrisin toplamları...");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.printf("%d ",MatrisFarkı[i][j]);
                }
                System.out.println("");
            }
            System.out.println("\n\n");

        } else {
            System.out.println("\n\nİki matrisin satır ve sütun sayıları eşit olmak zorundadır.\n\n");

        }

    }
    
    
    
    public static void MatrisCarpimi(){
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Birinci matris");
        System.out.print("Matrisin satır sayısını giriniz: ");
        int a = scanner.nextInt();
        System.out.print("Matrisin sütün sayısını giriniz: ");
        int b = scanner.nextInt();

        int birinciMatris[][] = new int[a][b];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("Matrisin değeri [%d] [%d]: ",(i+1),(j+1) );
                birinciMatris[i][j] = scanner.nextInt();
            }
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }
            

        System.out.println("\n\nBirinci matrisin değeri...\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d ", birinciMatris[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");

        System.out.println("İkinci matris");
        System.out.print("Matrisin satır sayısını giriniz: ");
        int c = scanner.nextInt();
        System.out.print("Matrisin sütün sayısını giriniz: ");
        int d = scanner.nextInt();
        
        
        if(b==c){
            int ikinciMatris[][] = new int[c][d];

            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.printf("Matrisin değeri [%d] [%d]: ",(i+1),(j+1) );
                    ikinciMatris[i][j] = scanner.nextInt();
                }
            }
            
            try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }
            

            System.out.println("\n\nİkinci matrisin değeri...\n");
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < d; j++) {
                    System.out.printf("%d ", ikinciMatris[i][j]);
                }
                System.out.println("");
            }
            System.out.println("\n\n");
            
            
            int matrisCarpimi[][] = new int[a][d];
            int toplam = 0;
            System.out.println("\nİki matrisin Çarpımı...\n");
            for(int i=0; i<a; i++){
                for(int j=0; j<d; j++){
                    for(int k=0; k<b; k++){
                        toplam += birinciMatris[i][k]*ikinciMatris[k][j];
                    }
                    
                    matrisCarpimi[i][j] = toplam;
                    toplam = 0;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    System.out.printf("%d ",matrisCarpimi[i][j]);
                }
                System.out.println("");
            }
            
            System.out.println("\n\n");
            
            
        }
        System.out.println("\n\nBirinci matrisin sutün sayısı ile ikinci matrisin satırı eşit olmak zorundadır...\n");
  
    }
    
    
    
    
    public static void sabitSayiIleMatrisCarpimi(){
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Birinci matris");
        System.out.print("Matrisin satır sayısını giriniz: ");
        int a = scanner.nextInt();
        System.out.print("Matrisin sütün sayısını giriniz: ");
        int b = scanner.nextInt();

        int birinciMatris[][] = new int[a][b];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("Matrisin değeri [%d] [%d]: ",(i+1),(j+1) );
                birinciMatris[i][j] = scanner.nextInt();
            }
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }
            

        System.out.println("\n\nBirinci matrisin değeri...\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d ", birinciMatris[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");

        
        System.out.print("Yazdığınız matrisi çarpmak istediğiniz bir sabit sayı giriniz: ");
        int sabitSayi = scanner.nextInt();
        int sonuc = 0;
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        System.out.println("\nMatrisin sabit sayı ile çarpımı...\n");
         for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sonuc = birinciMatris[i][j]*sabitSayi;
                System.out.printf("%d ",sonuc);
            }
             System.out.println("");
             
        }
         System.out.println("\n\n");
        
  
        
    }
    
    
    public static int MatrisDeterminat(){
        
        
         Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 1;
        
        System.out.println("Birinci matris");
        System.out.print("Matrisin satır sayısını giriniz: ");
        a = scanner.nextInt();
        System.out.print("Matrisin sütün sayısını giriniz: ");
        b = scanner.nextInt();
        
        if(a == b){

            int birinciMatris[][] = new int[a][b];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.printf("Matrisin değeri [%d] [%d]: ",(i+1),(j+1) );
                    birinciMatris[i][j] = scanner.nextInt();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
            }


            System.out.println("\n\nBirinci matrisin değeri...\n");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.printf("%d ", birinciMatris[i][j]);
                }
                System.out.println("");
            }
            System.out.println("\n\n");

          
           
            System.out.println("Verilen matris determinanti: " + determinantMatrisHesapla(birinciMatris));
            

            }
            else{
                System.out.println("\n\nMatrisin satır ve sutünu aynı olmak zorundadır...\n");
            }
        return a;
    }
        
        
        
        
      public static int determinantMatrisHesapla(int[][] detMatris) {

        if (detMatris.length == 1) {
            return detMatris[0][0];
        }

        if (detMatris.length == 2) {
            return detMatris[0][0] * detMatris[1][1] - detMatris[0][1] * detMatris[1][0];
        }

        int det = 0;
        for (int i = 0; i < detMatris[0].length; i++) {
            int temp[][] = new int[detMatris.length - 1][detMatris[0].length - 1];

            for (int j = 1; j < detMatris.length; j++) {
                for (int k = 0; k < detMatris[0].length; k++) {

                    if (k < i) {
                        temp[j - 1][k] = detMatris[j][k];
                    } else if (k > i) {
                        temp[j - 1][k - 1] = detMatris[j][k];
                    } else
                        continue;
                }

            }
            det += detMatris[0][i] * Math.pow(-1, i) * determinantMatrisHesapla(temp);

        }
        return det;
        
      }
    
        
      
      
      
      
      
      public static int matrisinTersi(){
          
          
        Scanner scanner = new Scanner(System.in);
       
        
        System.out.println("Birinci matris");
        System.out.print("Matrisin satır sayısını giriniz: ");
        int a = scanner.nextInt();
        System.out.print("Matrisin sütün sayısını giriniz: ");
        int b = scanner.nextInt();
        
        

        float birinciMatris[][] = new float[a][b];
        float k[][] = new float[a][b];
        float l[][] = new float[a][b];
        
        

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("Matrisin değeri [%d] [%d]: ",(i+1),(j+1) );
                birinciMatris[i][j] = scanner.nextInt();
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }


        System.out.println("\n\nBirinci matrisin değeri...\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%1.2f ", birinciMatris[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");
        
        
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(i==j){
                    k[i][j] = 1;
                }
                else{
                    k[i][j] = 0;
                }
            }
        }
        
        float m,n;
        for(int i=0; i<a; i++){
            m = birinciMatris[i][i];
             for(int j=0; j<b; j++){
                 birinciMatris[i][j] = birinciMatris[i][j]/m;
                 k[i][j] = k[i][j]/m;
                 
             }
             for(int x=0; x<a; x++){
                 if(x!=i){
                     n = birinciMatris[x][i];
                     for(int j=0; j<b; j++){
                         birinciMatris[x][j] = birinciMatris[x][j] - (birinciMatris[i][j]*n);
                         k[x][j] = k[x][j] - (k[i][j]*n);
                     }
                 }
                 
             }
        }
        
          System.out.println("Matrisin tersi...");
          for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.printf(" %1.2f " , k[i][j]);
            }
              System.out.println("");
          }
          
         
 
        return 0;

    } 
      
      
      
      public static void involutifMatris(){
          
          
           Scanner scanner = new Scanner(System.in);
       
        
        System.out.println("Birinci matris");
        System.out.print("Matrisin satır sayısını giriniz: ");
        int a = scanner.nextInt();
        System.out.print("Matrisin sütün sayısını giriniz: ");
        int b = scanner.nextInt();
        
        
        int birinciMatris[][] = new int[a][b];
        int involutifMatris[][] = new int[b][a];
        

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("Matrisin değeri [%d] [%d]: ",(i+1),(j+1) );
                birinciMatris[i][j] = scanner.nextInt();
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
        }


        System.out.println("\n\nBirinci matrisin değeri...\n");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d ", birinciMatris[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n\n");
        
        
          for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                involutifMatris[j][i] = birinciMatris[i][j];
            }
        }
        if (a == b) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    involutifMatris[i][j] = 0;
                }
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    for (int c = 0; c < a; c++) {
                        involutifMatris[i][j] += birinciMatris[i][c] * birinciMatris[c][j];
                    }
                }
            }
        }
        System.out.println("\nMatrisin karesi:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(involutifMatris[i][j] + "\t");
            }
            System.out.println();
        }
        int x=0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                boolean yanlisKosul = (i == j && involutifMatris[i][j] != 1);
                boolean yanlisKosul2 = (i != j && involutifMatris[i][j] != 0);
                if ((yanlisKosul) || (yanlisKosul2)) {
                    x=1;
                    break;
                }
            }
        }
        if(x==1){
            System.out.println("\nİnvolutif matris değildir\n\n");
        }
        else{
            System.out.println("\nİnvolutif matristir\n\n");
        }
        
        
        
        
        
      }
        
    
    

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        String islemler = "1-Matrislerle toplama işlemi\n"
                + "2-Matrislerle çıkarma işlemi\n"
                + "3-Matrislerle çarpma işlemi\n"
                + "4-Matrisin sabit sayı ile çarpımı\n"
                + "5-Matrisin determinatını hesapalama (3x3)\n"
                + "6-Matrisin tersini alma\n"
                + "7-Matrisin involutif matris olup olmadığını belirleme\n"
                + "Çıkış yapmak için 0'a basınız...";

        while (true) {
            System.out.println("Matrisler ile işlemler");
            System.out.println("***************************************");
            System.out.println(islemler);
            System.out.println("***************************************");
            System.out.print("Yapmak istediğiniz bir işlem seçiniz: ");
            String islem = scanner.nextLine();

            switch (islem) {
                case "0":
                    System.out.println("Programdan çıkılıyor...");
                
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Hasan_Emre_Bağrıyanık_1210505023.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    return;
                
                
                
                case "1":
                    MatrisToplama();
                    break;

                case "2":
                    MatrisCıkarma();
                    break;

                case "3":
                    MatrisCarpimi();
                    break;
                    
                case "4":
                    sabitSayiIleMatrisCarpimi();
                    break;
                    
                case "5":
                    MatrisDeterminat();
                    break;
                    
                case "6":
                    matrisinTersi();
                    break;
                    
                case "7":
                    involutifMatris();
                    break;
                    

                default:
                   System.out.println("\nYanlış işlem seçtiniz...\n\n");
            }
        }

    }

}
