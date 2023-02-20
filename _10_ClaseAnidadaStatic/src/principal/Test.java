package principal;

import anidadas.Externa;

public class Test {

	public static void main(String[] args) {
		
		//de esta forma se crea un objeto que es es de tipo static
		//la sintaxis siempre es de esta forma
		//aqui se puede poner (var)
		Externa.Interna in=new Externa.Interna();
		in.print();
	}	
}