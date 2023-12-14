import javax.swing.*;
public class Video15_Entrada_ejemplo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* La clase "JOptionPane" se utiliza para 
		 * mostrar una ventana y tomar información
		 * 
		 */
		
		/* Se usa el metodo "showInputDialog()" para 
		 * obtener información mediante una ventana
		 * 
		 * es un metodo "estatico" por lo que necesita
		 * que se escriba la "clase" antes del metodo
		 * para poder usarlo.
		 * 
		 * el metodo "showInputDialog()" toma como argumento
		 * un dato de tipo String
		 * 
		 */
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre");
		
		/* Aca surge un incoveniente, como el dato es de tipo String
		 * edad es un texto y no un numero 
		 * Para solucionar esto se utiliza el la clase 
		 * el metodo "parseInt" de la clase "Interger"
		*/
		
		/* Integer pertenece al paquete "java.lang" por lo que
		 * no hace falta incluirlo en el "import"
		 */
		
		/* el metodo "parseInt" es estatico, por lo que
		 * se necesita utilizar el nombre de la clase
		 * antes de utilizar el metodo
		 * 
		 */
		
		//Metodo 1, en dos lineas 
		String edad =JOptionPane.showInputDialog("Introduce tu edad");
		int edadv = Integer.parseInt(edad);
		
		//Metodo 2, en una sola linea
		//int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		
		System.out.println("Hola " + nombre_usuario + ". Tienes " + edad + " años.");
		System.out.printf(" El año que viene tendras " + (edadv+1));
		
	}

}
