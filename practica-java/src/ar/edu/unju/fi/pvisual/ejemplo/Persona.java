package ar.edu.unju.fi.pvisual.ejemplo;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	//Atributos
	private String nombre;
	private int dni;
	private LocalDate fechaNac;
	
	//Constructores
	public Persona() {
		
	}

	public Persona(String nombre, int dni, LocalDate fechaNac) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNac = fechaNac;
	}
	
	//Métodos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", fechaNac=" + fechaNac + "]";
	}
	
	//Métodos
	public void mostrarEdad(){
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.fechaNac, hoy);
		
		System.out.println(this.nombre+" tiene "+periodo.getYears()+" años.");
	}
}
