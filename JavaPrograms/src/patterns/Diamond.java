package patterns;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=9;
		//upper half of the diamond
		for(int i=1;i<=max;i+=2) {
			for(int j=max;j>i;j-=2) {
				System.out.print(" ");
			}
			//number printing
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//lower half of the diamond
		for(int i=max-2;i>=1;i-=2) {
			for(int j=max; j>i; j-=2) {
				System.out.print(" ");
			}
			//number printing
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
