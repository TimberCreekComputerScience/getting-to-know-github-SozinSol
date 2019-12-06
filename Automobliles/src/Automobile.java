
public abstract class Automobile {

	private int numOfWheels;
	private double fuelLevel;
	private double maxFuel;
	private int milesPerGallon;

	public Automobile(int wheels, int miles, double fuel) {
		numOfWheels = wheels;
		maxFuel = fuel;
		fuelLevel = fuel;
		milesPerGallon = miles;
	}

	public void drive() {

		fuelLevel--;

	}

	public boolean isEmpty(){
		return true;
	}

	public void fillerUp() {
		fuelLevel = maxFuel;
	}

	public String toString() {
		
		
		return "";
	}

}
