public class StringDatatypeMethodsEx {
    public static void main(String[] args) {

        byte b = 10;
        String byteStr = Byte.toString(b);
		short s = 300;
        String shortStr = Short.toString(s);
		int i = 1000;
        String intStr = Integer.toString(i);
		long l = 100000L;
        String longstr = Long.toString(l);
		float f = 12.34f;
        String floatStr = Float.toString(f);
		double d = 123.456789;
        String doubleStr = Double.toString(d);
		char c = 'A';
        String charStr = Character.toString(c);
		boolean flag = true;
        String booleanStr = Boolean.toString(flag);
		
		System.out.println("Byte as String: " + byteStr);
        System.out.println("Short as String: " + shortStr);
        System.out.println("Int as String: " + intStr);
        System.out.println("Long as String: " + longstr);
        System.out.println("Float as String: " + floatStr);
        System.out.println("Double as String: " + doubleStr);
        System.out.println("Char as String: " + charStr);
        System.out.println("Boolean as String: " + booleanStr); 
		
		//String Methods
		String name = "String Datatype";
		String name1 = " Example ";
		String name2 = " Example ";
		String name3 = " EXAMPLE ";
		
		char result = name.charAt(7);  
		System.out.println(result);	//Returns the character at the specified index (position)
		
		int result1 = name.codePointAt(2);
		System.out.println(result1); //Returns the Unicode of the character at the specified index
		
		int result2 = name.codePointBefore(2);
		System.out.println(result2);  Returns the Unicode of the character before the specified index//
		
		int result3 = name.codePointCount(0,4);
		System.out.println(result3);  //Returns the number of Unicode values found in a string.
		
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.toString());
		System.out.println(name.concat(name1));
		
		System.out.println(name.compareTo(name1));
		System.out.println(name1.compareTo(name2));
		
		System.out.println(name2.compareToIgnoreCase(name3));
		
		System.out.println(name.contains("Dat"));
		System.out.println(name1.contains("Dat"));
		
		System.out.println(name.contentEquals("Dat"));
		System.out.println(name1.contentEquals("Dat"));
		System.out.println(name.contentEquals("String Datatype"));
		
		System.out.println(name.endsWith("ype"));
		System.out.println(name.endsWith("ing"));
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3)); 
		
		System.out.println(name1.equalsIgnoreCase(name));
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.equalsIgnoreCase(name3));
		
		char[] name4 = {'Y','a','m','i','n','i'};
		String name5 = "";
		// name5 = name5.copyValueOf(name4, 0, 6);
		name5 = name5.copyValueOf(name4, 0, 4);
		System.out.println("Returned string: " + name5);  
		
        
		
    }
}	


		//https://www.w3schools.com/java/java_ref_string.asp
		
		//All String Methods



