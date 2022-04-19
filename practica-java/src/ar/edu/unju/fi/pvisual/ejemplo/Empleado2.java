package ar.edu.unju.fi.pvisual.ejemplo;

import java.time.LocalDate;

public class Empleado2 {
	private String nombre;
	LocalDate fecha_ingreso;
	private int legajo;
	private String email;
	private float sueldo;
	private float horas_trabajadas;
	
	public Empleado2() {
		super();
	}
     
	
	//constructor de punto_14
	public Empleado2(String nombre, int legajo, float horas_trabajadas) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.horas_trabajadas = horas_trabajadas;
	}



	public Empleado2(String nombre, LocalDate fecha_ingreso, int legajo, String email, float sueldo,
			float horas_trabajadas) {
		super();
		this.nombre = nombre;
		this.fecha_ingreso = fecha_ingreso;
		this.legajo = legajo;
		this.email = email;
		this.sueldo = sueldo;
		this.horas_trabajadas = horas_trabajadas;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(LocalDate fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSueldo() {
		return sueldo(sueldo);
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public float getHoras_trabajadas() {
		return horas_trabajadas;
	}

	public void setHoras_trabajadas(float horas_trabajadas) {
		this.horas_trabajadas = horas_trabajadas;
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
		if (legajo == 0)
		    {  legajo = -9999; }
		if (fecha_ingreso == null )
		   { fecha_ingreso = LocalDate.of(1900, 01, 01);}
		 
		return "Nombre= "+nombre +"\n"+ "Fecha_ingreso= "+fecha_ingreso + "\n"+ "Legajo= "+legajo +"\n"+ "Email= "
				+email +"\n"+ "Sueldo= $ "+ sueldo +"\n"+ "Horas_trabajadas= "+horas_trabajadas+"\n";
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
