package accenture;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		boolean isPrime=true;
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				isPrime=false;
			}
		}
		System.out.println(isPrime?"1":"0");
		
	}

}
