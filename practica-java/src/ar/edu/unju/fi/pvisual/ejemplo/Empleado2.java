package ar.edu.unju.fi.pvisual.ejemplo;

import java.time.LocalDate;

public class Empleado2 {
	private String Nombre;
	LocalDate Fecha_ingreso;
	private int Legajo;
	private String Email;
	private float Sueldo;
	private float Horas_trabajadas;
	
	public Empleado2() {
		super();
	}

	
	
	public Empleado2(String nombre, LocalDate fecha_ingreso, int legajo, String email, float sueldo,
			float horas_trabajadas) {
		super();
		Nombre = nombre;
		Fecha_ingreso = fecha_ingreso;
		Legajo = legajo;
		Email = email;
		Sueldo = sueldo;
		Horas_trabajadas = horas_trabajadas;
	}



	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public LocalDate getFecha_ingreso() {
		return Fecha_ingreso;
	}

	public void setFecha_ingreso(LocalDate fecha_ingreso) {
		Fecha_ingreso = fecha_ingreso;
	}

	public int getLegajo() {
		return Legajo;
	}

	public void setLegajo(int legajo) {
		Legajo = legajo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public float getSueldo() {
		return sueldo(Sueldo);
	}

	public void setSueldo(float sueldo) {
		Sueldo = sueldo;
	}

	public float getHoras_trabajadas() {
		return Horas_trabajadas;
	}

	public void setHoras_trabajadas(float horas_trabajadas) {
		Horas_trabajadas = horas_trabajadas;
	}
	
	public float sueldo(float Horas_trabajadas) {
		float hs_ordinarias,hs_extra, total_extra,total=0;
		 if (Horas_trabajadas > 160)
		 {
			       hs_extra = Horas_trabajadas - 160;
			       hs_ordinarias = 160 * 600;
			       total_extra = hs_extra * 650;
			       total = hs_ordinarias + total_extra;
			    		   
		 }
		 else
			 total = Horas_trabajadas * 600; 
		
		return total;
	}

	


	@Override
	public String toString() {
		return "Nombre= "+Nombre +"\n"+ "Fecha_ingreso= "+Fecha_ingreso + "\n"+ "Legajo= "+Legajo +"\n"+ "Email= "
				+Email +"\n"+ "Sueldo= $ "+ Sueldo +"\n"+ "Horas_trabajadas= "+Horas_trabajadas;
	}



	public static void main (String[] args) {
		 
		LocalDate i = LocalDate.of(2021, 12, 03);
        float ht = 180;
        Empleado2 sueldo = new Empleado2();
        sueldo.setSueldo(ht);
        float sd = sueldo.getSueldo();
		Empleado2 emp = new Empleado2("juan", i, 4231, "juan20@gmail.com", sd, ht);
	
		System.out.println(emp.toString());
	}
}
