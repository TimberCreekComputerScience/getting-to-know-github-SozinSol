
public class truck extends Automobile {
private int pickUpLoad;
private int maxPickUpLoad;

	public truck(int wheels, int miles, int fuel, int maxPickUp) {
		super(wheels, miles, fuel);

		maxPickUpLoad = maxPickUp;
		
	}

	public int laodTruck() {
		return maxPickUpLoad;
	}
	
	public int drive() {
			
			super.drive(miles);
	}
	
	public String toString() {
		return "putt putt";
	}
	
}
