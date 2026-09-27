import java.util.Scanner;
public class SubtractionOfTwoNumbers{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int numberOne = input.nextInt();
  System.out.print("Enter a number: ");
  int numberTwo = input.nextInt();
  System.out.println(subtraction(numberOne, numberTwo));
  
  }
    
    
    
 public static int subtraction(int numberOne, int numberTwo){
    return numberOne - numberTwo;
    
 }

  }
