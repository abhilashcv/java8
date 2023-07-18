package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDuplicateUsingMap {

	public static void main(String[] args) {
		listDuplicateUsingMap(Arrays.asList(1,2,3,2,4,5,1,7,11,1,7,3,8,3,19,3));
	}
	
	private static void listDuplicateUsingMap(List<Integer> numbers){
		Map<Integer, Integer> numberFrequencyMap = new HashMap<Integer, Integer>();
		for (Integer integer : numbers) {
				numberFrequencyMap.put(integer, numberFrequencyMap.getOrDefault(integer, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : numberFrequencyMap.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println( key + ":" + " repeated " + val + " times");
		}
	}
}

