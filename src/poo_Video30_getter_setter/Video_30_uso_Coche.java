package poo_Video30_getter_setter;

import poo_Video29_modularización.Video_29_Coche_encapculación;

public class Video_30_uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Video_29_Coche_encapculación miCoche = new Video_29_Coche_encapculación();
		
		//Se imprime el largo del coche con un getter
		System.out.println(miCoche.Video_30_dame_largo());
				
		//Se coloca el color del coche con un metodo setter en azul
		miCoche.Video_30_color_coche();
				
		//Se imprime el color del coche en azul con metodo getter
		System.out.println(miCoche.Video_30_dime_color());
		
	}

}
