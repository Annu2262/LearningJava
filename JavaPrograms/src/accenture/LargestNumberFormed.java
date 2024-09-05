package accenture;

public class LargestNumberFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,54,62,19,97};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]<arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}}
		String s="";
		for(int i=0;i<arr.length;i++) {
			s+=arr[i];
		}
		System.out.println(s);
	}

}
