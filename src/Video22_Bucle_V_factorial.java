import javax.swing.*;
public class Video22_Bucle_V_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se pide un numero
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Introdución numero"));
		
		int resultado=1;
		
		//Se parte del numero y va decreciendo hasta llegar a 0
		for(int i=numero;i>0;i--) {
			
			//Se multiplica consigo mismo para obtenerlo
			resultado=resultado*i;
			
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);
		
	}

}
