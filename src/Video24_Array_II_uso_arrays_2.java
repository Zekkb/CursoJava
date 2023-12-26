
public class Video24_Array_II_uso_arrays_2 {
	
	public static void main(String[] args) {
		
		//Declarar matriz de tipo String
		String [] paises=new String[8];
		
		paises[0]="Argentina";
		paises[1]="España";
		paises[2]="Francia";
		paises[3]="Holanda";
		paises[4]="Brasil";
		paises[5]="Mexico";
		paises[6]="Chile";
		paises[7]="Ecuador";
		
		//Imprimir mediante for
		for(int i=0;i<paises.length;i++) {
			
			System.out.println("Pais " + (i+1) + " " + paises[i]);
		}
		
	}
	
}
