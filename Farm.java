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

	private ArrayList<Field> fields;
	private ArrayList<Harvester> harvesters;
 	//	Field which stores the value of profit made from a harvest.
	private int profit;
 	//	Field which stores the total harvesting capacity of an entire farm.
	private int totalHarvestingCapacity;

	/**
	*	
	*/	
	public Farm() {
		
		//	Adds an ArrayList object to 'fields'.
		fields = new ArrayList<Field>();
		//	Adds an ArrayList object to 'harvesters'.
		harvesters = new ArrayList<Harvester>();

	}
		
	/**
	*	
	*/	
	public void addHarvester(Harvester harvester){
		harvesters.add(harvester);
	}
	
	/**
	*	
	*/	
	public void addField(String type, int value){
	
		fields.add(new Field(type, value));
		
	}
	
	/**
	*
	*/	
	public void addFields(int number, String type, int value){
		
		for (int i = 0; i < number; i++){
			addField(type, value);
		}
	}
	
	/**
	*	'harvest' method. This method applies 'harvest' (in 'Field') to fields in my 'fields' ArrayList, if they can be harvested 
	*	(i.e. are within a farm's total harvesting capacity).
	*/
	public void harvest(){
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
				for (Field field : fields) {
					//	Harvests field.
					field.harvest();
				}
			}
			calculateProfit();
	}
	
	private void calcTotalHarvestingCapacity() {
		
		//	Resets to 0 so it can be re-calculated.
		totalHarvestingCapacity = 0;
		
		for (Harvester harvester : harvesters){
			
			//	Increases 'totalHarvestingCapacity' field by the harvesting capacity of a Harvester object.
			totalHarvestingCapacity += harvester.getHarvestingCapacity();
			
		}
	}
	
	/**
	*	The amount of profit made depends on the amount of fields which can be harvested, i.e. a farm's total harvesting capacity.
	*/
	private void calculateProfit() {
		
		for (int i = 0; i < totalHarvestingCapacity; i++) {
			//	Increases the value in the field 'profit' by the total value of all crops in a 'Field' instance.
			profit += fields.get(i).getTotalValue();
		}
		
	}
	
	/**
	*	
	*/
	public int getProfit(){
		return profit;
	}
}