package capgemini;

import java.util.Scanner;

public class addNumbers {

	public static void main(String args[]) {
		System.out.println("Hello Wolrd");
		System.out.println("Enter the numbers : ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++) {
			int x=i;
			while(x>0) {
			int c=x%10;
			sum+=c;
			x/=10;
			}
		}
		System.out.print(sum);
		sc.close();
	}
}
