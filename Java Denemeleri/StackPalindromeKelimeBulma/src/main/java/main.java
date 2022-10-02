
import java.util.Scanner;
import java.util.Stack;


public class main {
    public static void main(String[] args) {
        
        //Bir kelime baştan ve sondan okunduğu zaman aynı olan kelimelere palindrome kelimeler denir.
        //örnek: kasaylabalyasak
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<kelime.length()/2; i++){
            
            stack.push(kelime.charAt(i));
        }
        
        if(isPalindrome(kelime, stack)){
            System.out.println("Bu bir palindrome kelimedir...");
        }
        else{
            System.out.println("Bu palindrome kelime değildir...");
        }
        
        
        
    }
    
    
    public static boolean isPalindrome(String kelime, Stack<Character> stack){
        
        for(int i=kelime.length()/2 + 1; i<kelime.length(); i++){
            
            if(kelime.charAt(i) != stack.pop()){
                return false;
            }
            
        }
        return true;
    }
}
