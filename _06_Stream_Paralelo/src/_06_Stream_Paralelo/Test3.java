package _06_Stream_Paralelo;

import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> lista=List.of(4,5,1,6,22,75,1,9,11,22);
		System.out.println(lista.parallelStream()
				.distinct()
				.max((a,b)->a-b)
				.get());
		//75
	}

}
