package practice;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		// myList.stream().filter(i->i+"".startsWith("1")).forEach(System.out::println);
		myList.stream().map(num -> num + "").filter(num -> num.startsWith("1")).forEach(System.out::println);
	}
}
