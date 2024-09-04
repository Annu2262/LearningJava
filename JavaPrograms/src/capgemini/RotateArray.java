package capgemini;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // Size of the array
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Populate the ArrayList
        for (int i = 0; i < x; i++) {
            arr.add(sc.nextInt()); // Read input elements from user
        }
        
        int r = sc.nextInt(); // Number of rotations
        
        // Rotate the ArrayList to the right r times
        for (int i = 0; i < r; i++) {
            int last = arr.remove(arr.size() - 1); // Remove the last element
            arr.add(0, last); // Add it to the beginning
        }
        
        System.out.println(arr);
        sc.close();
    }
}
