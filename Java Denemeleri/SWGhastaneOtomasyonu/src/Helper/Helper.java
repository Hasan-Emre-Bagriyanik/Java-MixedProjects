
 public static void determinant(int a[][],int n) {
    
        int deter=0;
        
        
        for( int p=0;p<3;p++) //Ama 2x2 lik üstü bir matris ise asıl işlemler burada başlıyor.Üstte de yazdığımız gibi 3x3 ve daha üstü matrislerin determinantlarını matrisin majörü ve kofaktörü ile hesaplayacağız.
        {
        int h = 0;
        int k = 0;
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==p){
                    continue; //Devam etme kodumuz.
                    }
                int gecici[][] = new int[h][k]; //Burada matris elemanlarımızı determinant hesaplamak için gecici matrisimizin elemanlarına atıyoruz.
                gecici[h][k] = a[i][j];
                k++;
                if(k==n-1){
                    h++;
                    k = 0;
                }
            }
        }
        
        deter=deter+a[0][p]*Math.pow(-1,p)*determinant(gecici,n-1); //Burada ise asıl determinant hesabı yapılıyor.determinant(gecici,n-1) bu ifadenin anlamı ise n sayısı kodlardaki sütun sayısıdır.İlk başta mesela 3 olarak başladıysa burada -1 yapılıyor ve 2x2 lik matrise düşüyor.Haliyle burada direkt olarak köşegenler çarpılarak determinant hesabı yapılmış olacak.Tabii sonra tüm bu işlemler toplanacak ve asıl determinant değerimiz ortaya çıkmış olacaktır.
        }
         //Fonksiyonu deter olarak dışarı çıkartıyor.Ana fonksiyondan bu fonksyion çağırıldığı zaman deter değeri yani determinant sonucu direkt olarak oraya gitmiş olacak.
        }









package Helper;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Helper {
    
    public static void optionPaneValue (){
        UIManager.put("OptionPane.yesButtonText", "Evet");
        UIManager.put("OptionPane.noButtonText", "Hayır");
    }
    
    public static void showqMsg(String str){
        
        String message;
        optionPaneValue();
        switch (str) {
            case "fill":
                message = "Lütfen tüm alanları doldurunuz";
                break;
               
            case "success":
                message = "İşlem başarılı";
                break;
            default:
                message = str;
                break;
        }
        JOptionPane.showMessageDialog(null, message, "mesaj", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
    public static boolean confirm(String str){
        String msg;
        optionPaneValue();
        switch (str) {
            case "sure":
                msg = "Bu işlemi gerçekleştirmek istiyor musunuz";
                break;
            default:
                msg = str;
                break;
        }
        
        int res = JOptionPane.showConfirmDialog(null, msg,"Dikkat!!!" , JOptionPane.YES_NO_OPTION);
        
        if(res == 0){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    
    
}
