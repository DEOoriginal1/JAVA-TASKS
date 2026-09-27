import java.util.Scanner;
public class EqualityCheck{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int numberOne = input.nextInt();
  System.out.print("Enter a number: ");
  int numberTwo = input.nextInt();
  System.out.println(equality(numberOne, numberTwo));
  
  }
    
    
    
 public static boolean equality(int numberOne, int numberTwo){
  if(numberOne == numberTwo) return true;
  else return false;
    
 }

  }
