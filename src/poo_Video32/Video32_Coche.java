package poo_Video32;

public class Video32_Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero,climatizador;
	
	public Video32_Coche(){
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		
	}
	
	//Los metodos Getter se utilizan para obtener algun propiedad de la clase
	
	public String dime_datos_generales() { //Getter
		
		//Se imprimen todos los datos del coche
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas." 
		+ "Mide " + largo/1000 + " metros" + "Con un ancho de " + ancho + "cm"
		+ "Un peso de plataforma de " + peso_plataforma + "kg";
	}
	
	
	//Es una segunda variable del metodo de arriba
	public String dime_datos_generales2() { //Getter
		
		//Se almacenan cada dato en una variable, y se imprimen
		String ruedas = "La plataforma del vehiculo tiene " + this.ruedas + " ruedas. \n";
		String largo = "Mide " + this.largo/1000 + " metros \n";
		String ancho = "Con un ancho de " + this.ancho + "cm \n";
		String peso_plataforma = "Un peso de plataforma de " + this.peso_plataforma + "kg \n";
		
		return ruedas + largo + ancho + peso_plataforma;
	}
	
	//Los metodos Setter se utilizan para modificar o establecer algun propiedad de la clase
	
	public void establece_color(String color_coche) {
		
		color=color_coche;
	}
	
	public String dime_color() {
		
		return "El color del coche es " + color;
		
	}
	
	//Este metodo establece si los asientos son de cuero o de serie
	public void configura_asientos(String asientos_cuero) { //Setter
		
		if("Si".equalsIgnoreCase(asientos_cuero)) {
			
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
		
	}
	
	//Este metodo imprime si el auto tiene asiento de cuero o de serie
	public String dime_asientos() { //Getter
		
		if(asientos_cuero==true) {
			
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	//Video 32
	
	//Este metodo establece si el coche tiene o no climatizador
	public void configura_climatizador(String climatizador) { //Setter
		
		if(climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	//Este metodo imprime si el coche tiene o no climatizador
	public String dime_climatizador() { //Getter
		
		if(climatizador) {
			
			return "El coche incorpora climatizador";
		}else {
			return "El coche lleva aire acondicionado";
		}
		
	}
	
	//Este metodo calcula e imprime el peso del coche
	public String dime_peso_coche() { //Setter + Getter
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero) {
			
			peso_total=peso_total+50;
		}
		
		if(climatizador) {
			peso_total=peso_total+20;
		}
		
		return "El peso del coche es " + peso_total;
		
	}
	/* Este metodo es un getter y setter, porque calcula
	 * el peso del coche y luego imprime el valor en 
	 * un string
	 */
	
	//Este metodo devuelve el precio del coche
	public int precio_coche() {
		
		int precio_final = 10000;
		
		if(asientos_cuero) {
			precio_final+=2000;
		}
		
		if(climatizador) {
			precio_final+=1500;
		}
		
		return precio_final;
	}
	
	
}
