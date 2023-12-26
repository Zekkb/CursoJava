package poo_Video29_modularización_Unico_archivo;

public class Video_29_Coche {
	
	int ruedas;
	int largo;
	int ancho;
	int motor;
	int peso;
	
	public Video_29_Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
	}
	
	public static void main(String args[]) {
		
		Video_29_Coche Renault= new Video_29_Coche();
		
		System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");		
		
		
	}
	
}
