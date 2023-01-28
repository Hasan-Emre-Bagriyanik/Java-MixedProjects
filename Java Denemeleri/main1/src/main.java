
import java.util.Scanner;


public class main {
     public static void MatrisToplama(){
        
        Scanner scanner = new Scanner(System.in);
        
       
           
            System.out.println("Birinci matris");
            System.out.print("Matrisin satır sayısını giriniz: ");
            int a = scanner.nextInt();
            System.out.print("Matrisin sütün sayısını giriniz: ");
            int b = scanner.nextInt();

            int birinciMatris[][] = new int[a][b];

            for(int i=0;i<a;i++){
                for(int j=0; j<b; j++){
                    System.out.println("matrisin değeri "+ "["+ (i+1)+"]"+"["+ (j+1)+"]: "  );
                    birinciMatris[i][j] = scanner.nextInt();
                }
            }
            
            System.out.println("Birinci matrisin değeri...");
            for(int i=0;i<a;i++){
                for(int j=0; j<b; j++){
                    System.out.println(birinciMatris[i][j]);
                          
                          
                }
            }


            System.out.println("İkinci matris");
            System.out.print("Matrisin satır sayısını giriniz: ");
            int c = scanner.nextInt();
            System.out.print("Matrisin sütün sayısını giriniz: ");
            int d = scanner.nextInt();

            if(a==c  &&  b==d){

                int ikinciMatris[][] = new int[c][d];

                for(int i=0;i<c;i++){
                for(int j=0; j<d; j++){
                    System.out.println("matrisin değeri "+ "["+ (i+1)+"]"+"["+ (j+1)+"]: "  );
                    ikinciMatris[i][j] = scanner.nextInt();
                    }
                }
                
                
                System.out.println("İkinci matrisin değeri...");
                for(int i=0;i<c;i++){
                    for(int j=0; j<d; j++){
                        System.out.println(ikinciMatris[i][j]);


                    }
                }

                
                

                int ToplamMatris[][] = new int[a][b];

                 for(int i=0;i<a;i++){
                   for(int j=0; j<b; j++){

                       ToplamMatris[a][b] = birinciMatris[a][b] + ikinciMatris[c][d];
                   }
               }
                 
                
                 System.out.println("İki matrisin toplamları...");
                for(int i=0;i<a;i++){
                    for(int j=0; j<b; j++){
                        System.out.println(ToplamMatris[i][j]);


                    }
                }


            }
            else{
                System.out.println("İki matrisin satır ve sütun sayıları eşit olmak zorundadır.");
                
            }
                

         
    }
    
    
    
    
    public static void MatrisCıkarma(){
        
        
        
         Scanner scanner = new Scanner(System.in);
        
       
           
            System.out.println("Birinci matris");
            System.out.print("Matrisin satır sayısını giriniz: ");
            int a = scanner.nextInt();
            System.out.print("Matrisin sütün sayısını giriniz: ");
            int b = scanner.nextInt();

            int birinciMatris[][] = new int[a][b];

            for(int i=0;i<a;i++){
                for(int j=0; j<b; j++){
                    System.out.println("matrisin değeri "+ "["+ (i+1)+"]"+"["+ (j+1)+"]: "  );
                    birinciMatris[i][j] = scanner.nextInt();
                }
            }
            
            System.out.println("Birinci matrisin değeri...");
            for(int i=0;i<a;i++){
                for(int j=0; j<b; j++){
                    System.out.println(birinciMatris[i][j]);
                          
                          
                }
            }


            System.out.println("İkinci matris");
            System.out.print("Matrisin satır sayısını giriniz: ");
            int c = scanner.nextInt();
            System.out.print("Matrisin sütün sayısını giriniz: ");
            int d = scanner.nextInt();

            if(a==c  &&  b==d){

                int ikinciMatris[][] = new int[c][d];

                for(int i=0;i<c;i++){
                for(int j=0; j<d; j++){
                    System.out.println("matrisin değeri "+ "["+ (i+1)+"]"+"["+ (j+1)+"]: "  );
                    ikinciMatris[i][j] = scanner.nextInt();
                    }
                }
                
                
                System.out.println("İkinci matrisin değeri...");
                for(int i=0;i<c;i++){
                    for(int j=0; j<d; j++){
                        System.out.println(ikinciMatris[i][j]);


                    }
                }

                
                

                int matrisCıkarma[][] = new int[a][b];

                 for(int i=0;i<a;i++){
                   for(int j=0; j<b; j++){

                       matrisCıkarma[a][b] = birinciMatris[a][b] - ikinciMatris[c][d];
                   }
               }
                 
                
                 System.out.println("İki matrisin farkları...");
                for(int i=0;i<a;i++){
                    for(int j=0; j<b; j++){
                        System.out.println(matrisCıkarma[i][j]);


                    }
                }


            }
            else{
                System.out.println("İki matrisin satır ve sütun sayıları eşit olmak zorundadır.");
                
            }
        
        
        
        
        
        
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "1-Matrislerle toplama işlemi\n"+
                "2-Matrislerle çıkarma işlemi\n"+
                "3-Matrislerle çarpma işlemi\n"+
                "4-Matrisin sabit sayı ile çarpımı\n"+
                "5-Matrisin determinatını hesapalama\n"+
                "6-Matrisin tersini alma\n"+
                "7-Matrisin involutif matris olup olmadığını belirleme\n";
        
        
        while(true){
            System.out.println("Matrisler ile işlemler");
            System.out.println("***************************************");
            System.out.println(islemler);
            System.out.println("***************************************");
            String islem = scanner.nextLine();


/*
            switch (islem) {
                case "1":
                    //MatrisToplama();
                    break;
                    
                case "2":
                    //MatrisCıkarma();
                    break;
                    
                case "3":
                    
                default:
                    throw new AssertionError();
            }*/
        }
        
        
        
               
        
        
        
        
        
        
        
        
    }
    
}
