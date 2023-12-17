import javax.swing.*;
public class Video18_Bucles_I_Acceso_aplicación {
	
	public static void main(String[] args) {
		
		String clave="pepito2000";
		
		String pass="";
		
		int i=0;
		
		/* Estructura while
		 * Es un bucle indeterminado
		 * se aplica con una condición que debe ser
		 * verdadera para entrar y falsa para cerrarlo
		 * 
		 */
		
		//La condición evalua si "clave" es igual a "pass" y luego si es falso
		while(clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Introducir la contraseña");
			
			
			if(clave.equals(pass)==false) {
				
				System.out.println("Contraseña Incorrecta. Intente de nuevo");
				
			}
			i++;
			
		}
		
		System.out.println("Contraseña Correcta");
		System.out.println("Cantidad de intentos " + i);
		
	}
}
