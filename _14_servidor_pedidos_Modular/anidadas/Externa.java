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
	public class Interna{
		private int b;
		public void print() {
			System.out.println("interna");
		}
	}
}
