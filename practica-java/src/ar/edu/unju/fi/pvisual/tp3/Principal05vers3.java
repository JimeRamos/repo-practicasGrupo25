package ar.edu.unju.fi.pvisual.tp3;

import java.util.Scanner;

public class Principal05vers3 {
	public static void main(String []args) {
		
		Scanner texto = new Scanner(System.in);
		
		System.out.print(" Ingrese una cadena de texto : ");
		String txt = texto.nextLine();	
		int caracteres = txt.length()-1;
//		System.out.println(" La cadena de texto ingresada es  : "+(txt));
		int j=0,k= caracteres;
		char[] caract = new char[caracteres];
//		String reverso = "";
		for(int i=txt.length()-1; i >=0; i--) {
			char reverso = txt.charAt(i);
	//		System.out.print(" , "+reverso);
			 k = k--;
			if( j>=0 && k>=0) {
				caract[j] = reverso;
	//			System.out.print(""+caract[j]);
			}

		}
		for(int i=caract.length; i>=0; i--) {
			char reverso = txt.charAt(i);
				System.out.print(""+reverso);
			}
		
		
//		System.out.println(" los caracteres son: "+ reverso);	//Mostramos por consola el reverso de la cadena de texto ingresada por el usuario
		
		texto.close();

	}

}
