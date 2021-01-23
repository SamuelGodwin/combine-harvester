/**
 *
 *	'Field' class. This class contains a constructor method 'Field' which passes values initially passed as parameters to the 'plant' method. Also in this class are methods
 *	'plant' and 'harvest' and an accessor method 'getTotalValue'.
 *	This class contains an array 'crops' and a static final int field 'NUMBER_OF_CROPS' as well as a normal int field, 'totalValue'.
 *	This class and its methods are public, so are accessible anywhere.
 *
 */
 public class Field {

	private Crop[] crops; 
	
	//	Field which stores the maximum number of crops in a field. This is always 10, so the field is public, static and final.
	public static final int NUMBER_OF_CROPS = 10;
	
	private int totalValue;
	
	/**
	*	
	*/
	public Field(String type, int value) {
		
		plant(type, value);

	}
	
	/**
	*
	*/
	public void plant(String type, int value) {
		
		crops = new Crop[NUMBER_OF_CROPS];
		
		//	Fills 'crops'.
		for (int i = 0; i < NUMBER_OF_CROPS; i++) {
			crops[i] = new Crop(type, value);

		}
		
	}
	
	/**
	*	'harvest' method. This method harvests my 'crops' array for its crops if they are not already null.
	*/
	public void harvest(){
		
		//	For all crops in field...
		for (int i=0; i < NUMBER_OF_CROPS; i++) {

			if (!(crops[i] == null)) {

				totalValue += crops[i].getValue();
				
				//	Removes the crop from the field.
				crops[i] = null;
				
			}
			else {
				System.out.println("Element in 'crops' is null.");
			}
		}
		
	}
	
	/**
	*	
	*/
	public int getTotalValue(){
		return totalValue;
	}
	
}