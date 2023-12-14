
public class Video7_Operaciones {
	
	public static void main(String[] args) {
		
		//Delaracion de variables
		int a =5;
		int b;
		
		b=7;
		
		//El operador + suma dos variables
		int c=b+a;
		
		//Este mensaje imprime suma de a y b, almacenada en c
		System.out.println("La suma de "+ b +" y "+ a + " es "+ c);
		
		//El operador - resta dos variables
		c=b-a;
		
		//Este mensaje imprime resta de a y b, almacenada en c
		System.out.println("La resta de "+ b +" y "+ a + " es " + c);
		
		//Operador / entre dos variables
		/*
		 * Esto es una división entera, esto ocurre porque
		 * dos variables y el resultado de la la divisón son 
		 * de tipo de dato "entero", entonces devolveran
		 * un resultado entero.
		 */
		c=b/a;
		
		//Este mensaje imprime la división entera de a y b, almacenada en c
		System.out.println("La divisón entera de "+ b +" y "+ a + " es " + c);
		
		double aF = a;
		double bF = b;
		
		
		//Operador / entre dos variables
		/*
		 * Esta es una división tradicional, devuelve un valor con o 
		 * sin decimal, ocurre porque las variables son definida como
		 * punto flotante.
		 */
		double cF = bF/aF;
		
		//Este mensaje imprime la división entre aF y bF, almacenada en cF
		System.out.println("La división de " + bF + " y " + aF + " es " + cF);
		
	}

}
