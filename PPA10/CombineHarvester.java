/**
 *
 *	'CombineHarvester' subclass. This class contains a constructor method 'CombineHarvester' which assigns a value passed as a parameter to the 'length' field in this class.
 *	The constructor also makes a super call to the 'Harvester' superclass, passing 'fuelTankSize' and 'topSpeed' as parameters.
 *	This class also contains an accessor method 'getHarvestingCapacity' which returns the result of 'getHarvestingCapacity' in 'Harvester' multiplied by 'length'.
 *	It is the subclass of 'Harvester'.
 *	This class and its methods are public, so are accessible anywhere.
 *
 */
 public class CombineHarvester extends Harvester{

	//	Variable which stores length of cutter bar.
	private int length;

	/**
	*	'CombineHarvester': a constructor method which assigns a value passed as a parameter to the 'length' field in this class.
	*	It also makes a super call to the 'Harvester' superclass, passing 'fuelTankSize' and 'topSpeed' as parameters.
	*/	
	public CombineHarvester(int fuelTankSize, int topSpeed, int length){
		//	Makes a super call to the 'Harvester' superclass, passing 'fuelTankSize' and 'topSpeed' as parameters.
		super(fuelTankSize, topSpeed);
		/*	Sets value of 'length' field to the value passed as a parameter.
		 *	'this' keyword avoids naming conflict for 'length'.	*/
		this.length = length;
	}

	/**
	*	'getTotalValue' method. This is an accessor method which returns the result of 'getHarvestingCapacity' in 'Harvester' multiplied by 'length'.
	*/	
	public int getHarvestingCapacity(){
		//	Returns the result of 'getHarvestingCapacity' in 'Harvester' multiplied by 'length'.
		return super.getHarvestingCapacity() * length;
	}
	
}