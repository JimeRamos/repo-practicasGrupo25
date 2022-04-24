package ar.edu.unju.fi.pvisual.tp3;

import java.util.Scanner;

public class Principal02 {
	
	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		Scanner respuesta = new Scanner(System.in);
		
		int[] numeros = {0,1,2,3,4,5,6,7,8,9,10};
		int i=2;
		
		String cad,cad1,cad2,cad3;
		cad = "nO";
		cad1 = "No";
		cad2 = "no";
		cad3 = "NO";	
		
		while (i==2) {
			System.out.print(" \n Ingrese un Número Entero del 1 - 9: ");
			int num = numero.nextInt();
			
			if (num>=1 && num<=9){
				System.out.print("\n Tabla de Multiplicar "+(num));
				
				for (int k=0; k<numeros.length; k++) {
					System.out.print("\n "+(num)+ " X "+(k) +" = "+(num*k));
				}

				System.out.print("\n ¿Desea ingresar un nuevo Número? ¿Si/No? : ");
				String res = respuesta.nextLine();
				
				if(cad.equals(res) == true) {
					
					System.out.print("\n El programa finalizoen el primer if ");
					i= i-1;
				}
				else {
					if(cad1.equals(res) == true) {
						System.out.print("\n El programa finalizoen el segundo if ");
						i= i-1;
					}
					else {
						if(cad2.equals(res) == true) {
							System.out.print("\n El programa finalizoen el tercer if ");
						i= i-1;
						}
						else {
							if(cad3.equals(res) == true) {
								System.out.print("\n El programa finalizoen el cuarto if ");
							i= i-1;
							}
						}
					}
				}

			}
			else {
				System.out.println("\n El número ingresado no corresponde al rango establecido ");
			}

		}
		numero.close();
		respuesta.close();
	}
}
