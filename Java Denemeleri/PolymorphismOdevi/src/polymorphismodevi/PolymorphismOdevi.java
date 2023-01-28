
package polymorphismodevi;


class Hayvan {//Burada hayvan sınıfı oluşturuldu ve içine bazı özellikler girildi
    private String isim, ses, bilgi, bilgiMetni;

    public Hayvan(){//Constructor...
        this("Bulunmuyor", "Bulunmuyor");
    }
    public Hayvan(String isim, String ses) {//Constructor...
        this.isim = isim;
        this.ses = ses;
        
    }
    public Hayvan(String isim, String ses, String bilgi){//Constructor...
        this.isim = isim;
        this.ses = ses;
        this.bilgi = bilgi;
        
    }
    //Getter ve setter kullanıldı...
    public String getIsim() {
        return isim;
    }
    public String getSes() {
        return ses;
    }
    public String getBilgiMetni() {
        return bilgiMetni;
    }
    
    public void setBilgiMetni(String bilgi) {
        this.bilgiMetni = "Benim ismim: " + getIsim() + "\nÇıkardığım ses: " + getSes()+ "\nTürüm: " + bilgi;
        
    }
    //Burada metot oluşturduk ileride miras alacağımız sınıflarda
    //bu metotu override ederek kullanacağız.
    public String hayvanBilgileri() {
        
        return "Hayvan bilgileri \n***********************\n" + getBilgiMetni();
        
    }
}

//Kedi adında bir sınıf oluşturduk ve hayvan sınıfından miras aldık.
class Kedi extends Hayvan {
    public Kedi(String isim) {//Constructor...
        super(isim , "Miyav");
        super.setBilgiMetni("Kedi");
    }
    public Kedi(String isim, String bilgi){//Constructor...
        super(isim, "Miyav", bilgi);
    }
    @Override//Override ile miras aldığımız hayvan sınıfından metotu çağırdık.
    public String hayvanBilgileri() {
        return super.hayvanBilgileri()+ "\n*********************";
        
    }
}


class Kopek extends Hayvan {

    public Kopek(String isim) {//Constructor...
        super(isim, "Hav Hav");
        super.setBilgiMetni("Köpek");
    }
    
    public Kopek(String isim, String bilgi){//Constructor...
        super(isim, "Hav Hav", bilgi);
    }

    @Override//Override ile miras aldığımız hayvan sınıfından metotu çağırdık.
    public String hayvanBilgileri() {
        return super.hayvanBilgileri()+ "\n**********************";
    }

}


class Kus extends Hayvan {

    public Kus(String isim) {//Constructor...
        super(isim, "Cik Cik");
        super.setBilgiMetni("Muhabbet Kuşu");
    }
    public Kus(String isim, String bilgi){//Constructor...
        super(isim, "Cik Cik", bilgi);
    }

    @Override//Override ile miras aldığımız hayvan sınıfından metotu çağırdık.
    public String hayvanBilgileri() {
        return super.hayvanBilgileri()+ "\n**********************";
    }   
}

public class PolymorphismOdevi {

     public static void main(String[] args) {
        //Burada objeler(kopyalar) oluşturuldu.
        Hayvan kedi = new Kedi("Tekir");//Tekir isminde bir kedi üretildi.
        Hayvan kopek = new Kopek("Çakır");//Çakır isminde bir köpek üretildi.
        Hayvan kus  = new Kus("Maviş");//Maviş isminde bir kuş üretildi.
        //Burada hayvanları bilgilerini tek tek yazdırdık 
        System.out.println("********************\n"+kedi.hayvanBilgileri());
        System.out.println("********************\n"+kopek.hayvanBilgileri());
        System.out.println("********************\n"+kus.hayvanBilgileri());
    }
 
    
}
