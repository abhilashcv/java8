package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListDuplicateUsingCollectionsFrequency {

	public static void main(String[] args) {
     System.out.println(listDuplicateUsingCollectionsFrequency(Arrays.asList(1,2,4,5,2,7,8,1,9,2,4,3,1,5)));
	}

	private static Set<Integer> listDuplicateUsingCollectionsFrequency(List<Integer> numbers) {
     //numbers.stream().filter(number-> Collections.frequency(numbers, number)>1).forEach(System.out::println);
		
		return numbers.stream().filter(number-> Collections.frequency(numbers, number)>1).collect(Collectors.toSet());	
	}

}
