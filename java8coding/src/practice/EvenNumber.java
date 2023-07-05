package practice;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(10,15,8,49,6,3,11);
		ints.stream().filter(i->i%2==0).forEach(System.out::println);
	}
}
