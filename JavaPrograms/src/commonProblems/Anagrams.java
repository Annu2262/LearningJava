package commonProblems;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="hgddv";
		char[] a1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] a2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean isAnagram = Arrays.equals(a1, a2);
        System.out.println(isAnagram?"Anagram":"Not Anagram");
		
	}

}
