 
public abstract class Automobile {

	private int numOfWheels; 
	private double fuelLevel;
	private double maxFuel;
	private int milesPerGallon;
	
	public Automobile(int a,int c, double b) {
		numOfWheels = a;
		fuelLevel =b;
		milesPerGallon = c;
	}
	
	public boolean isEmpty() {
		return false;
		
	}

	

}
