package ar.edu.unju.fi.pvisual.tp3;
/**
 * Se importa la clase scanner para hacer uso de la misma durante el main
 */
import java.util.Scanner;

public class Principal05 {
	
	public static void main(String []args) {
		
		Scanner texto = new Scanner(System.in);
		
		System.out.print(" Ingrese una cadena de texto : ");
		/**
		 * Se guarda la cadena texto como un string
		 */
		String txt = texto.nextLine();	
		/**
		 * Muestra por consola la cadena de texto introducida por el usuario
		 */
		System.out.println(" La cadena de texto ingresada es  : "+(txt));
		/**
		 * Se inicializa la variable tipo string....
		 */
		String reverso = "";
		/**
		 * Atraves de la estructura for podemos separar la cadena de texto caracter por caracter
		 */
		for(int i=txt.length()-1; i>=0; i--) {
			char inverso = txt.charAt(i);
			 reverso = reverso+inverso;		//almacenamos los caracteres de la cadena de texto en una variable de tipo string
		}
		
		System.out.println(" El reverso es: "+ reverso);	//Mostramos por consola el reverso de la cadena de texto ingresada por el usuario
		
		
		//	System.out.println(" el caracter es : "+ inverso);
		//	reverso = reverso+inverso;
		texto.close();
//		inverso.close();
//		invertido.close();
	}
	
}

