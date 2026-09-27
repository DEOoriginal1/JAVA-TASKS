import java.util.Scanner;
public class Palindrome{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter String: ");
  String word = input.nextLine();
  System.out.println(palindrome(word));
  
  }
    
    
    
 public static boolean palindrome(String word){
     String reverse = "";
        for(int index = word.length() - 1; index >= 0; index--){
            reverse += word.charAt(index);
        }
        return word.equals(reverse);
    
 }
  }
