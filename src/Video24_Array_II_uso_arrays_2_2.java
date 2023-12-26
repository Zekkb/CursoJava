import javax.swing.*;
public class Video24_Array_II_uso_arrays_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises=new String[8];
		
		//Ingresan los paises mediante JOptionPane
		for(int i=0;i<8;i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introducir un pais " + (i+1));
			
		}
		//Recorrer la matris paises mediante for each
		for(String elemento:paises) {
			
			System.out.println("Pais: " + elemento);
		}
		
		
	}

}
