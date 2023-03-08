package clase;

public class Numero {
	
	int numeroInicio;
	
	Numero(){
		numeroInicio = 0;
	}
	
//	Numero(int num_inicializado){
//		numeroInicio = num_inicializado;
//	}
	
	//metodos
	
	int aniade(int sumar) {
		return numeroInicio + sumar;
	}
	
	int resta(int restar) {
		return numeroInicio - restar;
	}
	
	int getValor() {
		return numeroInicio;
	}
	
	int getDoble() {
		return 2*numeroInicio;
	}
	
	int getTripe() {
		return 3*numeroInicio;
	}
	
	public void setNumero(int numeroInicio) {
		this.numeroInicio = numeroInicio;
	}
	
	public static void main (String[]args) {
		
		Numero n1 = new Numero();
		n1.setNumero(7);
		System.out.println(n1.aniade(4));
		System.out.println(n1.resta(4));
		System.out.println(n1.getValor());
		System.out.println(n1.getDoble());
		System.out.println(n1.getTripe());
		
		
	}

}
