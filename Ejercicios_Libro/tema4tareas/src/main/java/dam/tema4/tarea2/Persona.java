package dam.tema4.tarea2;

import dam.tema4.tarea2.Persona;

public class Persona {
	//atributos
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	//constructor parámetros
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	//constructor copia
	public Persona(Persona p) {
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.edad = p.edad;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	//método toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	
	//método clone
	@Override
    public
	Object clone() throws CloneNotSupportedException {
    	Persona personaClonada = new Persona(this.nombre, this.apellidos, this.edad);
    	return personaClonada;
	}
	
	
	//método equals
	public boolean equals(Object obj) {
    	Persona p = (Persona) obj;
    	if (this.nombre == p.nombre && this.apellidos == p.apellidos && this.edad == p.edad) 
    	{
    		return true;
    		}else {
    			return false;
    	}
    }
	
	public static void main(String[] args) {
		Persona p1 = new Persona("Lupe", "Ramirez", 20);
		System.out.println(p1.toString());
	}

}


