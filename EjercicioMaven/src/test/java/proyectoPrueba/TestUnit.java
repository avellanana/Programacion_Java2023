package proyectoPrueba;

import org.junit.jupiter.api.Test;

import ejercicioPrueba.DNIException;
import ejercicioPrueba.EdadException;
import ejercicioPrueba.IMCException;
import ejercicioPrueba.Persona2;

public class TestUnit {
	
	Persona2 persona4 = new Persona2("Ana",4,8,"M");
	
	@Test
	void testSingleSucessTest() {
		System.out.println("Test de la clase persona");
		Persona2 p1=new Persona2("pepe", 10);
		
		p1.peso = 4;
		p1.altura=110;
		try {
			p1.calculaIMC();
		} catch (IMCException e1) {
			System.out.println(e1.getMessage());
		}
		
		try {
			p1.esMayorDeEdad();
		} catch (EdadException e1) {
			System.out.println(e1.getMessage());;
		}
		
		try {
			p1.generaDNIExt("error");
		} catch (DNIException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
