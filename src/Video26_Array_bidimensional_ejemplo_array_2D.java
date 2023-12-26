
public class Video26_Array_bidimensional_ejemplo_array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		
		double interes=0.10;
		
		double [][] saldo =new double[6][5];
		
		//Rellenar la matriz con su saldo e interes 
		for(int i=0;i<6;i++) {
			
			saldo[i][0]=10000;
			acumulado=10000;
			
			for(int j=1;j<5;j++) {
				
				acumulado=acumulado+(acumulado*interes);
				
				saldo[i][j]=acumulado;
				
				//System.out.print(saldo[i][j] + " ");
				
			}
			
			interes=interes+0.01;
			
			
		}
		
		//Recorrer la matriz 
		for(int i=0;i<5;i++) {
			System.out.println();
			
			for(int j=0;j<6;j++) {
				
				System.out.printf("%1.2f", saldo[j][i]);
				System.out.print(" ");
			}
			
			
			
		}
		
	}

}
