import java.util.Scanner;
public class CubingANumber{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int number = input.nextInt();
  System.out.println(cube(number));
  
  }
    
    
    
 public static int cube(int number){
    return number * number * number;
 }

  }
