package tema4Robot;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestRobot {
	@Test
	public void test_robot_class() throws CloneNotSupportedException {
		System.out.println("primera linea");
		Robot r1 = new Robot(0, 0, 0);
		System.out.println("segunda linea");
		Robot r2 = new Robot(1, 1, 1);
		Robot r5 = (Robot) r2.clone();
		Robot r3 = r1;
		Robot r4 = (Robot) r1.clone();
		assertTrue(r3 == r1);
		assertFalse(r4 == r1);
		assertTrue(r4.equals(r1));
		assertFalse(r5 == r1);
		assertTrue(r5.equals(r2));
		assertFalse(r5 == r2);
	}

}


