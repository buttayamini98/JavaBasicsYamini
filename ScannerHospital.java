import java.util.Scanner;

public class ScannerHospital {
	public static void main(String[] args){
	
	Scanner hospitalDetails = new Scanner(System.in);
	System.out.print ("Name of the Hospital:");
	String name = hospitalDetails.nextLine();
	System.out.println(name + " Hospital " + "\n");
	System.out.print ( "Address: ");
	String address = hospitalDetails.nextLine();
	System.out.println("Address of the Hospital:" + address + "\n");
	System.out.print ("Totalbeds: ");
	int Totalbeds = hospitalDetails.nextInt();
	System.out.println("TotalBeds in Hospital:" + Totalbeds + "\n"); 
	System.out.print ("Extra: ");
	int Extra = hospitalDetails.nextInt();
	System.out.println("ExtraBeds Available " + (Extra*2) + "\n");
	Boolean isGov = true;
	System.out.print("booleanHosname: " );
	String booleanHosname = hospitalDetails.nextLine();
	System.out.println( booleanHosname + isGov);   
	
	/*//Total Information of the Hospital
	System.out.println("****** Hospital Details ******" + "n");
	System.out.println(name + " Hospital " );
	System.out.println("Address of the Hospital:" + address );
	System.out.println("TotalBeds in Hospital:" + Totalbeds ); 
	System.out.println("ExtraBeds Available " + (Extra*2) + "\n");
	System.out.println("******************************");*/
	
	
	}
}