package EjeAssert;

import org.junit.jupiter.api.Test;

import proyectoPrueba.ExcepcionBlanco;
import proyectoPrueba.ExcepcionNumero;
import proyectoPrueba.ExcepcionSalida;
import proyectoPrueba.ExcepcionVocal;

public class TestUnit {
			
	@Test
	void testException() {
		assertEquals(5, 2+2, "El metodo suma esta mal");
}
}
