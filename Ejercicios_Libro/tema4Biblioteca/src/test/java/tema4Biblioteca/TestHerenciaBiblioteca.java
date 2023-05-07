package tema4Biblioteca;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestHerenciaBiblioteca {
		
	@Test
	public void test_herencia_interfaces() {
			
		Revista r1=new Revista("00001", "revista1", "cod001", 1991);
			
		assertFalse(r1.isPrestado());
		r1.prestar();
		assertTrue(r1.isPrestado());
		r1.devolver();
		assertFalse(r1.isPrestado());
		
		Libro l1=new Libro("libro1","cod02",1980);
		
		assertFalse(l1.isPrestado());
		l1.prestar();
		assertTrue(l1.isPrestado());
		l1.devolver();
		assertFalse(l1.isPrestado());
		
		Libro l2=new Libro("libro2","cod03",1999);
		assertFalse(l2.isPrestado());
		l2.prestar();
		assertTrue(l2.isPrestado());
		l2.devolver();
		assertFalse(l2.isPrestado());
		
		Revista r2=new Revista("002", "revista2", "cod04", 2010);
		
		assertFalse(r2.isPrestado());
		r2.prestar();
		assertTrue(r2.isPrestado());
		r2.devolver();
		assertFalse(r2.isPrestado());
		
		Revista r3=new Revista("004", "revista3", "cod05", 2011);
		
		assertFalse(r3.isPrestado());
		r3.prestar();
		assertTrue(r3.isPrestado());
		r3.devolver();
		assertFalse(r3.isPrestado());
			
	}
		
}
