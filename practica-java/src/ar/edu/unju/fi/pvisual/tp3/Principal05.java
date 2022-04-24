package ar.edu.unju.fi.pvisual.tp3;

import java.util.Scanner;

public class Principal05 {
	
	public static void main(String []args) {
		
		Scanner texto = new Scanner(System.in);
		
		System.out.print(" Ingrese una cadena de texto : ");
		String txt = texto.nextLine();
		System.out.print(" La cadena de texto ingresada es  : "+(txt));
		
		texto.close();
	}
	
}
