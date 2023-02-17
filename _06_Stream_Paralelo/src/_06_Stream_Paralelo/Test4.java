package _06_Stream_Paralelo;

import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List<Integer> lista=List.of(4,5,1,6,11,75,1,9,11,22);
		lista.parallelStream()
		.peek(System.out::println)
		.sequential()//en orden original
		.anyMatch(n->n>10);//mayores a 10 

		/*4,5,1,6,11*/
	}
}