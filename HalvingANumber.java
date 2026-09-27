import java.util.Scanner;
public class HalvingANumber{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int number = input.nextInt();
  System.out.println(half(number));
  
  }
    
    
    
 public static double half(int number){
    return (double) number / 2;
 }

  }
