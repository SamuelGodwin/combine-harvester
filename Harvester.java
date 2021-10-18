/**
 *
 *	'Harvester' superclass. This class contains a constructor method 'Harvester' which assigns values passed as parameters to the fields 'fuelTankSize' and 'topSpeed' in this class.
 *	This class also contains an accessor method 'getHarvestingCapacity' which returns the sum of the fields 'fuelTankSize' and 'topSpeed'. 
 *	It is the superclass of 'CombineHarvester'.
 *	This class and its methods are public, so are accessible anywhere.
 *
 */
 public class Harvester {

 	//	Field used in calculating harvesting capacity.
	private int fuelTankSize;
 	//	Field used in calculating harvesting capacity.
	private int topSpeed;	
	
	/**
	*
	*/	
	public Harvester(int fuelTankSize, int topSpeed) {
		/*	Sets value of 'fuelTankSize' field to the value passed as a parameter.
		 *	'this' keyword avoids naming conflict for 'fuelTankSize'.	*/
		this.fuelTankSize = fuelTankSize;
		/*	Sets value of 'topSpeed' field to the value passed as a parameter.
		 *	'this' keyword avoids naming conflict for 'topSpeed'.	*/
		this.topSpeed = topSpeed;
	}
	
	/**
	*
	*/
	public int getHarvestingCapacity(){
		return fuelTankSize + topSpeed;
	}

}