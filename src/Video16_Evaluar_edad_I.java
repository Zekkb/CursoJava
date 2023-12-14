import java.util.Scanner;
public class Video16_Evaluar_edad_I {
	
	public static void main(String[] args) {
		
		//Evalular la edad
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad = entrada.nextInt();
		
		/* Se utiliza la estructura "if" 
		 * para evaluar una condición y si 
		 * si es verdadero "verdadero" leera las lineas 
		 * del bloque, o si es "falso" leera
		 * las lineas del bloque proximo.
		 * 
		 */
		if(edad>=18) {
			
			System.out.println("Eres mayor de edad");
			
		}else {
			
			System.out.println("Eres menor de edad");
		}
		
		
	}
	
	
}
