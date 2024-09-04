package capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class CountIntegerOccurrence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int count=1;
        Arrays.sort(arr);
        for(int i=0;i<n;i++) {
        	if(i<n-1 && arr[i]==arr[i+1]) {
        		count++;
        	}
        	else {
        		System.out.println(arr[i] +"-> "+count);
        		count=1;
        	}
        }
	}
}
