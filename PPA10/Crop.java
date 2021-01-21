/**
 *
 *	'Crop' class. This class contains a constructor method 'Crop' which assigns values passed as parameters to the fields 'type' and 'value' in this class.
 *	This class also contains an accessor method 'getValue' for the field 'value'. 
 *	This class and its methods are public, so are accessible anywhere.
 *
 */
 public class Crop {

 	//	Field which stores a crop's 'type'.
	private String type;
	//	Field which stores a crop's 'value'.
	private int value;

	/**
	*	'Crop': a constructor method which assigns values passed as parameters to the fields 'type' and 'value' in this class.
	*/
	public Crop(String type, int value) {
		/*	Sets value of 'type' field to the value passed as a parameter.
		 *	'this' keyword avoids naming conflict for 'type'.	*/
		this.type = type;
		/*	Sets value of 'value' field to the value passed as a parameter.
		 *	'this' keyword avoids naming conflict for 'value'.	*/
		this.value = value;
		
	}
	
	/**
	*	'getValue' method. This is an accessor method for the field 'value'. 
	*/
	public int getValue() {
		
		//	Returns 'value' field.
		return value;
		
	}

}