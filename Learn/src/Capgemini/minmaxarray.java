package Capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class minmaxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int copy[]=Arrays.copyOf(arr,n);
        Arrays.sort(copy);
        int max=n-1;
        int min=0;
        boolean pickmax=true;
        for(int i=0;i<n;i++) {
        	if(pickmax) {
        		arr[i]=copy[max];
        		max--;
        	}
        	else {
        		arr[i]=copy[min];
        		min++;
        	}
        	pickmax=!pickmax;
        }
        System.out.println("Rearranged array: " + Arrays.toString(arr));
	}

}
