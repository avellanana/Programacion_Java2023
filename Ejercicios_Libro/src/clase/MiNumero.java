package clase;

public class MiNumero {
	
	double numeroProporcionado;
	
	
	MiNumero(double nuevoNumero){
		numeroProporcionado = nuevoNumero;
	}
	
	double cambioDoble() {
		return 2*numeroProporcionado;
	}
	
	double cambioTriple() {
		return 3*numeroProporcionado;
	}
	
	double cambioCuadruple() {
		return 4*numeroProporcionado;
	}
	
	public static void main (String[]args) {
		
		MiNumero n2 = new MiNumero(5);
		System.out.println(n2.cambioTriple());
		
	}

}
