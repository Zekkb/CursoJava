import javax.swing.*;
import java.util.Scanner;
public class Video17_Condicionales_II_Areas {
	
	public static void main(String[] args) {
		
		System.out.println("Elige una figura: \n1.Cuadrado \n2.Rectangulo \n3.Triangulo \n4.Circulo");
		
		//Inicialización de objeto Scanner
		Scanner entrada =new Scanner(System.in);
		
		//Entrada de dato del usuario
		int figura = entrada.nextInt();
		
		/* Estructura switch
		 * Se utiliza para poder aplicar opciones
		 * en un mismo condicional
		 * 
		*/
		switch(figura) {
		case 1:
			/* Entrada de dato del usuario del valor "lado" del cuadrado
			 * Se convierte la entrada de un String a un Int con parseInt
			*/
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			//Se imprime el resultado del area del cuadrado
			System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			System.out.println("El area del rectangulo es " + lado*base);
			
			break;
		
		case 3:
			
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			System.out.println("El area del triangulo es " + (altura*base)/2);
			
			break;
			
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("El area del circulo es ");
			
			//Se imprime el area del circulo con un formato de 2 decimales
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
		//La opción default es opcional
		default:
			System.out.println("La opción no es correcta.");
			
		} 
		
		
		
	}
}
