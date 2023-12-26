
public class Video24_Array_II_uso_arrays_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz_aleatorios[]=new int[150];
		
		//Se almacenan numeros random a la matriz_aleatorios
		for (int i=0; i<matriz_aleatorios.length;i++) {
			
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
		}
		
		//Recorre la matriz matriz_aleatorios mediante for each
		for(int numeros:matriz_aleatorios) {
			
			System.out.print(numeros + " ");
		}
	}

}
