package dam.tema4.tarea2;

import java.util.Date;

public class ProfesorInterino extends Profesor{
	//atributos
	private String fechaInterinidad;
	
	//constructor parámetros
	public ProfesorInterino(String nombre, String apellidos, int edad, String idProfesor, String asignatura, String fechaInterinidad) {
		super(nombre, apellidos, edad, idProfesor, asignatura);
		this.fechaInterinidad = fechaInterinidad;
	}
	
	//constructor copia
	public ProfesorInterino(ProfesorInterino copiaProfesorInterino) {
		super(copiaProfesorInterino);
		this.fechaInterinidad = copiaProfesorInterino.fechaInterinidad;
		}

	//setters y getters
	public String getFechaInterinidad() {
		return fechaInterinidad;
	}

	public void setFechaInterinidad(String fechaInterinidad) {
		this.fechaInterinidad = fechaInterinidad;
	}
	
	//método equals
	@Override
	public boolean equals(Object obj) {
		ProfesorInterino copiaProfesorInterino = (ProfesorInterino) obj;
		if (fechaInterinidad == null) {
			if (copiaProfesorInterino.fechaInterinidad != null)
				return false;
		} else if (!fechaInterinidad.equals(copiaProfesorInterino.fechaInterinidad))
			return false;
		return true;
	}
	
	
	//método clone
	@Override
	public Object clone() throws CloneNotSupportedException {
		ProfesorInterino profesorInterinoClonado = new ProfesorInterino(this.nombre, this.apellidos, this.edad, this.idProfesor, this.asignatura, this.fechaInterinidad);
		return profesorInterinoClonado;
	}
		
	//método toString
	@Override
	public String toString() {
	return "ProfesorInterino [fechaInterinidad=" + fechaInterinidad + super.toString()+"]";
	}

	public static void main(String[] args) {
		ProfesorInterino profeinterino1 = new ProfesorInterino("Lupe", "Ramirez", 20,"LRM", "Marketing","2023/07/21");
		System.out.println(profeinterino1.toString());
	}
		

}
