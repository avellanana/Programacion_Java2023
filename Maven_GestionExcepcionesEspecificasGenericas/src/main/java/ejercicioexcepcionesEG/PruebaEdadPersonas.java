package ejercicioexcepcionesEG;

import excepcionesEG.AdultoException;
import excepcionesEG.InfantilException;
import excepcionesEG.MayorException;

public class PruebaEdadPersonas {
	
	int edad;
	
	public void generaExcepcionEdad(int edad) throws InfantilException, AdultoException, MayorException {
		if (edad<18) {
			throw new InfantilException("La edad "+ edad + " es inferior a 18");
		}else {
			if (edad>=18 && edad<65) {
				throw new AdultoException("La edad " + edad + " esta entre 18 y 65");
			}else {
				if(edad>=65) {
					throw new MayorException("La edad " + edad + " es superior a 65");
				}
			}
		}
	}

}
