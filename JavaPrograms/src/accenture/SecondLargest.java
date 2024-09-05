package accenture;

public class SecondLargest {
	public static void main(String args[]) {
		int arr[] = {1, 26, 2, 3, 9, 45, 5, 18};
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>largest) {
				secondlargest=largest;
				largest=i;
			}
			else if(i>secondlargest && i!=largest) {
				secondlargest=i;
			}
			
		}
		System.out.println("The second largest element is: " + secondlargest);
	}
}
