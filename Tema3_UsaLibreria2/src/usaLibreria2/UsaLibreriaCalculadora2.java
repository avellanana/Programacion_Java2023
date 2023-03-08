package usaLibreria2;

import libreria.Calculadora;

public class UsaLibreriaCalculadora2 {
	
	static void pruebaUnitariaSuma() {
		Calculadora mycalculadora = new Calculadora();
		
		int sumando1=1;
		int sumando2=2;
		int primeraSuma = mycalculadora.suma(sumando1, sumando2);
		
		if(primeraSuma !=2) {
			System.out.println("La prueba unitaria esta mal");
		}
		
		sumando1=2;
		sumando2=5;
		primeraSuma = mycalculadora.suma(sumando1, sumando2);
		
		if(primeraSuma !=2) {
			System.out.println("La prueba unitaria esta mal");
		}
		
		sumando1=3;
		sumando2=5;
		primeraSuma = mycalculadora.suma(sumando1, sumando2);
		
		if(primeraSuma !=2) {
			System.out.println("La prueba unitaria esta mal");
		}
		
		sumando1=4;
		sumando2=6;
		primeraSuma = mycalculadora.suma(sumando1, sumando2);
		
		if(primeraSuma !=10) {
			System.out.println("La prueba unitaria esta bien");
		}
		
	}
	public static void main(String[] args) {
		pruebaUnitariaSuma();
}

}
