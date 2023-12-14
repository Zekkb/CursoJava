import javax.swing.*;
public class Video15_Entrada_Numeros {
	
	public static void main (String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Introduce un número");
		
		double num2 = Double.parseDouble(num1);
		
		/* Se utiliza el metodo "parseDouble" para 
		 * convertir un String obtenido del usuario
		 * a un dato de tipo "Double".
		 * 
		 * Es un metodo estatico, por lo que se tiene 
		 * que usar el nombre de la clase antes del
		 * metodo.
		 * 
		 */
		
		System.out.println("La raiz de " + num2 + " es ");
		
		/* Se utiliza el metodo "printf" para darle
		 * formato al resultado numerico, agregandole
		 * o quitandole decimales.
		 */
		
		//Numero con formato de 2 decimales
		System.out.println("Con 2 decimales");
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		//Numero con formato de 4 decimales
		System.out.println("");
		System.out.println("Con 4 decimales");
		System.out.printf("%1.4f", Math.sqrt(num2));
		
		
	}
}
