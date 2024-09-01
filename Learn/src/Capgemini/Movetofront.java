package Capgemini;

import java.util.Scanner;

public class Movetofront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		String hash="";
		String rem="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='#') {
				hash+="#";
			}else {
				rem+=s.charAt(i);
			}
		}
		System.out.println(hash+rem);
	}

}
