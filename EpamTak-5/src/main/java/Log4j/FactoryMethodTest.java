package Log4j;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryMethodTest {

	@Test
	public void testCost1() {
		CalculateCost standardCost= new CalculateCost();
		assertEquals(6000.0,standardCost.Cost("standard", 5),0);
	}
	@Test
	public void testCost2() {
		CalculateCost aboveStandardCost= new CalculateCost();
		assertEquals(9000.0,aboveStandardCost.Cost("Abovestandard", 6),0);
	}
	@Test
	public void testCost3() {
		CalculateCost highStandardCost= new CalculateCost();
		assertEquals(12600.0,highStandardCost.Cost("Highstandard", 7),0);
	}
	@Test
	public void testCost4() {
		CalculateCost highStandardFullAutomaticCost= new CalculateCost();
		assertEquals(20000.0,highStandardFullAutomaticCost.Cost("HighstandardFullautomatic", 8),0);
	}
	@Test
	public void testCost5() {	
		Payment empty=FactoryMethod.getPlan("");
		assertNull(empty);
	}
}
