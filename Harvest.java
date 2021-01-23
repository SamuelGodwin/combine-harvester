/**
 *
 *	'Harvest' class. This is the driver class for my solution. It contains my 'main' method. This is a simulation in which a harvest takes place on a farm which contains 
 *	multiple fields of crops. The farm, in my case, owns one harvester and one combine harvester. The result of the profit made from the harvest is to be printed on screen. 
 *	This is possible since every crop is given a value. This  class is the only class that is to be compiled and run directly, as the compiler will automatically compile 
 *	my other referenced classes.
 *	This class and its method are public, so are accessible anywhere.	
 *
 */
 public class Harvest {

  	/**
	*	'main' method. The main purpose of this method is to create objects of my classes and control the main flow of my program. 
	*/
	public static void main(String[] args){	

		Farm farm = new Farm();
		farm.addHarvester(new Harvester(1, 1));
		farm.addHarvester(new CombineHarvester(2, 2, 3));
		farm.addFields(5, "corn", 20);
		farm.addFields(5, "wheat", 20);
		farm.addFields(5, "oats", 20);
		farm.addFields(5, "barley", 20);
		farm.harvest();
		//	Prints result of 'getProfit' in 'Farm'.
		System.out.println("FARM'S PROFIT: " + farm.getProfit() + " POUNDS.");
	
	}
}