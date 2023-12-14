import javax.swing.*;
import java.util.Scanner;
public class Video17_Condicionales_II_Areas {
	
	public static void main(String[] args) {
		
		System.out.println("Elige una figura: \n1.Cuadrado \n2.Rectangulo \n3.Triangulo \n4.Circulo");
		
		Scanner entrada =new Scanner(System.in);
		
		int figura = entrada.nextInt();
		
		switch(figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
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
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
		
		default:
			System.out.println("La opción no es correcta.");
			
		} 
		
		
	}
}
