package _08_patron_singleton;

public class MiSingleton {
	private static MiSingleton instance;
	
	//unos cuantos metodos
	//el Objetivo del patron singleton es unir varias clases en una sola 
	//TAMBIEN que solo se pueda crear un unico objeto de clase
	//si no queremos que la clase no tenga constructor nos hacemos un contructor PRIVADO
	//una clase de la que solo se puede crear un unico objeto

	private MiSingleton() {
		
	}
	//todas las llamadas a getInstance devuelven el mismo y unico objeto
	public static MiSingleton getInstance() {
		if(instance==null) {
			instance=new MiSingleton();
		}
		return instance;
	}
}