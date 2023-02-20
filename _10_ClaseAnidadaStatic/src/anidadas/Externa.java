package anidadas;

public class Externa {
	private int a ;
	public void m() {
		//creamos la clase interna dentro de la externa
		//pero tambien se pueden crear objetos de esta 
		//clase a otras clases exteriores
		Interna in=new Interna();
		in.print();
	}
	//lo mismo que el 9 pero esta es una version static
	//no podremos utilizar la variable a en a clase
	//interna por que la variable no es de metodo static 
	public static class Interna{
		private int b;
		public void print() { 
			System.out.println("interna");
		}
	}
}
