package accenture;

import java.util.Scanner;

public class DivisorSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}