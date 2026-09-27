import java.util.Scanner;
public class Divisibility{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int number = input.nextInt();
  System.out.println(divisible(number));
  
  }
    
    
    
 public static boolean divisible(int number){
    if(number % 3 == 0) return true;
    else return false;
    
 }

  }
