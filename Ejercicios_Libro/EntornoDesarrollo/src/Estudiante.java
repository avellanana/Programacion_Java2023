
public class Estudiante {
	
	/* En este ejercicio se hizo refactorizacion RENOMBRANDO VARIABLES Y METODOS. Se modificó el nombre de variables y métodos
	 de inglés a español */
	
	//atributos
    private int idEstudiante;
    private String nombreEstudiante;
    
    //constructor
    public Estudiante(int id, String nombre) {
        idEstudiante = id;
        nombreEstudiante = nombre;
    }
    
    //metodos
    public void muestraDetalles() {
        System.out.println("Student ID: " + idEstudiante);
        System.out.println("Student Name: " + nombreEstudiante);
    }

    public void updateName(String nombre) {
        nombreEstudiante = nombre;
    }
}	