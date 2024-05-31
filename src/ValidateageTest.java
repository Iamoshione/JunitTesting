import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateageTest {
	
	
	Validateage validateage = new Validateage ();

	@Test
	void testAge() {
	    assertTrue(validateage.ValidateAge(18));  
	    assertTrue(validateage.ValidateAge(23)); 
	    assertFalse(validateage.ValidateAge(17)); 
	    assertFalse(validateage.ValidateAge(24)); 
	}

}

//Here i have created an object of the ValidateAge class using the new keyword
// i did this so i can access the method that performs the validation;