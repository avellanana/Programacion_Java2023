package libro.tema7.arrays;

public class Strings {
	
	public static void main(String[] args) {
		
		String cadenaS = "andy";
		String cadenaS2 = "andy y lucas";
		String cadenaS3 = cadenaS.concat("andy y lucas");
		String cadenaS4 = cadenaS.concat(new String("andy y lucas"));
		String cadenaS5 = cadenaS.concat(cadenaS2);
		
		String nombre = "alexa";
		String apellido = "ALEXA";
		String nombreCompleto = nombre +" "+ apellido;
		System.out.println(nombreCompleto);
		
		int resultado = nombre.compareTo(apellido);
		System.out.println(resultado);
		
	}
	

}
