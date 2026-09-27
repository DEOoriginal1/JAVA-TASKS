import java.util.Scanner;
public class AbsoluteValue{
  public static void main(String[] args){
  Scanner input = new Scanner (System.in);
  System.out.print("Enter a number: ");
  int number = input.nextInt();
  System.out.println(absolute(number));
  
  }
    
    
    
 public static int absolute(int number){
    if(number < 0) return -number;
    else return number;
 }

  }
