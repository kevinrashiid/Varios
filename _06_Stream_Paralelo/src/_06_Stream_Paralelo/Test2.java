package _06_Stream_Paralelo;

import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> lista=List.of(4,5,1,6,22,75,1,9,11,22);
		lista.parallelStream()//Stream
		.distinct()//Stream
		.sequential()//te sale en la forma en el orden que esta en la List
		.forEach(System.out::println);
	}
}