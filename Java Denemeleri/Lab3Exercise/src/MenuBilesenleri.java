
public enum MenuBilesenleri {
    
    
    M1("1. Oda oluştur"),
    M2("2. Numarayla oda oluştur"),
    M3("3. Odaları listele"),
    M4("4. Çıkış");
    
    private String menuString;
    
    private MenuBilesenleri(String menuString){
        this.menuString = menuString;
    }

    public String getMenuString() {
        return menuString;
    }

    public static void printMenu(){
        
        for(MenuBilesenleri item: MenuBilesenleri.values()){
            System.out.println(item.getMenuString());
        }
        
    }
        
    
    
    
}
