package introduccion;

public class TiposPrimitivos {
	
	public static void main (String [] args) {
		
		byte minumero = (int) 55;
		System.out.println(minumero);
		
		short otronumero = 32767;
		System.out.println(otronumero);
		
		short v2 = minumero;
		System.out.println(v2);
		
		byte tercernumero = (byte) 128;
		System.out.println(tercernumero);
		
		int v3=77;
		minumero = (byte) v3;
		System.out.println(minumero);
		
		//convierte entero a byte (se pierde info)
		minumero = (byte) v3;
		
		//caracteres
		char c=217;
		System.out.println(c);
		
		//int entero1=c;
		//System.out.println(entero1);
		
		char c11=82;
		char c12='R';
		if (c11==c12) {
			System.out.println("Son iguales");
		} else {
			System.out.println("no son iguales");
		}
		System.out.println(c11);
		int entero1=c11;
		System.out.println(entero1);
		
		int var3, var4, var5, var6=8;
		int var1=5, var2=50;
		
		boolean v1 = true;
		boolean v4 = false;
		
		//enteros largos
		long milong = 21414;
		
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		//System.out.println(Long.MAX_VALUE);
	}

}
