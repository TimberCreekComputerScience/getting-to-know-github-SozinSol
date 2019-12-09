
public abstract class Automobile {

	private int numOfWheels;
	private double fuelLevel;
	private double maxFuel;
	private double milesPerGallon;

	public Automobile(int wheels, int miles, int fuel) {
		numOfWheels = wheels;
		maxFuel = fuel;
		fuelLevel = fuel;
		milesPerGallon = miles;
	}

	public void drive(double drove) {

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
