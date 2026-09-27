import java.util.Scanner;
public class SumOfTwoNumbers{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int numberOne = input.nextInt();
  System.out.print("Enter a number: ");
  int numberTwo = input.nextInt();
  System.out.println(addition(numberOne, numberTwo));
  
  }
    
    
    
 public static int addition(int numberOne, int numberTwo){
    return numberOne + numberTwo;
    
 }

  }
