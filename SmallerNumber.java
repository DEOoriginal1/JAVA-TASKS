import java.util.Scanner;
public class LargerOfTwoNumbers{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int numberOne = input.nextInt();
  System.out.print("Enter a number: ");
  int numberTwo = input.nextInt();
  System.out.println(smaller(numberOne, numberTwo));
  
  }
    
    
    
 public static int smaller(int numberOne, int numberTwo){
  if(numberOne < numberTwo) return numberOne;
  else return numberTwo;
    
 }

  }
