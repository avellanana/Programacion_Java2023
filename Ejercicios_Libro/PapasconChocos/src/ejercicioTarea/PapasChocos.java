/*Diseña un metodo con el que se pueda saber cuantos clientes se pueden atender con la materia prima del almacén. 
 * El metodo recibe una cantidad de papas y chocos en kilos y devuelve el numero de clientes que puede atender el 
 * restaurante, teniendo en cuenta que por cada 3 personas, se utiliza un kilo de papas y medio de chocos.
 */
package ejercicioTarea;

public class PapasChocos {
	
	public static double papasKg;
	public static double chocosKg;
	static double papasCliente = 1.0/3.0;
	static double chocosCliente = 1.0/6.0;

	public PapasChocos(double papasKg, double chocosKg) {
		this.papasKg = papasKg;
		this.chocosKg = chocosKg;
	}
	
	public static int CalculaClientes() {
		
		int maximoClientesPapas = (int)Math.floor(papasKg/papasCliente);
		int maximoClientesChocos = (int)Math.floor(chocosKg/chocosCliente);
		
		if(maximoClientesPapas > maximoClientesChocos) {
			return maximoClientesChocos;
		}else {
			return maximoClientesPapas;
		}
		
	}
	
	
	public void addChocos(double AgregarChocosKg) {
		chocosKg = chocosKg + AgregarChocosKg;
	}
	
	public void addPapas(double AgregarPapasKg) {
		papasKg = papasKg + AgregarPapasKg;
	}
	
	
	public double showChocos() {
		return chocosKg;
	}
	
	
	public double showPapas() {
		return papasKg;
	}

	public static void main (String []args) {
		PapasChocos calc1 = new PapasChocos (5.0,1.0);
		
		System.out.println(calc1.CalculaClientes());
		
	}
	
}




