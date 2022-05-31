import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAddNormal() {
//		fail("Not yet implemented");
		int a = 4;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 6;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testAddBoundaryMin() {
//		fail("Not yet implemented");
		int a = 0;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testAddBoundaryMax() {
//		fail("Not yet implemented");
		int a = 9999;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 19998;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testAddError() {
//		fail("Not yet implemented");
		int a = -1;
		int b = 10000;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		String expected = "Error!";
		assertNotEquals ("Error", actual);
	}
	
	@Test
	public void testSubtractNormal() {
//		fail("Not yet implemented");
		int a = 4;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 2;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtractBoundaryMin() {
//		fail("Not yet implemented");
		int a = 0;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtractBoundaryMax() {
//		fail("Not yet implemented");
		int a = 9999;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtractError() {
//		fail("Not yet implemented");
		int a = -1;
		int b = 10000;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		String expected = "Error!";
		assertNotEquals ("Error", actual);
	}
	
	@Test
	public void testDivideNormal() {
//		fail("Not yet implemented");
		int a = 4;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 2;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideBoundaryMin() {
//		fail("Not yet implemented");
		int a = 0;
		int b = 1;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideBoundaryMax() {
//		fail("Not yet implemented");
		int a = 9999;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 1;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivideError() {
//		fail("Not yet implemented");
		int a = -1;
		int b = 10000;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		String expected = "Error!";
		assertNotEquals ("Error", actual);
	}
	
	@Test
	public void testMultiplyNormal() {
//		fail("Not yet implemented");
		int a = 4;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 8;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyBoundaryMin() {
//		fail("Not yet implemented");
		int a = 0;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 0;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyBoundaryMax() {
//		fail("Not yet implemented");
		int a = 9999;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 99980001;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiplyError() {
//		fail("Not yet implemented");
		int a = -1;
		int b = 10000;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		String expected = "Error!";
		assertNotEquals ("Error", actual);
	}
}
