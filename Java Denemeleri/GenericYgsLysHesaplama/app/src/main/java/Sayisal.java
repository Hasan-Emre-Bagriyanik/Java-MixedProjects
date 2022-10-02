
public class Sayisal extends Aday {

    public Sayisal(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }

  
    
    
    @Override
    int Puan_Hesaplama() {
        
        return getTurkce()*5 + getMatematik()*5 + getEdebiyat()*1 + getFizik()*4;
    }
    
    
}
