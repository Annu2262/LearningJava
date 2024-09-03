package Accenture;

import java.util.Scanner;

public class ArrayRats {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int r=sc.nextInt();
		int unit =sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int consumes=r*unit;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(sum>=consumes) {
				System.out.print(i+1);
				break;
			}
		}
		
	}
}
