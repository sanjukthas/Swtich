import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of dates:");
		
	    
		   int days = 0;
	       	days = in.nextInt();        
	        switch (days) {
	            case 28: System.out.println("February");
	                     break;
	            case 29: System.out.println("February(Leap Year)");
	                     break;
	            case 30: System.out.println("April,June,September,November");
	                     break;
	            case 31: System.out.println("January,March.May,July,August,October,December");
	                     break;
	            default: System.out.println("no months have exactly that number of days");
	                     break;
	        }
	      
	}

}
