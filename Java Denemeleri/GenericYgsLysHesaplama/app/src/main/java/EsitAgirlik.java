
public class EsitAgirlik extends Aday {

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik, String isim) {
        super(turkce, matematik, edebiyat, fizik, isim);
    }

    @Override
    int Puan_Hesaplama() {
        
       return getTurkce()*5 + getMatematik()*5 + getEdebiyat()*4 + getFizik()*1;

    }
    
}
