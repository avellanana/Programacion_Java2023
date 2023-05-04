package tema4tareascorregidasInterface;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestHerenciaInterfaces {
	
	@Test
	public void test_herencia_interfaces() {
		
		Revista r1=new Revista("00001", "revista1", "cod001", 1991);
		
		assertFalse(r1.isPrestado());
		r1.prestar();
		assertTrue(r1.isPrestado());
		r1.devolver();
		assertFalse(r1.isPrestado());
		
	}
	
	
	
	
}