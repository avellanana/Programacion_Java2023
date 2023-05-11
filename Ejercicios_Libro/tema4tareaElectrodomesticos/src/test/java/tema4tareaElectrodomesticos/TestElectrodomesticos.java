package tema4tareaElectrodomesticos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestElectrodomesticos {
	@Test
	public void test_electrodomesticos() throws CloneNotSupportedException {
		Electrodomestico electrodomestico1 = new Electrodomestico("marca1","modelo1",100);
		Electrodomestico electrodomestico2 = new Electrodomestico("marca2","modelo2",200);
		Electrodomestico electrodomestico3 = new Electrodomestico("marca3","modelo3",300);
		Electrodomestico electrodomestico4 = electrodomestico1;
		Electrodomestico electrodomesticoClonado = (Electrodomestico) electrodomestico2.clone();
		
		assertFalse(electrodomestico1 == electrodomestico2);
		assertTrue(electrodomestico4 == electrodomestico1);
		
		assertFalse(electrodomestico1.equals(electrodomestico2));
		assertTrue(electrodomestico2.equals(electrodomesticoClonado));
	}
	

}
