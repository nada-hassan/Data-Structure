package calc;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dividetest {

	@Test
	public void test1() {
		calc testing = new calc();
		assertEquals(5, testing.divide(250, 50),0);
	}
	@Test
	public void test2() {
		calc testing = new calc();
		assertEquals(2.5, testing.divide(5, 2),0);
	}
	@Test
	public void test3() {
		calc testing = new calc();
		assertEquals(0.5, testing.divide(250, 500), 0);
	}
	@Test
	public void test4() {
		calc testing = new calc();
		assertThrows(RuntimeException.class, () -> { testing.divide(5,0);});
			
		}

}
