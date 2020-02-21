package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dividetesting {

	@Test
	void test1() {
		Calculator test= new Calculator();
		  float result = test.divide(3,2);
		  assertEquals(1.5,result);
	}
	
	@Test
	void test2() {
		Calculator test= new Calculator();
		  float result = test.divide(-5,2);
		  assertEquals(-2.5,result);
	}
	@Test
	void test3() {
		Calculator test= new Calculator();
		  float result = test.divide(20,-2);
		  assertEquals(-10,result);
	}
	@Test
	void test4() {
		Calculator test= new Calculator();
		  float result = test.divide(-3,-2);
		  assertEquals(1.5,result);
	}

	@Test
	void test5() {
		Calculator test= new Calculator();
		 
		 // assertThrows(RuntimeException.class, ()->{test.divide(10, 0);});
	}
	
}

