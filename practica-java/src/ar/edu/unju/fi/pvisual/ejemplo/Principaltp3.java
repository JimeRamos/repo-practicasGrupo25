package ar.edu.unju.fi.pvisual.ejemplo;

import java.util.Scanner;

public class Principaltp3 {
	
	public void calculoSuma(int array[],int array2[]) {
		int i,k;
		
		  for(i=0;i<array2.length;i++){
			  try {  
			  k=array[i]/array2[i];
			  System.out.println("suma: "+k);
		  	}
		catch(ArithmeticException e) {
			System.out.println("no se puede dividir por sero ");}
		}
		
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ingreso = new Scanner(System.in);
		 
	       int [] array = new int[5];
	       int [] array2 = new int [5];
	       
	       Principaltp3 div = new Principaltp3();
	       
	       System.out.println("array 1: ");
	       int i,j;
	       for(i=0;i<array.length;i++)
	       {
	    	   System.out.print("ingrese valor: ");
	    	   array[i]=ingreso.nextInt();
	       }
	       
	       System.out.println("array 2: ");
	       for(j=0;j<array2.length;j++)
	       {
	    	   System.out.print("ingrese valor: ");
	    	   array2[j]=ingreso.nextInt();
	    	   	       }
	       
	       div.calculoSuma(array,array2);
	       ingreso.close();
	      
		}


	}
