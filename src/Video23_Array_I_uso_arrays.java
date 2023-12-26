
public class Video23_Array_I_uso_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Matriz
		 * 
		 * Una matriz es una colección de objeto 
		 * de un mismo tipo de dato
		 * 
		 */
		
		//Declarar una matriz 
		int [] mi_matriz = new int[5];
		
		int mi_matriz2[]= new int[6];
		
		//Inicializarla la matriz linea a linea
		mi_matriz[0]=20;
		mi_matriz[1]=2;
		mi_matriz[2]=3;
		mi_matriz[3]=40;
		mi_matriz[4]=-20;
		
		//Imprimir la matriz linea a linea
		System.out.print(mi_matriz[0] + " ");
		System.out.print(mi_matriz[1] + " ");
		System.out.print(mi_matriz[2] + " ");
		System.out.print(mi_matriz[3] + " ");
		System.out.println(mi_matriz[4] + " ");
		
		
		//Inicializar y declarar en la misma linea
		int [] mi_matriz3= {5,4,3,2,10,234,32,534};
		
		
		//Imprimir la matriz con un for
		
		int i;
		
		for(i=0;i<mi_matriz3.length;i++) {
			
			/* Propiedad length
			 * te devuele la cantidad de elementos 
			 * que tiene una matriz
			 * 
			*/
			System.out.println("Valor de indice " + i + " = " + mi_matriz3[i]);
		}
		
	}

}
