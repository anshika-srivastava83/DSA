package solidPatterns;

import java.util.*;

public class pattern8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){
            //space + stars 

            //space 
            for(int col = 1; col <= row-1; col++){
                System.out.print("  ");
            }

            //stars
            for(int col = 1; col<= (2*(n-row))+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
