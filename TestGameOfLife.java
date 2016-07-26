import static org.junit.Assert.*;

import org.junit.Test;
public class TestGameOfLife {

	
/*
 * The following test cases will verify the convertToInt() method of MainPanel class
 * The functionality of this method is to return the integer passed without any modification.
 * the below three test cases will make sure that after refactoring the code the functionality remained same.
 * We will pass a positive number , zero and a negative number to see the functionality remains same for range of integers.
 */
	@Test
	public void converToInt1() {
//		pass the positive integer 100 to the method and verify if it returns the same value, if not test will fail
		if (MainPanel.convertToInt(100) != 100){
			fail();
		}
	}
	
	@Test
	public void converToInt2() {
//		pass the negative integer -23 to the method and verify if it returns the same value, if not test will fail
		if (MainPanel.convertToInt(-23) != -23){
			fail();
		}
	}
	
	@Test
	public void converToInt3() {
//		pass the 0 to the method and verify if it returns the same value, if not test will fail
		if (MainPanel.convertToInt(0) != 0){
			fail();
		}
	}
	


}
