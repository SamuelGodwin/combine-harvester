/**
 *
 *	'Harvest' class. This is the driver class for my PPA10 solution. It contains my 'main' method. This is a simulation in which a harvest takes place on a farm which contains 
 *	multiple fields of crops. The farm, in my case, owns one harvester and one combine harvester. The result of the profit made from the harvest is to be printed on screen. 
 *	This is possible since every crop is given a value. This  class is the only class that is to be compiled and run directly, as the compiler will automatically compile 
 *	my other referenced classes.
 *	This class and its method are public, so are accessible anywhere.	
 *
 */
 public class Harvest {

  	/**
	*	'main' method. The main purpose of this method is to create objects of my classes and control the main flow of my program. 
	*	This method is 'void' since it does not return anything.	
	*/
	public static void main(String[] args){	

		//	Creates an object of 'Farm' called 'farm'.
		Farm farm = new Farm();
		//	Adds Harvester of fuelTankSize 1 and topSpeed 1 to 'farm'.
		farm.addHarvester(new Harvester(1, 1));
		//	Adds CombineHarvester of fuelTankSize 2, topSpeed 2 and cutter length 3 to 'farm'.
		farm.addHarvester(new CombineHarvester(2, 2, 3));
		//	Adds 5 fields of type "corn" to 'farm'. Each crop has a value of 20.
		farm.addFields(5, "corn", 20);
		//	Adds 5 fields of type "wheat" to 'farm'. Each crop has a value of 20.
		farm.addFields(5, "wheat", 20);
		//	Adds 5 fields of type "oats" to 'farm'. Each crop has a value of 20.
		farm.addFields(5, "oats", 20);
		//	Adds 5 fields of type "barley" to 'farm'. Each crop has a value of 20.
		farm.addFields(5, "barley", 20);
		//	Calls 'harvest' in 'Farm'.
		farm.harvest();
		//	Prints result of 'getProfit' in 'Farm'.
		System.out.println("FARM'S PROFIT: " + farm.getProfit() + " POUNDS.");
	
	}
}