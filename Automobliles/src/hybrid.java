
public class hybrid extends Automobile {
	private int range;

	public hybrid(int rangee, int wheels, int miles, int fuel) {
		super(wheels, miles, fuel);
		range = rangee;
	}

	public int drive(int distance) {

		if (range < 0) {
			range = range - getFuel;
		}
	}

	public String toString() {
		return "leafy leafy";
	}

}
