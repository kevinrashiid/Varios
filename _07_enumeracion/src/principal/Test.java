package principal;

import model.DiaSemana;
import model.Tienda;

public class Test {

	public static void main(String[] args) {
		
		//creamos un tienda con el dia de cierre el jueves
		var tienda=new Tienda("t1","aaa",DiaSemana.Jueves);
		//muestra mensaje distinto en funcion del dia de cierre
		switch (tienda.getDiaCierre()) {
		case Lunes:
		case Domingo:
		}	
	}
}