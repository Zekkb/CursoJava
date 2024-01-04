package poo_Video30_getter_setter;

public class Video_30_Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	//video30
	
	String color;
	
	int peso_total;
	
	boolean asientos_cuero,climatizador;
	
	public Video_30_Coche() {
			
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



	
