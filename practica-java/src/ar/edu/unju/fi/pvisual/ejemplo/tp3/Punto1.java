package ar.edu.unju.fi.pvisual.ejemplo.tp3;

import java.util.Scanner;


public class Punto1 {
	Scanner ingreso = new Scanner(System.in);
	
	public  void ingreso(int array[]) {            //metodo para el ingreso de datos
		int i;
	       for(i=0;i<array.length;i++)
	       {
	    	   System.out.print("ingrese valor: ");
	    	   array[i]=ingreso.nextInt();	       }
	  }
	
	public void calculoDivision(int array[],int array2[]) {        //calculo de division
		int i,k;
		
		  for(i=0;i<array2.length;i++){
			  try {  
			  k=array[i]/array2[i];
			  System.out.println("suma: "+k); 	}
		catch(ArithmeticException e) {
			System.out.println("no se puede dividir por sero ");   }
		}
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	       int [] array = new int[5];
	       int [] array2 = new int [5];
	      Punto1 div = new Punto1();
	      
	     System.out.println("arreglo 1: ");
	     div.ingreso(array);
	     System.out.println("arreglo 2: ");
	     div.ingreso(array2);
	     System.out.println("Resultado: ");
	     div.calculoDivision(array,array2);        	      
		}
}
