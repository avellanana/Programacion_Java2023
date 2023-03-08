package test;

import org.junit.jupiter.api.Test;

import ejercicioexcepcionesEG.PruebaEdadPersonas;
import excepcionesEG.AdultoException;
import excepcionesEG.InfantilException;
import excepcionesEG.MayorException;

public class TestJUnit_PruebaEdadPersonas {
	
	@Test
	void PrimerTest() {
		
		PruebaEdadPersonas prueba1 = new PruebaEdadPersonas();
		
		for (int i=0; i<100; i++) {
			int edad = (int)(Math.random()*100+1);
			try {
				prueba1.generaExcepcionEdad(edad);
			} catch (InfantilException e) {
				System.out.println(e.getMessage());
			} catch (AdultoException e) {
				System.out.println(e.getMessage());
			} catch (MayorException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
