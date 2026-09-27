import java.util.Scanner;
public class DecimalDivision{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int numberOne = input.nextInt();
  System.out.print("Enter a number: ");
  int numberTwo = input.nextInt();
  System.out.println(division(numberOne, numberTwo));
  
  }
    
    
    
 public static double division(int numberOne, int numberTwo){
    return (double) numberOne / numberTwo;
    
 }

  }
