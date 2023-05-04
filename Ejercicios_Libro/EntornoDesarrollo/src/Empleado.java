import java.util.Date;

/* En este ejercicio se utilizo la refactorizacion EXTRACCION DE CLASES, creando una clase nueva llamada "DatosEmpleado" que 
 * tiene los datos del nombre, apellido, fechaContratacion y salarioBase, estos atributos se pasan a la clase Empleado a través
 * del método privado DatosEmpleado que crea un nuevo objeto "data"*/

public class Empleado {
    private DatosEmpleado data = new DatosEmpleado();

	public Empleado(String nombre, String apellido, Date fechaContratacion, double salarioBase) {
        this.data.nombre = nombre;
        this.data.apellido = apellido;
        this.data.fechaContratacion = fechaContratacion;
        this.data.salarioBase = salarioBase;
    }

    // getters y setters para los atributos

    public double calcularSalario() {
        // lógica para calcular el salario
    	return 0;
    }

    public int calcularAntiguedad() {
        // lógica para calcular la antigüedad
    	return 0;
    }

    public void imprimirInformacion() {
        // imprimir información sobre el empleado
    	
    }

}

