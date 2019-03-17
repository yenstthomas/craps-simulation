import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CrookedDie1Test
{
	private CrookedDie1 die = new CrookedDie1();
	private int dieResult;
	
	@Before
	public void setUp() throws Exception
	{
		this.dieResult = this.die.getLastRoll();
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void test_getLastRoll_functionality() {
		assertEquals("The dieResult is not returning 3.",
				3,
				dieResult);
	}

	@Test
	public void test_testStatic_functionality() {
		// CrookedDie1 d = new CrookedDie1();
		assertEquals("The static method doesn't work right.", 
				"CrookedDie1", 
				die.testStatic().getClass().getName());
	}

}
