
public class CombineHarvester extends Harvester {

	private int length;
	
	public CombineHarvester(int fuelTankSize, int topSpeed, int length) {
		
		super(fuelTankSize, topSpeed);
		this.length = length;
		
	}
	
	public int harvestingCapacity() {
		
		return super.harvestingCapacity() * length;
		
	}
	
}
