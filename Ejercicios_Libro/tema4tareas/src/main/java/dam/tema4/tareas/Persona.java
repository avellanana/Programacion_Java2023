package dam.tema4.tareas;

import java.util.Objects;


/* Crear la clase Persona con atributos nombre, apellidos y dni de tipo String  
 * y anyo de nacimiento de tipo int que se puedan heredar, crear el atributo apodo de forma que no se pueda heredar, 
 * crear metodos set y get para estos atributos. Crear los metodos toString, clone y equals heredados de object. 
 * Crear un constructor con todos los parametros y un constructor copia.
 * 
 * Crear un programa para crear de diferentes formas distintas personas, clonarlas, copiarlas y compararlas utilizando 
 * una clase junit para los tests.

*/

public class Persona {
	
	//atributos
    private String nombre;
    private String apellidos;
    private String dni;
    private int anyoNacimiento;
    protected String apodo;
    
    //constructor parametros
    public Persona(String nombre, String apellidos, String dni, int anyoNacimiento, String apodo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.anyoNacimiento = anyoNacimiento;
        this.apodo = apodo;
    }
    
    //constructor copia
    public Persona(Persona p) {
        this.nombre = p.nombre;
        this.apellidos = p.apellidos;
        this.dni = p.dni;
        this.anyoNacimiento = p.anyoNacimiento;
        this.apodo = p.apodo;
    }
    
    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    
    //toString
    @Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", anyoNacimiento="
				+ anyoNacimiento + ", apodo=" + apodo + "]";
	}
    
    //equals
    @Override
    public boolean equals(Object obj) {
    	Persona p = (Persona) obj;
    	if (this.nombre == p.nombre && this.apellidos == p.apellidos && this.anyoNacimiento == p.anyoNacimiento 
    			&& this.dni == p.dni && this.apodo == p.apodo) {
    		return true;
    		}else {
    			return false;
    	}
    }
    
    //clone
    @Override
    public
	Object clone() throws CloneNotSupportedException {
    	Persona p1 = new Persona(this.nombre, this.apellidos, this.dni, this.anyoNacimiento, this.apodo);
    	return p1;
	}
}
