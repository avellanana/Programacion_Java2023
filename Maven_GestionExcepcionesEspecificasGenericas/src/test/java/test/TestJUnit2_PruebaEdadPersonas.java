package test;

import org.junit.jupiter.api.Test;

import ejercicioexcepcionesEG.PruebaEdadPersonas;
import excepcionesEG.AdultoException;
import excepcionesEG.InfantilException;
import excepcionesEG.MayorException;

public class TestJUnit2_PruebaEdadPersonas {
	
	@Test
	void SegundoTest() {
		PruebaEdadPersonas prueba2 = new PruebaEdadPersonas();
		
		for (int i=0;i<100;i++) {
			int edad = (int)(Math.random()*100+1);
			try {
				prueba2.generaExcepcionEdad(edad);
			} catch (Exception e) {
				System.out.println("Se ha capturado una excepcion: " + e.getMessage());
			}
		}
		
	}

}
