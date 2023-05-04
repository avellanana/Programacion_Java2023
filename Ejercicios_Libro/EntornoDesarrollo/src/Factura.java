import java.util.List;

/*En este ejercicio se ha utilizado refactorizar a través de la EXTRACCION DE MÉTODOS, creando 3 métodos distintos llamados: 
 obtenerPrecio : obtiene el precio de los item y muestra un subtotal
 calculoImpuestos : obtiene el subtotal y hace el cálculo de impuestos
 calculoTotal : suma el subtotal y los impuestos
 mostrarInformacion : muestra la información de la factura*/

public class Factura implements InterfazFactura {
	//atributos
	    private List<Item> items;
	    private double impuestos;
	    
	    //metodos
	    @Override
		public double calcularTotal() {
	        double subtotal = obtenerPrecio();

	        double impuestos = calculoImpuestos(subtotal);

	        double total = calculoTotal(subtotal, impuestos);

	        mostrarInformacion(subtotal, impuestos, total);

	        return total;
	    }

		private void mostrarInformacion(double subtotal, double impuestos, double total) {
			// Mostrar información de la factura
	        System.out.println("Subtotal: " + subtotal);
	        System.out.println("Impuestos: " + impuestos);
	        System.out.println("Total: " + total);
		}

		private double calculoTotal(double subtotal, double impuestos) {
			// Cálculo del total
	        double total = subtotal + impuestos;
			return total;
		}

		private double calculoImpuestos(double subtotal) {
			// Cálculo de impuestos
	        double impuestos = subtotal * 0.1;
			return impuestos;
		}

		private double obtenerPrecio() {
			double subtotal = 0;

	        for (Item item : items) {
	            subtotal += item.getPrecio();
	        }
			return subtotal;
		}
	}
