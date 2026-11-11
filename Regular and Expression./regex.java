import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
    
    public class regex {
    
     public static void main(String[] args) {
  
   Scanner sc = new Scanner(System.in);
    String word1;
    String word2;
    String sub;
    
    System.out.print(" Enter the first word: ");
    word1 = sc.nextLine();
    
    System.out.print(" Enter the second word: ");
    word2 = sc.nextLine();
  
    sub = word1.substring(word1.length() - 2);
       
    String regex ="[A-Za-z]{1,2}" + sub;
    
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(word2);
    
    if(matcher.matches()) {
        System.out.println(word2 + " ryhmes with: " + word1);
        
    } else {
        System.out.println(" Perfect Match!! ");
        
        sc.close();
   
    }
    
     }
} 
