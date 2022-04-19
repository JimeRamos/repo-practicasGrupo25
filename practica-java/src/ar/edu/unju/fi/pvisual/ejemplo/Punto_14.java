package ar.edu.unju.fi.pvisual.ejemplo;

import java.time.LocalDate;

public class Punto_14 {
	
	
   
	@Override
	public String toString() {
		return "Punto_14 []";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Empleado2 ob1 = new Empleado2();
     System.out.println(ob1.toString());
	
     float ht=140;
     Empleado2 ob2 = new Empleado2("Gojan",null,1254," ",0,ht);
     System.out.println(ob2.toString());
     
     LocalDate fecha = LocalDate.of(2012,04,05);
     Empleado2 ob3 = new Empleado2("Vegeta",fecha,0,"",0,ht);
     System.out.println(ob3.toString());
     
     float hs=160;
     Empleado2 ob4 = new Empleado2("Goku",null,0,"",0,hs);
     System.out.println(ob4.toString());
	}

}
