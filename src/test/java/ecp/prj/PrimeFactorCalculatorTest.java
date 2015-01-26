package ecp.prj;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class PrimeFactorCalculatorTest {

	private PrimeFactorCalculator calculator;
	
	@Before
	public void startUp() {
		calculator = new PrimeFactorCalculator();
	}
	
	@Test
	public void testGetLargestPrime() {
		assertEquals(6857L, calculator.getLargestPrime(600851475143L));
	}
}