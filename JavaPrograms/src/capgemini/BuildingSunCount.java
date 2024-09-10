package capgemini;

import java.util.Scanner;

public class BuildingSunCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int maxheight=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>maxheight) {
				maxheight=arr[i];
				count++;
			}
		}
		System.out.print(count);
	}
}
