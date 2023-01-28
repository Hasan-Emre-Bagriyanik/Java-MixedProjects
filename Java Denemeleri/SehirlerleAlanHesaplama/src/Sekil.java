

public abstract class Sekil {//Abstract sınıfını oluşturduk...
    
    
    private String isim; //Özellik eklendi...

    public Sekil(String isim) {//Constructor oluşturuldu...
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    abstract void alanHesaplama();//Abstract ile gövdesiz bir metot oluştruduk...
    
    
}

