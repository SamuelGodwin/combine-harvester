import java.util.ArrayList;

public class Field {

	private ArrayList<Crop> crops;
	public static final int MAX_CROPS = 10;
	
	public Field(String type, int value) {
		
		crops = new ArrayList<Crop>(MAX_CROPS);
		plant(type, value);
		
	}
	
	private void plant(String type, int value) {
		
		for ( int crop = 0; crop < MAX_CROPS; crop++ ) {
			
			crops.add(new Crop(type, value));
			
		}
		
	}
	
	public int harvest() {
		
		int totalProfit = 0;
		
		for ( Crop crop : crops ) {
			
			totalProfit += crop.getValue();
			
		}
		
		crops.clear();
		
		return totalProfit;
		
	}
	
}
