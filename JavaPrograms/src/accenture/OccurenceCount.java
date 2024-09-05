package accenture;

import java.util.HashMap;
import java.util.Map;

public class OccurenceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 3, 4, 4, 5, 1};
		HashMap <Integer,Integer> map=new HashMap<>();
		for(int i:arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		System.out.println("Element Occurrences:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}
