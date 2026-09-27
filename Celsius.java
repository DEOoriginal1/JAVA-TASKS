import java.util.Scanner;
public class Celsius{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter celsius: ");
  int number = input.nextInt();
  System.out.println(converted(number));
  
  }
    
    
    
 public static double converted(double number){
    return number * (9/5) + 32;
 }

  }
