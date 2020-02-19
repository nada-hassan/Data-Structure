package calc;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class addtest {

	@Test
	public void test1() {
		calc testing = new calc();
		int result = testing.add(-2,1);
		assertEquals(-1, result);	
	}
	@Test
	public void test2() {
		calc testing = new calc();
		int result = testing.add(200,100);
		assertEquals(300, result);
		
	}
	@Test
	public void test3() {
		calc testing = new calc();
		int result = testing.add(-200,-100);
		assertEquals(-300, result);
		
	}

}
