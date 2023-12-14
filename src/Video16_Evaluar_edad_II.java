import javax.swing.*;
public class Video16_Evaluar_edad_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Se evalua la edad con "else if"
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		if(edad<18) {
			
			System.out.println("Eres un adolescente");
			
		} else if (edad<40) {
			
			System.out.println("Eres joven");
			
		} else if (edad<65) {
			
			System.out.println("Eres maduro");
		}else {
			
			System.out.println("Cuidate");
		}
		
		
		
	}

}
