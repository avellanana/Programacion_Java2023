package tema4tareas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import dam.tema4.tarea2.Profesor;
import dam.tema4.tarea2.ProfesorInterino;
import dam.tema4.tarea2.Persona;

public class TestProfesores {
	@Test
	public void testPersona() {
	    Persona persona1 = new Persona("Juan", "Pérez", 25);
	    Persona persona2 = new Persona("Juan", "Pérez", 25);
	    Persona persona3 = new Persona("María", "Gómez", 30);
	    
	    Persona persona4 = persona1;
	    
	    Persona persona5 = new Persona(persona1);
	    
	    Persona persona6 = null;
	    
	    try {
			persona6 = (Persona) persona1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    assertFalse("debe ser false", persona1 == persona2);
	    assertFalse("debe ser false", persona3 == persona2);
	    assertTrue("debe ser true", persona4 == persona1);
	    assertFalse("debe ser false", persona5 == persona1);
	    assertFalse("debe ser false", persona6 == persona1);
	    
	    assertTrue("debe ser true", persona1.equals(persona2));
	    assertTrue("debe ser true", persona1.equals(persona4));
	    assertTrue("debe ser true", persona1.equals(persona5));
	}

	@Test
	public void testProfesor() {
	    Profesor profesor1 = new Profesor("Pedro", "López", 40, "123", "Matemáticas");
	    Profesor profesor2 = new Profesor("Pedro", "López", 40, "123", "Matemáticas");
	    Profesor profesor3 = new Profesor("Ana", "Martínez", 35, "456", "Física");
	    
	    Profesor profesor4 = profesor1;
	    
	    Profesor profesor5 = new Profesor(profesor1);
	    
	    Profesor profesor6 = null;
	    
	    try {
			profesor6 = (Profesor) profesor1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    assertFalse("debe ser false", profesor1 == profesor2);
	    assertFalse("debe ser false", profesor3 == profesor2);
	    assertTrue("debe ser true", profesor4 == profesor1);
	    assertFalse("debe ser false", profesor5 == profesor1);
	    assertFalse("debe ser false", profesor6 == profesor1);
	    
	    assertTrue("debe ser true", profesor1.equals(profesor2));
	    assertTrue("debe ser true", profesor1.equals(profesor4));
	    assertTrue("debe ser true", profesor1.equals(profesor5));
	
	}

	@Test
	public void testProfesorInterino() {
	    Date fecha = new Date();
	    ProfesorInterino interino1 = new ProfesorInterino("José", "García", 50, "789", "Historia", "2023/07/21");
	    ProfesorInterino interino2 = new ProfesorInterino("José", "García", 50, "789", "Historia", "2023/07/21");
	    ProfesorInterino interino3 = new ProfesorInterino("Sara", "Sánchez", 30, "012", "Geografía", "2023/07/21");
	    
	    ProfesorInterino interino4 = interino1;
	    
	    ProfesorInterino interino5 = new ProfesorInterino(interino1);
	    
	    ProfesorInterino interino6 = null;
	    
	    try {
			interino6 = (ProfesorInterino) interino1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    assertFalse("debe ser false", interino1 == interino2);
	    assertFalse("debe ser false", interino3 == interino2);
	    assertTrue("debe ser true", interino4 == interino1);
	    assertFalse("debe ser false", interino5 == interino1);
	    assertFalse("debe ser false", interino6 == interino1);
	    
	    assertTrue("debe ser true", interino1.equals(interino2));
	    assertTrue("debe ser true", interino1.equals(interino4));
	    assertTrue("debe ser true", interino1.equals(interino5));
	
	}
}
