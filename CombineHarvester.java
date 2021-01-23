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
	*	'CombineHarvester': constructor method which assigns a value passed as a parameter to the 'length' field in this class.
	*	It also makes a super call to the 'Harvester' superclass, passing 'fuelTankSize' and 'topSpeed' as parameters.
	*/	
	public CombineHarvester(int fuelTankSize, int topSpeed, int length){
		super(fuelTankSize, topSpeed);
		/*	Sets value of 'length' field to the value passed as a parameter.
		 *	'this' keyword avoids naming conflict for 'length'.	*/
		this.length = length;
	}

	/**
	*	
	*/	
	public int getHarvestingCapacity(){
		return super.getHarvestingCapacity() * length;
	}
	
}