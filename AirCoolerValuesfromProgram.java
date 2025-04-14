public class AirCoolerValuesfromProgram {
	public String companyname;
	public int weight;
	public String color;
	void display() {
	System.out.println("companyname " + companyname);
	System.out.println("weight " + weight);
	System.out.println("color " + color);
	}
	public static void main(String[] args) {
		AirCooler cooler = new AirCooler();
		cooler.companyname = "Hindware";
		cooler.weight = 40;
		cooler.color = "white";
		cooler.display();
	}
}	
	