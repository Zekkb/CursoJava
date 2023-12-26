
public class Video26_Array_bidimensional_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar y declarar matriz bidimensional en una linea
		int [][] matrix= {
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		//Recorrer la matriz mediante for each
		for(int []fila:matrix) {
			
			for(int z:fila) {
				
				System.out.print(z + " ");
				
			}
			
			System.out.println();
		}
		
		
	}

}
