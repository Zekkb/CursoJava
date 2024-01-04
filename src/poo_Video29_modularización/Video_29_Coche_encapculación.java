package poo_Video29_modularización;

public class Video_29_Coche_encapculación {
	
	/* Encapsulación de variables
	 * 
	 * Se utiliza el acceso de memoria "private"
	 * para que solo se pueda acceder a la información
	 * del objeto solo desde la clase
	*/
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	//video30
	
	String color;
	
	int peso_total;
	
	boolean asientos_cuero,climatizador;
	
	public Video_29_Coche_encapculación() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		
	}
	
	public String Video_30_dame_largo() {
		
		return "El largo del coche es " + largo + " cm";
}
	
	public void Video_30_color_coche() {
		
		color="azul";
	}
	
	public String Video_30_dime_color() {
		
		return "El color del coche es " + color ;
	}
	
}

	



