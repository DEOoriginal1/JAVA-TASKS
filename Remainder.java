import java.util.Scanner;
public class Remainder{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int numberOne = input.nextInt();
  System.out.print("Enter a number: ");
  int numberTwo = input.nextInt();
  System.out.println(remainder(numberOne, numberTwo));
  
  }
    
    
    
 public static int remainder(int numberOne, int numberTwo){
    return numberOne % numberTwo;
    
 }

  }
