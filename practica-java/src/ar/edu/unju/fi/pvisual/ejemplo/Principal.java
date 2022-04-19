package ar.edu.unju.fi.pvisual.ejemplo;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// Creo un objeto de tipo Persona
		Persona p1  = new Persona(); //Constructor por defecto
		
		System.out.println(p1.toString()+"\n");//Como no le ingrese valores no tiene nada
		
		//Creo otro objeto del tipo Persona
		LocalDate fecha = LocalDate.of(1998, 4, 20);
		Persona p2 = new Persona("Marcos",34554121,fecha);
		
		System.out.println(p2.toString());
		p2.mostrarEdad();
	}

}
