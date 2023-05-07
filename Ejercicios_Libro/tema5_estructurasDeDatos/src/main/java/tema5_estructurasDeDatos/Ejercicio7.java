package tema5_estructurasDeDatos;

import java.util.Arrays;

public class Ejercicio7 {
//Ejercicio 7: Crear la clase persona con nombre, DNI y edad, crear set/get y  metodo equals. 
//Crear un array de 10 elementos tipo Persona. Crear 10 personas y guardarlas en el array. 
//Iterar por el array para mostrar todas las personas. Crear un metodo que recibe un array de personas 
// y devuelve la primera persona con mayor edad
	
Persona p1 = new Persona("Pepe", "1234567A", 12);
Persona p2 = new Persona("Romina", "1234567A", 13);
Persona p3 = new Persona("Luis", "1234567A", 14);
Persona p4 = new Persona("Maria", "1234567A", 15);
	Persona p5 = new Persona("Ana", "1234567A", 16);
	
	Persona[] arrayPersonas = {p3,p2,p1,p4,p5};
	
	Persona p6 = new Persona("Pepe", "1234567A", 12);
	
	//Este metodo utiliza el foreach para iterar sobre el array
	public void muestraArray(Persona[] arrayPersonas) {
		for (Persona persona : arrayPersonas) {
			
		}
	}
	
	public static void main(String[] args) {
		Ejercicio7 e1 = new Ejercicio7();
		for (int i = 0; i< e1.arrayPersonas.length; i++) {
			if (e1.arrayPersonas[i].equals(e1.p6)) {
				System.out.println("La persona p6 se encuenra en la posición: " + i);
			}
		}
		e1.muestraArray(null);
	}
	
	public void muestraArray(Persona[] arrayPersonas) {
		for(Persona persona : arrayPersonas) {
			System.out.println(persona);
		}
	}
	
	public void mayorEdad() {
		Persona p= arrayPersona[0];
		for (Persona persona : arrayPersonas) {
			if (persona.getEdad()>p.getEdad()) {
				p = persona;
			}
		}
		return p;
	}

	
	class Persona{
		private String nombre;
		private String dni;
		private int edad;
		
		public Persona(String nombre, String dni, int edad) {
			this.nombre = nombre;
			this.dni = dni;
			this.edad = edad;
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if(this == obj) {
				return true;
			} else {
				Persona p = (Persona) obj;
				if(this.nombre.equals(p.nombre) && this.dni.equals(p.dni) && this.edad == p.edad) {
					return true;
				}
				return false;
			}
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
		}
		
		
	}
	
	

}
