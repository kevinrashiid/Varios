package principal;

import anidadas.Externa;

public class Test {

	public static void main(String[] args) {
		
		Externa ex=new Externa();
		//la sintaxis siempre es de esta forma
		//aqui se puede poner (var)
		Externa.Interna in=ex.new Interna();
		in.print();
	}	
}