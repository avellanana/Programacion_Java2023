package tema4Interfaces;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMensaje {
	
	@Test
	public void TestMensaje() {
		Mensaje m = new Mensaje("Esto es una prueba");
		
		assertTrue(m.getPrioridad().equals("normal"));
		m.cambiarPrioridadAlta();
		assertTrue(m.getPrioridad().equals("alta"));
		
		m.cambiarMensaje("Este es el mensaje cambiado");
		assertTrue(m.getMensaje().equals("Este es el mensaje cambiado"));
		assertFalse(m.getMensaje().equals("Esto es una prueba"));
		assertFalse(m.getPrioridad().equals("baja"));
		
		
	}

}
