
public class Harvester {
	
	private int fuelTankSize;
	private int topSpeed;

	public Harvester(int fuelTankSize, int topSpeed) {
		
		this.fuelTankSize = fuelTankSize;
		this.topSpeed = topSpeed;
		
	}
	
	public int harvestingCapacity() {
		
		return fuelTankSize + topSpeed;
		
	}

}
