/**
 *
 *	'Field' class. This class contains a constructor method 'Field' which passes values initially passed as parameters to the 'plant' method. Also in this class are methods
 *	'plant' and 'harvest' and an accessor method 'getTotalValue'.
 *	This class contains an array 'crops' and a static final int field 'NUMBER_OF_CROPS' as well as a normal int field, 'totalValue'.
 *	This class and its methods are public, so are accessible anywhere.
 *
 */
 public class Field {

 	//	Field which stores an array 'crops'.
	private Crop[] crops; 
	
	//	Field which stores the maximum number of crops in a field. This is always 10, so the field is public, static and final.
	public static final int NUMBER_OF_CROPS = 10;
	
	//	Field which stores the total value of all crops in an instance of 'Field'.
	private int totalValue;
	
	/**
	*	'Field': a constructor method which passes values initially passed as parameters to the 'plant' method.
	*/
	public Field(String type, int value) {
		
		//	Calls 'plant' method with arguments 'type' and 'value'.
		plant(type, value);

	}
	
	/**
	*	'plant': adds an array object to the 'crops' variable and fills 'crops' with instances of 'Crop'.
	*/
	public void plant(String type, int value) {
		
		//	Adds an array object to the 'crops' variable of size 'NUMBER_OF_CROPS'.
		crops = new Crop[NUMBER_OF_CROPS];
		
		//	Fills 'crops' with instances of 'Crop'.
		for (int i = 0; i < NUMBER_OF_CROPS; i++) {
			crops[i] = new Crop(type, value);

		}
		
	}
	
	/**
	*	'harvest' method. This method harvests my 'crops' array for its crops, if they are not already null.
	*/
	public void harvest(){
		
		//	For all crops in field...
		for (int i=0; i < NUMBER_OF_CROPS; i++) {

			//	If element at index i is not null...
			if (!(crops[i] == null)) {

				//	Increases 'totalValue' by the value of the crop at index i.
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
	*	'getTotalValue' method. This is an accessor method for the field 'totalValue'. 
	*/
	public int getTotalValue(){
		//	Returns 'totalValue'.
		return totalValue;
	}
	
}