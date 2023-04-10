package dam.tema4.tarea2;

public class Profesor extends Persona{
	protected String idProfesor;
	protected String asignatura;
	
	
	//constructor parámetros
	public Profesor(String nombre, String apellidos, int edad, String idProfesor, String asignatura) {
		super(nombre, apellidos, edad);
		this.idProfesor = idProfesor;
		this.asignatura = asignatura;
	}
	
	//constructor copia
	public Profesor(Profesor copiaProfesor) {
		super(copiaProfesor);
		this.idProfesor = copiaProfesor.idProfesor;
		this.asignatura = copiaProfesor.asignatura;
	}
	
	//getters y setters
	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	//método equals
	/*public boolean equals(Object obj) {
    	Profesor copiaProfesor = (Profesor) obj;
    	if (this.nombre == copiaProfesor.nombre && this.apellidos == copiaProfesor.apellidos && this.edad == copiaProfesor.edad && 
    			this.idProfesor == copiaProfesor.idProfesor && this.asignatura == copiaProfesor.asignatura) 
    	{
    		return true;
    		}else {
    			return false;
    	}
    }*/
	
	
	
	
	//método toString
	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", asignatura=" + asignatura + super.toString() + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		Profesor copiaProfesor = (Profesor) obj;
		if (asignatura == null) {
			if (copiaProfesor.asignatura != null)
				return false;
		} else if (!asignatura.equals(copiaProfesor.asignatura))
			return false;
		if (idProfesor == null) {
			if (copiaProfesor.idProfesor != null)
				return false;
		} else if (!idProfesor.equals(copiaProfesor.idProfesor))
			return false;
		return true;
	}

	//método clone
	@Override
    public Object clone() throws CloneNotSupportedException {
    	Persona profesorClonado = new Profesor(this.nombre, this.apellidos, this.edad, this.idProfesor, this.asignatura);
    	return profesorClonado;
	}
	
	public static void main(String[] args) {
		Profesor profe1 = new Profesor("Lupe", "Ramirez", 20, "LRM", "Marketing");
		System.out.println(profe1.toString());
	}


}
