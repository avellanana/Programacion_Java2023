package pruebaUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libreria.Calculadora;

public class TestUnit {
	
	@BeforeAll
	static void setup() {
		System.out.println("@BeforeAll - executes once before all test methods in this class");
	}
	
	@BeforeEach
	void init() {
		System.out.println("@BeforeEach - executes before each test methods in this class");
	}
	
	@Test
	void testSingleSucessTest() {
		System.out.println("un test");
	}
	
	@Test	
	void testShowSomething() {
		System.out.println("otro test");
		Calculadora c1=new Calculadora();
		assertEquals(2,c1.suma(1, 1));
		assertEquals(3,c1.suma(1, 1));
		assertEquals(3,c1.suma(1, 1));
		assertEquals(9,c1.suma(1, 1));
	}

}
