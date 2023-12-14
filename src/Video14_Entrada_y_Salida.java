import java.util.Scanner;
public class Video14_Entrada_y_Salida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Clase Scanner
		 * Se utiliza para poder obtener información
		 * desde la consola
		 * 
		 * para utilizar esta clase se tiene que importa la clase 
		 * se encuentra en "java.util.Scanner" 
		 * sino tambien se puede encontrar en la api
		 * 
		*/
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		/* Se usa el metodo "next.Line()" para obtener 
		 * la información de la consola
		 * 
		 * Como es un metodo no estatico, no se necesita
		 * nombrar a la clase del metodo, pero si
		 * se necesita definir un "objeto" de la clase para
		 * utilizarlo.
		 * 
		 */
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		
		/* El metodo "nextInt()" se utiliza para 
		 * tomar un dato de tipo "int" de la consola
		 * 
		 */
		int edad_usuario=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad_usuario+1) + " años");
		
	}

}
