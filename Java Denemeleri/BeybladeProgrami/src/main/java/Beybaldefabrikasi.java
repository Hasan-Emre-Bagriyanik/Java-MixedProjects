
public class Beybaldefabrikasi {
    
    public Beyblade beybladeuret(String beybalde_turu){
       
        
        if (beybalde_turu.equals("Dragon")){
            return new Dragon("Mavi Ejderha", "Kutsal canavarla konuşma", " Takao",800 , 400);
            
        }
        else if(beybalde_turu.equals("Drayga")){
            return new Drayga("Beyaz Kaplan ", "Rei", 500, 800);
        }
        else if(beybalde_turu.equals("Dranza")){
            return new Dranza("Kara Kaplumbağa", 400, 1000, "Max");
        }
        else if(beybalde_turu.equals("Draciel")){
            return new Draciel("Kırmızı Anka Kuşu", "Kai",250, 700);
        }
        else{
            return null;
        }
        
    }

   
    
    
}
