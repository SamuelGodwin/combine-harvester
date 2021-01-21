//	Imports 'ArrayList' class.
import java.util.ArrayList;

/**
 *
 *	'Farm' class. This class contains a constructor method 'Farm' which adds an ArrayList object to each of the fields 'fields' and 'harvesters'.
 *	Also in this class are methods 'addHarvester', 'addField', 'addFields', 'harvest', 'calcTotalHarvestingCapacity', 'calculateProfit' and an accessor method, 'getProfit'.
 *	This class contains two int fields 'profit' and 'totalHarvestingCapacity'.
 *	This class and its methods are public, so are accessible anywhere.
 *
 */
public class Farm {

 	//	Field which stores an array 'fields'.
	private ArrayList<Field> fields;
 	//	Field which stores an array 'harvesters'.
	private ArrayList<Harvester> harvesters;
 	//	Field which stores the value of profit made from a harvest.
	private int profit;
 	//	Field which stores the total harvesting capacity of an entire farm.
	private int totalHarvestingCapacity;

	/**
	*	'Farm': a constructor method which adds an ArrayList object to each of the fields 'fields' and 'harvesters'.
	*/	
	public Farm() {
		
		//	Adds an ArrayList object to 'fields'.
		fields = new ArrayList<Field>();
		//	Adds an ArrayList object to 'harvesters'.
		harvesters = new ArrayList<Harvester>();

	}
		
	/**
	*	'addHarvester': adds a single Harvester object to 'harvesters' ArrayList.
	*/	
	public void addHarvester(Harvester harvester){
		//	Adds a single Harvester object to 'harvesters' ArrayList.
		harvesters.add(harvester);
	}
	
	/**
	*	'addField': adds a single Field object to 'fields' ArrayList.
	*/	
	public void addField(String type, int value){
	
		//	Adds a single Field object to 'fields' ArrayList.
		fields.add(new Field(type, value));
		
	}
	
	/**
	*	'addFields': adds multiple Field objects of same info to 'fields' ArrayList.
	*	'number' parameter is number of fields to add.
	*/	
	public void addFields(int number, String type, int value){
		
		//	Adds multiple Field objects via the 'addField' method inside a For loop.
		for (int i = 0; i < number; i++){
			addField(type, value);
		}
	}
	
	/**
	*	'harvest' method. This method applies 'harvest' (in 'Field') to fields in my 'fields' ArrayList, if they can be harvested 
	*	(i.e. are within a farm's total harvesting capacity).
	*/
	public void harvest(){
		//	Calls 'calcTotalHarvestingCapacity'.
		calcTotalHarvestingCapacity();
			
			//	If the number of fields in 'fields' is not within the total harvesting capacity of a farm...
			if (totalHarvestingCapacity < fields.size()) {
				//	For fields UP TO the total harvesting capacity...
				for (int i = 0; i < totalHarvestingCapacity; i++) {
					//	Harvests field.
					fields.get(i).harvest();
				}
			}
			//	If the number of fields in 'fields' is within the total harvesting capacity of a farm...
			else if (totalHarvestingCapacity >= fields.size()) {
				System.out.println("All of the fields can be harvested.");
				//	For each 'field' in 'fields'...
				for (Field field : fields) {
					//	Harvests field.
					field.harvest();
				}
			}
			//	Calls 'calculateProfit'.
			calculateProfit();
	}
	
	private void calcTotalHarvestingCapacity() {
		
		//	Resets to 0 so it can be re-calculated.
		totalHarvestingCapacity = 0;
		
		//	For each harvester in 'harvesters'...
		for (Harvester harvester : harvesters){
			
			//	Increases 'totalHarvestingCapacity' field by the harvesting capacity of a Harvester object.
			totalHarvestingCapacity += harvester.getHarvestingCapacity();
			
		}
	}
	
	/**
	*	'calculateProfit' method. This method increments the value in the field 'profit' by the total value of all crops in a 'Field' instance (inside a For loop).
	*	The amount of profit made depends on the amount of fields which can be harvested, i.e. a farm's total harvesting capacity.
	*/
	private void calculateProfit() {
		
		for (int i = 0; i < totalHarvestingCapacity; i++) {
			//	Increases the value in the field 'profit' by the total value of all crops in a 'Field' instance.
			profit += fields.get(i).getTotalValue();
		}
		
	}
	
	/**
	*	'getProfit' method. This is an accessor method for the field 'profit'. 
	*/
	public int getProfit(){
		//	Returns 'profit'.
		return profit;
	}
}