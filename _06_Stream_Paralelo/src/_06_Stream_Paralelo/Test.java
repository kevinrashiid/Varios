package _06_Stream_Paralelo;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> lista=List.of(4,5,1,6,22,75,1,9,11,22);
		//CUENTA LOS NO REPETIDOS PERO CADA HILO PARA CADA NUMERO ASI SE EJECUTARA MAS RAPIDO
		System.out.println(lista.parallelStream()
								.distinct()
								.count());
	}
}