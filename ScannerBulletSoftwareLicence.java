import java.util.Scanner;

public class ScannerBulletSoftwareLicence {
	public static void main (String[] args) {
	
	//Using Scanner
	Scanner softwareLicense = new Scanner(System.in);
	System.out.print ("Type of License: ");
	String License = softwareLicense.nextLine();
	System.out.println(License + " License " + "\n "); 
	System.out.print ("License1: ");
	String Li1 = softwareLicense.nextLine();
	System.out.println( Li1 + " License" + "(closed-Source) " + "\n ");
	System.out.print ("Propreitary License Example1: ");
	String proLi1 = softwareLicense.nextLine();
	System.out.println( proLi1 + " License " + "\n ");
	System.out.print ("Propreitary License Example2: ");
	String proLi2 = softwareLicense.nextLine();
	System.out.println( proLi2 + " License Agreement " + "\n ");
	System.out.print ("License2: ");
	String Li2 = softwareLicense.nextLine();
	System.out.println( Li2 + " License " + "\n ");
	System.out.print ("Open-source License Example1: ");
	String osLi1 = softwareLicense.nextLine();
	System.out.println( osLi1 + " License " + "\n ");
	System.out.print ("Open-source License Example2: ");
	String osLi2 = softwareLicense.nextLine();
	System.out.println( osLi2 + " License Agreement " + "\n ");
	
	//Using Bullets
	String bullet = "\u2022";
	String bullet1 = "\u25B6";
	System.out.println(License + " License " + " (closed-Source) " ); 
	System.out.println( "\t " + "1." + Li1 + " License " );
	System.out.println( "\t \t " + bullet + proLi1 + " License " );
	System.out.println( "\t \t " + bullet + proLi2 + " License Agreement ");
	System.out.println( "\t " + "2." + Li2 + " License ");
	System.out.println( "\t \t " + bullet1 + osLi1 + " License ");
	System.out.println( "\t \t " + bullet1 + osLi2 + " License Agreement");
	}
}

