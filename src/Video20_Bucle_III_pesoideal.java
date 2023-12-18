import javax.swing.*;
public class Video20_Bucle_III_pesoideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		
		do {
			
			//Se ingresa el genero de la persona
			genero = JOptionPane.showInputDialog("Introduce su genero");
			
			//Esta condición indica que si no se ingresa, H o M, volverá a preguntarlo 
			//sin limite hasta obtener una respuesta
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introducir altura"));
		
		//Se debe inicializar el peso ideal, porque sino te manda error.
		int pesoideal=0;
		
		//Se evalua si el genero es H o M y se obtiene el peso ideal
		if(genero.equalsIgnoreCase("H")) {
			
			pesoideal =altura-110;
			
		}else if(genero.equalsIgnoreCase("M")) {
			
			pesoideal = altura-120;
			
		}
		
		System.out.println("Su peso ideal es " + pesoideal + " kg" );
		
		
	}

}
