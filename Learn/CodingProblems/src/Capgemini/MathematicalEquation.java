package Capgemini;

import java.util.Scanner;

public class MathematicalEquation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double sum = Math.pow(a,3) +Math.pow(a,2)*b + 2*Math.pow(a,2)*b +2*Math.pow(b,2)*a +Math.pow(b,2)*a +Math.pow(b,3);
		System.out.print(sum);
		sc.close();
	}
}
