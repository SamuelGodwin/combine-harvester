
public class Harvest {

	public static void main(String[] args) {
		
		Farm farm = new Farm();
		
		for ( int i = 0; i < 5; i++ ) {
			
			farm.add("Corn", 20);
			farm.add("Wheat", 20);
			farm.add("Oats", 20);
			farm.add("Barley", 20);
		
		}
		
		Harvester harvester = new Harvester(1, 1);
		CombineHarvester combine = new CombineHarvester(2, 2, 3);
		
		farm.add(harvester);
		farm.add(combine);
		
		farm.harvest();
		
		System.out.println("\u00A3" + farm.getProfit());
		
		farm.harvest();
		
	}

}
