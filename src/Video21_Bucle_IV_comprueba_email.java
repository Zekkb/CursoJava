import javax.swing.*;
public class Video21_Bucle_IV_comprueba_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se pide el email por una ventana emergente
		String email = JOptionPane.showInputDialog("Introducir email");
		
		boolean arroba=false;
		
		/* Estructura For
		 * 
		 * Es un bucle determinado, se utiliza para que 
		 * recorrar una secuencia de veces definidas
		 * 
		 * Tiene 3 datos que se definen dentro suyo
		 * contador inicial
		 * condicion
		 * contador final
		 * 
		 */
		
		for(int i=0;i<email.length();i++) {
			
			/* En la condición del for, se utiliza el metodo
			 * length() para obtener la cantidad de letras del email
			*/
			
			//Se evalua si tiene un @ en el email
			if(email.charAt(i)=='@') {
				
				arroba=true;
				
			}
			
		}
		
		//Si tiene arroba, entonces el email es correcto
		if(arroba==true){
			
			System.out.println("Correcto");
			
		}else {
			
			System.out.println("No es correcto");
		}
		
		
		
	}

}
