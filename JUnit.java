/*
 * 		Object : JUnit Test Cases for All Program of PF-2
 * 		Date : 19-01-2017
 * 
 */

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JUnit {

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

	@Test   // Test for Pattern1
	public void Pattern1() {
		Pattern1 object=new Pattern1();
		String expectedArrayTestCase1[]={"Invalid Input"};						//Negative Test
		String resultantArrayTestCase1[]=object.function(-5);
		assertArrayEquals(expectedArrayTestCase1,resultantArrayTestCase1);
		String expectedArrayTestCase2[]={"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};		//Positive Test
		String resultantArrayTestCase2[]=object.function(5);
		for(int index=0;index<((5*2)-1);index++){
			assertEquals(expectedArrayTestCase2[index], resultantArrayTestCase2[index]);
		}
	}
	
	@Test		// Test for Pattern2
	public void Pattern2() {
		Pattern2 object=new Pattern2();
		String expectedArrayTestCase1[]={"Invalid Input"};
		String resultantArrayTestCase1[]=object.function(0);					//Negative Test 
		assertArrayEquals(expectedArrayTestCase1, resultantArrayTestCase1);
		String expectedArrayTestCase2[]={"12345"," 1234","  123","   12","    1"};	//Positive Test
		String resultantArrayTestCase2[]=object.function(5);
		for(int index=0;index<5;index++){
			assertEquals(expectedArrayTestCase2[index], resultantArrayTestCase2[index]);
		}
	}
}
