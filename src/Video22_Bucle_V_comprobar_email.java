import javax.swing.JOptionPane;
public class Video22_Bucle_V_comprobar_email {

	public static void main(String[] args) {
		//Se modifica el codigo del Video 21
		
		//Se pide el email por una ventana emergente
		String email = JOptionPane.showInputDialog("Introducir email");
		
		int arroba=0;
		
		boolean punto=false;
		
		for(int i=0;i<email.length();i++) {
			
			/* En la condición del for, se utiliza el metodo
			 * length() para obtener la cantidad de letras del email
			*/
			
			//Se evalua si tiene un unico @ en el email
			if(email.charAt(i)=='@') {
				
				arroba++;
				
			}
			
			//Se evalua si un punto por lo menos
			if(email.charAt(i)=='.') {
				
				punto=true;
				
			}
			
		}
		
		//Si tiene un unico arroba y por lo menos un punto
		if(arroba==1 && punto==true){
			
			System.out.println("Correcto");
			
		}else {
			
			System.out.println("No es correcto");
		}
		
		
		
	}

}
