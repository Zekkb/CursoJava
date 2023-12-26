
public class Video24_Array_II_uso_arrays_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarar matriz de tipo String
		String [] paises = {"España","Mexico","Colombia","Peru","Chile","Argentina","Ecuador","Venezuela"};
		
		//Imprimir mediante for each
		/* Estructura for each
		 * 
		 * Es una bucle que se utiliza para recorrer
		 * arrays de una forma mas simplificada que
		 * el for tradicional
		 * 
		 * Su sintaxis es 
		 * 1"tipo de dato de la matriz"
		 * 2"nombre a los elementos de la matriz"
		 * 3"se coloca : y el nombre de la matriz"
		 */
		for(String elemento:paises) {
			
			System.out.println("Pais " + elemento);
		}
		//Recorrer la matriz "paises" mediante el for each
		
	}

}
