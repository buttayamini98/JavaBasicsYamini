public class AnsiDemo {
	public static void main (String[] args) {
	
	String reset = "\u001B[0m";
	String redText = "\u001B[31m";
	String greenUnderline = "\u001B[32;4m" ;
	String blinkYellow = "\u001B[33;5m" ;
	
	System.out.println(redText + "Red color") ;
	System.out.println(greenUnderline + " Underline ") ;
	System.out.println(blinkYellow + " blink " + reset) ; 
	
	
	
	//Paragraph
	
	String headingLine = "\u001B[32;1m";
	String para1 = "\u001B[36;3m";
	String para2 = "\u001B[31;4;6m";
	System.out.println(headingLine + " \n\t\t\t " + "******" +  " Waterfall vs Agile Methodology " + "******" + reset + "\n" );
	System.out.println(para1 + "\t " + "The " + para2 + "\"Waterfall\"" +reset + para1 + " model follows a structured, sequential process, where each phase is completed before moving to the next. The " + para2 + "\"Agile\"" + reset + para1 + " methodology focuses on iterative development, allowing for adaptability and faster development cycles. " + reset ) ;
		
	
	}
}

