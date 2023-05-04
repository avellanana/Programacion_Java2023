package tema5.arrays;


public class Ejercicio7 {
//Ejercicio 7: Crear la clase persona con nombre, DNI y edad, crear set/get y  metodo equals. 
//Crear un array de 10 elementos tipo Persona. Crear 10 personas y guardarlas en el array. 
//Iterar por el array para mostrar todas las personas. Crear un metodo que recibe un array de personas 
// y devuelve la primera persona con mayor edad
		

    Persona p1 = new Persona("Pepe", "1234567A", 12);
    Persona p2 = new Persona("Romina", "1234567B", 13);
    Persona p3 = new Persona("Luis", "1234567C", 14);
    Persona p4 = new Persona("Maria", "1234567D", 15);
    Persona p5 = new Persona("Ana", "1234567E", 16);

    Persona[] arrayPersonas = {p3, p2, p1, p4, p5};

    Persona p6 = new Persona("Pepe", "1234567A", 12);

    // Este método utiliza el foreach para iterar sobre el array
    public void muestraArray(Persona[] arrayPersonas) {
        for (Persona persona : arrayPersonas) {
            System.out.println(persona);
        }
    }

    public Persona mayorEdad() {
        Persona p = arrayPersonas[0];
        for (Persona persona : arrayPersonas) {
            if (persona.getEdad() > p.getEdad()) {
                p = persona;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Ejercicio7 e1 = new Ejercicio7();
        for (int i = 0; i < e1.arrayPersonas.length; i++) {
            if (e1.arrayPersonas[i].equals(e1.p6)) {
                System.out.println("La persona p6 se encuentra en la posición: " + i);
            }
        }
        e1.muestraArray(e1.arrayPersonas);
    }

    class Persona {
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
		public String toString() {
			return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
		}
		
		
	}
	
	

}

