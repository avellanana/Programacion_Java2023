package quizzes;

public class NoCompila {
	
	public static void main (String [] args) {
		/*if (1==1) {
			System.out.println("A");
		System.out.println("B");
		}else
			System.out.println("C");
	}
	//No compila porque un if siempre tiene que llevar llaves { }
	 * 
	 * 
	*/
	
	int myvar = 7;
	switch(myvar)
	
	{
	case 1 : System.out.println("Hello"); break;
	case 2 : System.out.println("World"); break;
	case 3 : System.out.println("Happy");
	case 4 : System.out.println("Programming");
	case 5 : System.out.println("Thanks"); break;
	default : System.out.println("Congratulations!"); break;
	} 
	//El resultado es Programming Thanks porque entra el 4, y sigue al 5, y luego viene el break
	
	
	
	int n=5;
	while(n > 0)
	{
		System.out.println(n);
		n--;
	}
	//El resultado es 5 4 3 2 1 porque primero imprime el 5 y se va restando 1 en 1 hasta el 1.


	
/*	int i = 1;
	int j = 3;
	int k = 5;
	
	while(i<j) {
		k += (i * j);
		i = i * 2;
		i--;
	}
	System.out.println("i = " + i + "j= " + j + "k= " + k);
	
}
*/
	//Se produce un bucle infinito porque i sigue multiplicandose por 2 y restando uno

	int i = 0;
	while (i != 0) {
		System.out.println("while");
	}
	do {
		System.out.println("do-while");
	} 
	while(i != 0);
	// imprime do-while porque la primera condición no se cumple
	
	
	int num=6;
	if(num > 0)
		System.out.println("positive number");
	else
		System.out.println("negative number");
	System.out.println("The number is num: " + num);
	//imprime positive number y luego the nunmber is num 6, porque no necesita parentesis


	int r = 1;
	int j = 3;
	int k = 5;
	while (r < j) {
		k += (r*j);
		r = r * 2;
		j--;
	}
	System.out.println("r = " + r + " j =" + j + " K = " + k);

}

}
