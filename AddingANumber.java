import java.util.Scanner;
public class AddindANumber{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int number = input.nextInt();
  System.out.println(addition(number));
  
  }
    
    
    
 public static int addition(int number){
    return number + 10;
 }

  }
