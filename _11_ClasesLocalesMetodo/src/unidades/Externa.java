package unidades;

public class Externa {
	private int a;
	private void print() {
		System.out.println("Externa");
	}
	public void interna() {
		//le damos valor constante para que se pueda utilizar 
		int b=4;
		//clase dentro de un metodo
		class Local{
			public void printInterno() {
				//solo se puede utilizar las variables 
				//de otras clases y las locales SOLO si son
				//constantes es decir solo si su valor es fijo 
				//y no cambia
				System.out.println("Print interno"+b);
			}
		}
		//si aqui ponemos b++; da error ya que el 
		//valor de b cambia y ya no es constante
		
		//creamos objeto dentro del metodo interna
		Local l=new Local();
		l.printInterno();
	}
}