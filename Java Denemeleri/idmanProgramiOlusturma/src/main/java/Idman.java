
public class Idman {
    private int purbee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int purbee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.purbee_sayisi = purbee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getPurbee_sayisi() {
        return purbee_sayisi;
    }

    public void setPurbee_sayisi(int purbee_sayisi) {
        this.purbee_sayisi = purbee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    
    public void hararetYapti(String hararet_sebebi, int sayi){
        
        switch (hararet_sebebi) {
            case "purbee":
                purbeeYapti(sayi);
                break;
            case "pushup":
                pushupYapti(sayi);
                break;
            case "situp":
                situpYapti(sayi);
                break;
            case "squat":
                squatYapti(sayi);
                break;
            default:
                break;
        }
    }
    
    
    public void purbeeYapti(int sayi){
        
        if(purbee_sayisi == 0){
            System.out.println("Yapacak purbee kalmadı.");
        }
        else if(purbee_sayisi - sayi < 0){
            System.out.println("Yapılacak purbee sayısından daha fazla yaptınız. Tebrikler...");
            purbee_sayisi = 0;
            System.out.println("Kalan purbee sayısı: " + purbee_sayisi);
        }
        else{
            purbee_sayisi -= sayi;
            System.out.println("Kalan purbee sayısı: " + purbee_sayisi);
        }
        
    }
    
    
    
     public void pushupYapti(int sayi){
        
        if(pushup_sayisi == 0){
            System.out.println("Yapacak purbee kalmadı.");
        }
        else if(pushup_sayisi - sayi < 0){
            System.out.println("Yapılacak purbee sayısından daha fazla yaptınız. Tebrikler...");
            pushup_sayisi = 0;
            System.out.println("Kalan purbee sayısı: " + pushup_sayisi);
        }
        else{
            pushup_sayisi -= sayi;
            System.out.println("Kalan purbee sayısı: " + pushup_sayisi);
        }
        
    }
     
     
     
     
     
     
      public void situpYapti(int sayi){
        
        if(situp_sayisi == 0){
            System.out.println("Yapacak purbee kalmadı.");
        }
        else if(situp_sayisi - sayi < 0){
            System.out.println("Yapılacak purbee sayısından daha fazla yaptınız. Tebrikler...");
            situp_sayisi = 0;
            System.out.println("Kalan purbee sayısı: " + purbee_sayisi);
        }
        else{
            situp_sayisi -= sayi;
            System.out.println("Kalan purbee sayısı: " + situp_sayisi);
        }
        
    }
      
      
      
      
      
       public void squatYapti(int sayi){
        
        if(squat_sayisi == 0){
            System.out.println("Yapacak purbee kalmadı.");
        }
        else if(squat_sayisi - sayi < 0){
            System.out.println("Yapılacak purbee sayısından daha fazla yaptınız. Tebrikler...");
            squat_sayisi = 0;
            System.out.println("Kalan purbee sayısı: " + squat_sayisi);
        }
        else{
            squat_sayisi -= sayi;
            System.out.println("Kalan purbee sayısı: " + squat_sayisi);
        }
        
    }
   
       
       
       
       public boolean IdmanBittiMi(){
           return (purbee_sayisi==0)  &&  (pushup_sayisi==0)  &&   (situp_sayisi==0)  &&  (squat_sayisi==0);
       }
               
}
