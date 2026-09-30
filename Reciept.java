public class Receipt{
	public static void main(String[] args) {
	  printHeader();
	  printItem("Bread", 1500);
	  System.out.println("Total: " + calculateTotal(1500, 2));
	  printVat(225.0);
    System.out.println("Grand Total: " + calculateGrandTotal(1500, 2, 225.0));
    printLines();

	  printHeader();
	  printItem("Milk", 2500);
	  System.out.println("Total: " + calculateTotal(2500, 3));
	  printVat(562.5);
    System.out.println("Grand Total: " + calculateGrandTotal(2500, 3, 562.5));
    printLines();
	}
	
	
	
	
	
	public static void printHeader() {
	  System.out.println("=====DAVID AND SONS=====");
	}
	
	public static void printItem(String name, int price) {
	  System.out.println("Item: " + name);
	  	System.out.println("Price: " + price);
	}
	
	public static void printVat(double tax){
	    System.out.println("VAT: " + tax);
	    }
	
	public static int calculateTotal(int price, int quantity) {
	  return price * quantity;
	}
	
	public static double calculateGrandTotal(int price, int quantity, double tax) {
	  double total = calculateTotal(price , quantity);
	   return total + tax;
	}
	
	public static void printLines(){
	System.out.println("=====================");
	
}
  
  
  
  }
  
