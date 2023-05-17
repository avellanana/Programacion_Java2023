package libro.tema7.arrays;

public class EjercicioStrings {
	
	public static void main(String [] args) {
		String s1 = "arbol";
		String s2 = "ARBOL";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));

		int valor = s1.compareTo(s2);
		
		if(valor>0) {
			System.out.println(s1+" es mayor que "+s2);
		}else if(valor<0) {
			System.out.println(s1+" es menor que "+s2);
		}else {
			System.out.println("son iguales");
		}
	}
}
