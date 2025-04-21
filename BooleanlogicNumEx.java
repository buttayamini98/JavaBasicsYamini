import java.util.Scanner;

public class BooleanlogicNumEx {
    public static void main(String[] args) {
		Scanner bln = new Scanner(System.in);
		System.out.print("Enter the A value: ");
		int A = bln.nextInt;
		System.out.print("Enter the B value: ");
		int B = bln.nextInt;
		
		boolean boolA = (A != 0);
		boolean boolB = (B != 0);
		boolean andResult = boolA && boolB;
		boolean orResult = boolA || boolB;
		boolean notA = !boolA;
		
		
		System.out.println(A + " AND " + B + " = " +  andResult );
		System.out.println(A + " OR " + B + " = " + orResult);
		System.out.println("NOT" + A + " = " + notA);
		bln.close();
		
		}
	}