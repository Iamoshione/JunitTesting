import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateStringTest {
	

	ValidateString validatestring = new ValidateString();

	@Test
	void testString() {
	     assertTrue(validatestring.ValidateName("John"));
	        assertFalse(validatestring.ValidateName("ThisNameIsWayTooLong"));
	       
	}

}
