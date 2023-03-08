package clase;

public class EjemploException {
	
	
	public static void main(String[] args) {	
	
	try {
		int a = 4/0;
	} catch (ArithmeticException e) {
		System.out.println("se ha producido una excepcion aritmetica");
	} catch (Exception e){
		System.out.println("se ha productido una excepcion de otro tipo");
	} finally {
		System.out.println("Bloque finally");
	}
	
	}

}
