package clase;

public class Coche_Ejercicio2 {
	
	public static void main(String[] args) {
		Coche coche2 = new Coche();
		System.out.println(coche2.getVelocidad());
		coche2.acelera(20);
		System.out.println(coche2.getVelocidad());
		coche2.frena(10);
		System.out.println(coche2.getVelocidad());
	}
}
