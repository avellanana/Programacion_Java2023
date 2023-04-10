package dam.tema4.tareas;
/*Crear una clase Empleado q contendrá un un atributo heredable idEmpleado de tipo entero, y un atributo no 
 * heredable departamento de tipo String, además, contendrá un atributo no heredable de tipo Persona.
Crear los metodos set y get de cada uno.
Crear los metodos toString, clone y equals del empleado
Crear un constructor con todos los parametros y un constructor copia. 


Realizar unos tests de junit para crear empleados y compararlos entre ellos*/

import java.util.Objects;

public class Empleado {
	//atributos
    public int idEmpleado;
    private String departamento;
    private Persona persona;

    //constructor parámetros
    public Empleado(int idEmpleado, String departamento, Persona persona) {
        this.idEmpleado = idEmpleado;
        this.departamento = departamento;
        this.persona = persona;
    }

    //constructor copia
    public Empleado(Empleado empleado) {
        this.idEmpleado = empleado.idEmpleado;
        this.departamento = empleado.departamento;
        this.persona = empleado.persona;
    }

    //getters y setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public Persona getPersona() {
    	return persona;
    }
    
    public void setPersona(Persona persona) {
    	this.persona = persona;
    }

    //toString
    @Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", departamento=" + departamento + ", persona=" + persona + "]";
	}
    
    //equals
   	@Override
       public boolean equals(Object obj) {
   		Empleado emp1 = (Empleado) obj;
   		if (this.idEmpleado == emp1.idEmpleado && this.departamento == emp1.departamento) 
   			if (persona != null) 
   				return persona.equals(emp1.persona);
   				
   		return false;
   	}
   	
   /*ERROR //equals
	@Override
    public boolean equals(Object obj) {
		Empleado emp1 = (Empleado) obj;
		if (this.idEmpleado == emp1.idEmpleado && this.departamento == emp1.departamento && this.persona == emp1.persona) {
			return true;
		}else {
			return false;
		}
	}
	*/

    @Override
    public Empleado clone() throws CloneNotSupportedException {
    	Persona pc = (Persona) this.persona.clone();
    	return new Empleado(this.idEmpleado, this.departamento, pc);
    }
}

