public class ArrayDatatypesEx {
	public static void main(String[] args) {
	
	String[] Names = new String[5]; 
		Names[0] = "Arun";
		Names[1] = "Anjali";
		Names[2] = "Anu";
		Names[3] = "Ankith";
		Names[4] = "Amar";
		Names[5] = "Amar1";    // ArrayIndexOutOfBoundsException
	
	System.out.println( Names[0] );
	System.out.println( Names[1] );
	System.out.println( Names[2] );
	System.out.println( Names[3] );
	System.out.println( Names[4] ); 
	System.out.println("--------------------------");
	
	
	Float[] Numbers = {52.01f, 6.25f, 91.57f, 56.247f, 32.4895126f};
		for (int i=0; i < Numbers.length; i++) {
		System.out.println("Number" + (i + 1) + ":" + Numbers[i]);
		}
	System.out.println("--------------------------");
	
	
	double[] Number = {53.45,6.2564,3.214589765,321.5642,5654.254957};
	for (int i=0; i < Number.length; i++){
		System.out.println("Number" + (i + 1) + ":" + Number[i]);
		}
	System.out.println("--------------------------");
	
	
	char[] Letters = {'A','B','C','D'};  // single quotes in inside array
	for (int i=0; i < Letters.length; i++) {
		System.out.println("Letter " + (i + 1) + " : " + Letters[i]);
	}
	System.out.println("--------------------------");
	
	
	Long[] No = {56l,895l,5324l,56214l,-5648l};
	for (long l : No) {
		System.out.println(l);
		}
	System.out.println("--------------------------"); 
	
	
	}
}
	
	
	
	
	//https://www.w3schools.com/java/java_ref_arrays.asp
	
	//All Array Methods
	
	