package tema4tareas;

import org.junit.Test;

import dam.tema4.tareas.Empleado;
import dam.tema4.tareas.Persona;

import static org.junit.Assert.*;

public class TestPersonas {

    @Test
    public void testPersona_class() {
    	
        Persona p1 = new Persona("Jose", "Lopez", "12121212A", 1994, "Pepe");
        Persona p2 = new Persona("Ana", "Ayala", "23232323B", 1990, "Any");
        Persona p3 = new Persona("Jose", "Lopez", "12121212A", 1994, "Pepe");
        
        //prueba con valores iguales
        Persona p4 = p1;
        
        //prueba con constructor copia
        Persona p5 = new Persona(p1);
        
        //prueba con clone
        Persona p6 = null;
        
        try {
			p6 = (Persona)p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //ASSERT
     	assertFalse("deberia ser false!", p1 == p2);
     	assertFalse("deberia ser false!", p1 == p3);
     	assertTrue("deberia ser true!", p1 == p4);
     	assertFalse("deberia ser false!", p2 == p4);
     	
     	// constructor copia
     	assertFalse("deberia ser false!", p1 == p5);
     	
     	// clone
     	assertFalse("deberia ser false!", p1 == p6);

     	//ASSERT EQUALS
     	assertTrue("deberia ser true!", p1.equals(p1));
     	assertFalse("deberia ser false!", p1.equals(p2));
     	assertTrue("deberia ser true!", p1.equals(p3));
     	assertTrue("deberia ser true!", p1.equals(p4));
     	assertTrue("deberia ser true!", p1.equals(p4));
     	assertTrue("deberia ser true!", p3.equals(p4));
     	
     	//copia
     	assertTrue("deberia ser true!", p1.equals(p5));
     	
     	//clone
     	assertTrue("deberia ser true!", p1.equals(p6));
    }

   
    @Test
    public void testEmpleado() throws CloneNotSupportedException {
    	
    	Persona p1 = new Persona("Mariana","Leyva", "89898989A", 1990,"Mar");
    	Persona p2 = new Persona("Silvia","Ramirez", "23232323A", 1990,"Sil");
    	Persona p3 = new Persona("Eduardo","Garza", "45454545C", 1990,"Edu");
    	Persona p4 = (Persona) p1.clone();
    	
        Empleado empleado1 = new Empleado(1,"Ventas",p1);
        Empleado empleado2 = new Empleado(2,"RH",p2);
        Empleado empleado3 = new Empleado(3,"Sistemas",p3);
        Empleado empleado4 = new Empleado(1,"Ventas",p1);
        Empleado empleado5 = new Empleado(1,"Sistemas",p1);
        Empleado empleado6 = (Empleado) empleado1.clone();
        Empleado empleado7 = empleado3;
        Empleado empleado8 = new Empleado (empleado1);

        //ASSERT
        assertFalse("deberia ser false!", empleado1 == empleado2);
     	assertFalse("deberia ser false!", empleado1 == empleado3);
     	assertFalse("deberia ser false!", empleado1 == empleado4);
     	assertFalse("deberia ser false!", empleado4 == empleado5);
     	
     	// constructor copia
     	assertFalse("deberia ser false!", empleado8 == empleado1);
     	
     	// clone
     	assertFalse("deberia ser false!", empleado6 == empleado1);
     	
     	//ASSERT EQUALS
     	assertTrue("deberia ser true!", empleado1.equals(empleado4));
     	assertFalse("deberia ser false!", empleado1.equals(empleado2));
     	assertFalse("deberia ser false!", empleado1.equals(empleado3));
     	
     	//copia
     	assertTrue("deberia ser true!", empleado8.equals(empleado1));
     	
     	//clone
     	assertTrue("deberia ser true!", empleado6.equals(empleado1));        
    }
}