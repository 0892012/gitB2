
import static org.junit.Assert.*;

import org.junit.Test;

public class Calctest {

	@Test
	public void addtest() {
		GoodCalc Calc = new GoodCalc();
		Calc.add(10,20);
		assertEquals(30, Calc.getResult());
	}
	
	@Test
	public void subtest() {
		GoodCalc Calc = new GoodCalc();
		Calc.sub(10,20);
		assertEquals(-10,Calc.getResult());
	}
	
	@Test
	public void multest() {
		GoodCalc Calc = new GoodCalc();
		Calc.div(20,10);
		assertEquals(2,Calc.getResult());
	}

}
