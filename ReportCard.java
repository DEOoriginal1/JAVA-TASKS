public class ReportCard{
  public static void main(String[] args){
    printHeader();
    System.out.println(name("Ada"));
    System.out.println(average(80.0));
    System.out.println(grade('A'));
    System.out.println(result("Passed"));
    printLines();
  
    printHeader();
    System.out.println(name("Chidi"));
    System.out.println(average(61.0));
    System.out.println(grade('B'));
    System.out.println(result("Passed"));
    printLines();
  
    printHeader();
    System.out.println(name("Tunde"));
    System.out.println(average(45.0));
    System.out.println(grade('F'));
    System.out.println(result("Failed"));
    printLines();
  }
  public static void printHeader() {
	  System.out.println("=====REPORT CARD=====");
	}
	
	public static String name(String word){
	  return ("Name: " + word);
	}
	
	public static String average(double average){
	  return ("Average: " + average);
	}
  
public static String grade(char grade){
	  return ("Grade: " + grade);
	}
	
public static String result(String result){
	  return ("Result: " + result);
	}
	
public static void printLines(){
	  System.out.println("=================");
	}
	
  }
