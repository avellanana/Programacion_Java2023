package objetoscomplejos;

import org.junit.Test;

public class TestObjetosCompuestos {
	
	@Test
	public void test_persona_Complejos() throws CloneNotSupportedException{
		Mascota m = new Mascota ("Coco");
		Localidad l = new Localidad("Sevilla", 41001);
		Direccion d = new Direccion("Calle1", 1, l);
		Persona p = new Persona(20, "Alex", "11111D", d, m);
		
		
		Persona pclone = (Persona) p.clone();
	}

}
