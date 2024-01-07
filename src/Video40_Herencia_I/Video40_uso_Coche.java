package Video40_Herencia_I;

import javax.swing.*;

public class Video40_uso_Coche {
	
	public static void main(String[] args) {
		
		//Se instancia un objeto de la clase 
		Video40_Coche miCoche = new Video40_Coche();
		
		//Se imprimen los datos generales del miCoche
		System.out.println(miCoche.dime_datos_generales());
		
		//Se establece el color de forma mas dinamica, de parte del cliente
		miCoche.establece_color(JOptionPane.showInputDialog("Introduce el color"));
		
		/* Aclaracion
		 * 
		 * Si no se establece el color del coche, la varaible devuelve "null"
		 */
		
		
		//Se imprime el color del auto
		System.out.println(miCoche.dime_color());
		
		//Se establece si el coche tiene asientos de cuero con un Si o No
		
		miCoche.configura_asientos(JOptionPane.showInputDialog("Introduce si o no asientos de cueros"));
		
		//Imprime que tipo de asientos tiene con el getter
		System.out.println(miCoche.dime_asientos());
		
		//Vide32
		
		miCoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador"));
		
		System.out.println(miCoche.dime_climatizador());
		
		System.out.println(miCoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es:" + miCoche.precio_coche());
		
	}

}
