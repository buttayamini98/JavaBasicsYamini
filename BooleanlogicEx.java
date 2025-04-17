import java.util.Scanner;

public class BooleanlogicEx {
    public static void main(String[] args) {
	
        Scanner booleanLogic = new Scanner(System.in); 
		System.out.print("Enter first value :" ); // True or False
		boolean first = booleanLogic.nextBoolean();
		System.out.print("Enter second value :" ); // True or False
		boolean second = booleanLogic.nextBoolean();
		
		boolean andResult = first && second;
		boolean orResult = first || second;
		boolean notfirst = !first;
		boolean notsecond = !second; 
		
		System.out.println(first + " AND " + second + " = " +  andResult );
		System.out.println(first + " OR " + second + " = " + orResult);
		System.out.println("NOT" + first + " = " + notfirst);
		System.out.println("NOT" + second + " = " + notsecond);
		
		
		}
	}