package poo_Video31_parametros_en_metodo;

public class Video31_uso_Coche {
	
	public static void main(String[] args) {
		
		//Se instancia un objeto de la clase 
		Video31_Coche miCoche = new Video31_Coche();
		
		//Se imprimen los datos generales del miCoche
		System.out.println(miCoche.dime_datos_generales());
		
		//Se establece el color de forma mas dinamica, de parte del cliente
		miCoche.establece_color("Rojo");
		
		/* Aclaracion
		 * 
		 * Si no se establece el color del coche, la varaible devuelve "null"
		 */
		
		
		//Se imprime el color del auto
		System.out.println(miCoche.dime_color());
		
		//Se establece si el coche tiene asientos de cuero con un Si o No
		
		miCoche.configura_asientos("No");
		
		//Imprime que tipo de asientos tiene con el getter
		System.out.println(miCoche.dime_asientos());
		
	}

}
