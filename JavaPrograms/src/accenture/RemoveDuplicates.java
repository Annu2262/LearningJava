package accenture;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[] = {1, 2, 2, 3, 4, 4, 5, 1};
		HashSet <Integer>set = new HashSet<>();
		for(int i: arr) {
			set.add(i);
		}
		for(int i: set) {
			System.out.print(i+" ");
		}
	}

}
