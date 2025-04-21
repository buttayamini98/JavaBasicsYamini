public class DatatypesWithAO {
	public static void main(String[] args) {
	byte A = -121;  // variable and assign
	byte B;         // variable
	B = 120;        // assign
	byte C;
	C = (byte)(A + B); //Cast required because result of a+b is int by default
	short D = 3000;
	short E = 100;
	short F = (short)(D * E);
	//short F = (byte)(D * E);
	//int F = (D * E);
	long G = 600000000;
	long H = G * D;
	int I = 56234;
	short J = (short)(G - I) ;
	int K = 200;
	byte L = (byte)(K + A);
	byte M = (byte)(A + E);
	float N = 5236.5426f;
	double O = 62213.526489;
	float P = (float)(N + O);
	
	System.out.println("A + B = " + C); // Byte + Byte = Byte
	System.out.println("K + A = " + L); // Byte + Int = Byte
	System.out.println("A + E = " + M); // Byte + Short = Byte
	System.out.println("D * E = " + F); // Short + Short = Short
	System.out.println("G * D = " + H); // Long + Short = Long
	System.out.println("G - I = " + J); // Long + Int = Int
	System.out.println("N + O = " + P); // Float + Double = Float
	System.out.println("Sum" + " = " + (double)(5236.5426f + 52.000000000000));
	System.out.println("Addition" + " = " + (float)(5236.5426f + 52.000000000000));

	
   }
}
	
	
	
	
	
	
	
	/* 	byte	Stores whole numbers from -128 to 127
		short	Stores whole numbers from -32,768 to 32,767
		int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
		boolean	Stores true or false values */
	
	