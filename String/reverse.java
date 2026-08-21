package String;

import java.util.Scanner;

public class reverse {
    
    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for(int i = n-1; i>=0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println();
        System.out.println(reverseString(str));
        sc.close();
    }
}
