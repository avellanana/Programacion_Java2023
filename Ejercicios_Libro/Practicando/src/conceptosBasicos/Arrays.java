package conceptosBasicos;

public class Arrays {
	
	static int [] numerosArray = new int [10];
	
	public Arrays() {
		numerosArray[0] = 20;
		numerosArray[4] = 60;
	}
	
	
	
	public static void main (String [] main) {
		Arrays MiArray = new Arrays();
		System.out.println(numerosArray[4]); //aqui pone el del constructor
		System.out.println(MiArray.numerosArray[4]); //aqui pone el del objeto con el atributo
		
		for (int i = 0; i<MiArray.numerosArray.length; i++) {
			System.out.println(MiArray.numerosArray[i]);
		}
		
		for (int i = 0; i<Arrays.numerosArray.length; i++) {
			System.out.println(Arrays.numerosArray[i]);
		}
	}

}

