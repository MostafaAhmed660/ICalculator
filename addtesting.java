package Calculator;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addtesting {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int result = test.add(20,5);
		assertEquals(25,result);
	
	}
	
	@Test
	public void test2() {
		Calculator test = new Calculator();
		int result = test.add(-100,5);
		assertEquals(-95,result);
	
	}
	
	@Test
	public void test3() {
		Calculator test = new Calculator();
		int result = test.add(-500,-20);
		assertEquals(-520,result);
	
	}


}

