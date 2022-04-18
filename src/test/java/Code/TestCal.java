package Code;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCal {
    private static final double DELTA = 1e-15;
    MiniCal calculator = new MiniCal();
	@Test
	public void test_sqroot() {
		double actual=calculator.sqroot(25.0);
		double exp=5.0;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_fact() {
		double actual=calculator.factorial(6);
		double exp=720;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_log() {
		double actual=calculator.log(145.256);
		double exp=4.978497702968366;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_power() {
		double actual=calculator.power(4.0,3.0);
		double exp=64.0;
		assertEquals(actual,exp, DELTA);
	}

	@Test
	public void test_sqroot2() {
		double actual=calculator.sqroot(19.0);
		double exp=2.0;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_fact2() {
		double actual=calculator.factorial(7);
		double exp=720;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_log2() {
		double actual=calculator.log(245.256);
		double exp=4.978497702968366;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_power2() {
		double actual=calculator.power(3.0,4.0);
		double exp=64.0;
		assertNotEquals(actual,exp, DELTA);
	}
}
