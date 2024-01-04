package poo_Video29_modularización;

public class Video_29_Coche_Unico_Archivo {
	
	int ruedas;
	int largo;
	int ancho;
	int motor;
	int peso;
	
	public Video_29_Coche_Unico_Archivo() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
	}
	
	public static void main(String args[]) {
		
		Video_29_Coche_Unico_Archivo Renault= new Video_29_Coche_Unico_Archivo();
		
		System.out.println("Este coche tiene " + Renault.ruedas + " ruedas.");		
		
	}
	
}
