import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateCgpaTest {

	ValidateCgpa validatecgpa = new ValidateCgpa();
	@Test
	void testCgpa() {
		 assertTrue(validatecgpa.ValidateGpa(3.0));
	        assertFalse(validatecgpa.ValidateGpa(2.4));
	}

}


//here also i have created an object using the new keyword 
// i have accessed the method that validates the gpa from the Validated class 
// i passed the argument to the class to perform the appropriate method 