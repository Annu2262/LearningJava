package capgemini;

import java.util.Scanner;

public class minOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int operations = 0;

        while (n > 1) {
            boolean divided = false;

            for (int i = n - 1; i >= 2; i--) {
                if (n % i == 0) {  
                    n = n / i;  
                    divided = true;
                    break;
                }
            }

            if (!divided) {
                n = n - 1;
            }

            operations++;
        }

        System.out.print(operations);
    }
}
