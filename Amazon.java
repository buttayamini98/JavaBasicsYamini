import java.util.Scanner;

public class Amazon {
	public static void main (String[] args) {
	 //Scanner
	 Scanner sc = new Scanner(System.in);
	 System.out.print (" Enter the Services: ");
	 String Services = sc.nextLine();
	 System.out.println(" Amazon:" + Services) ;
	 System.out.print (" Enter the Properties: ");
	 String Properties = sc.nextLine();
	 System.out.println(" Amazon" + " has " + Properties + "Properties");
	 System.out.print (" Enter the ResourceProperties: ");
	 String ResourceProperties = sc.nextLine() ; 
	 System.out.println(" Amazon" + " ResourceProperties:" + ResourceProperties + "next line \n");
	 int port = sc.nextInt();
	 System.out.println("Assigned port: " + (port+10));
	 
	}
}