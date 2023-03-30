package conceptosBasicos;

public class SetGetNuevo {
	
	public static void main (String []args) {
		SetGet objetoNuevo = new SetGet();
		
		objetoNuevo.setEdad(32);
		
		int resultado = objetoNuevo.getEdad();
		System.out.println(resultado);
		
		
		
		objetoNuevo.setNombre("Ana");
		System.out.println("El nombre es: " + objetoNuevo.getNombre());
	
	}
}
