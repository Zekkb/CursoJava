package Video41_Herencia_II;

import javax.swing.*;

public class Video41_uso_Vehiculo {
	
	public static void main(String[] args) {

		//Video 41
		
		//Se instancia un objeto de la clase Coche
		Video41_Coche micoche1 = new Video41_Coche();
		
		micoche1.establece_color("Rojo");
		
		//Se instancia un objeto de la clase furgoneta
		Video41_Furgoneta mifurgoneta1 = new Video41_Furgoneta(7,580);
		
		//Se setean valores
		mifurgoneta1.establece_color("Azul");
		
		mifurgoneta1.configura_asientos("Si");
		
		mifurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales() + " " + mifurgoneta1.dimeDatosFurgoneta() + " " + mifurgoneta1.dime_color());
		
		
	}

}
