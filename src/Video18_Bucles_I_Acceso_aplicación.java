import javax.swing.*;
public class Video18_Bucles_I_Acceso_aplicación {
	
	public static void main(String[] args) {
		
		String clave="pepito2000";
		
		String pass="";
		
		int i=0;
		
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
