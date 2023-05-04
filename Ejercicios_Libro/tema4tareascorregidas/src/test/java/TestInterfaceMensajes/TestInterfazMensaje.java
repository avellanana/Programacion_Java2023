package TestInterfaceMensajes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import practicaInterfaces.Mensaje;

public class TestInterfazMensaje {
	
	@Test
	public void TestInterfazMensaje() {
		
		Mensaje m = new Mensaje("Esto es un mensaje");
				
		assertTrue(m.getPrioridad().equals("La prioridad es media"));
		m.cambiarPrioridadAlta();
		assertTrue(m.getPrioridad().equals("La prioridad es alta"));
	}

}
