package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import proyectoPrueba.ExcepcionBlanco;
import proyectoPrueba.ExcepcionNumero;
import proyectoPrueba.ExcepcionSalida;
import proyectoPrueba.ExcepcionVocal;

public class TestUnit {
			
	@Test
	void testSingleSuccessTest() {
		assertEquals(5, 2+2, "El metodo suma está mal");
		LeerPorTeclado teclado = new LeerPorTeclado();
	try{
		teclado.processChar('a');
		assertTrue(false);
		} catch (ExcepcionVocal e) {
			assertTrue(e.getMessage().contains("Excepcion de vocal"));
		}
}
