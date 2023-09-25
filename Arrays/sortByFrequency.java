import java.util.*;

public class sortByFrequency {
	public static void main(String[] args) {
		Integer[] arr = {10,7,10,11,10,7,6,5};
		List<Integer> list = Arrays.asList(arr);
		sortbyfreq(list);	
	}

	public static void sortbyfreq(List<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			if (map.containsKey(list.get(i))) {
				map.put(list.get(i),map.get(list.get(i)) + 1);
			} else {
				map.put(list.get(i),1);
			}
		}

		Collections.sort(list,(n1, n2) -> {
			int freq1 = map.get(n1);
			int freq2 = map.get(n2);

			if(freq1 != freq2) {
				return freq2 - freq1;
			}
			return n2 - n1;
		});

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}

}