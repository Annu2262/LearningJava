package capgemini;

import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        
        String str = "";
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
        	
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;  
            } 
            else {
                str += s.charAt(i);
                if (count > 1) {
                    str += count;
                }
                count = 1;
            }
        }

        System.out.println("Compressed String: " + (str.length() < s.length() ? str : s));
    }
}
