package java_project1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	
	Calculator calculator = new Calculator();
	
	@Test
	public void testSum() {
		assertEquals(10,calculator.sum());
	}

	@Test
	public void testMultiplication() {
		assertEquals(21,calculator.multiplication());
	}

	@Test
	public void testModulus() {
		assertEquals(1,calculator.modulus());
	}
	
	
	@BeforeEach
	public void dummy1() {
		System.out.println("This is a Before Annotation");
	}
	
	@AfterEach
	public void dummy2() {
		System.out.println("This is a after annotation");
	}
	
	@BeforeClass
	public void dummy3() {
		System.out.println("this is a before class annotation");
	}
	
	@AfterClass
	public void dummy4() {
		System.out.println("This is a after class annotation");
	}
	
	

}
