package ar.edu.unju.fi.pvisual.ejemplo.tp3;

import java.util.Scanner;

public class Punto6 {
	
	public void inverso(int arreglo[]) {   //muestra el arreglo inverso 
	  int i=9;
	  while(i>=0) {
		  System.out.println(arreglo[i]);
		  i--;
	  }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner ingreso = new Scanner(System.in);
     int [] arreglo = new int [10];
     Punto6 enteros = new Punto6();
     System.out.println("ingrese 10 numeros enteros");
     for(int i=0;i<arreglo.length;i++) {
    	 System.out.print("ingrese valor: ");
    	 arreglo[i]=ingreso.nextInt();
     }
     
     enteros.inverso(arreglo);
     ingreso.close();
	}

}
