package patterns;

public class InvertedRightAlignedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
