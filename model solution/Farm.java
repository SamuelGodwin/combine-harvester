import java.util.ArrayList;

public class Farm {
	
	private ArrayList<Field> fields;
	private ArrayList<Harvester> harvesters;
	private int profit;
	
	public Farm() {
		
		fields = new ArrayList<Field>();
		harvesters = new ArrayList<Harvester>();
		
	}
	
	public void add(Harvester harvester) {
		
		harvesters.add(harvester);
		
	}
	
	public void add(Field field) {
		
		fields.add(field);
		
	}
	
	public void add(String type, int value) {
		
		fields.add(new Field(type, value));
		
	}
	
	public void harvest() {
		
		int totalHarvestingCapacity = 0;
		
		for ( Harvester harvester : harvesters ) {
			
			totalHarvestingCapacity += harvester.harvestingCapacity();
			
		}
		
		for ( int field = 0; field < Math.min(totalHarvestingCapacity, fields.size()); field++ ) {
				
			profit += fields.get(field).harvest();
				
		}
		
	}
	
	public int getProfit() {
		
		return profit;
		
	}

}
