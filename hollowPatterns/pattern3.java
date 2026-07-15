package hollowPatterns;

import java.util.*;

public class pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            // starting spaces + pattern

            // starting spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" "); // single space for starting spaces
            }

            // pattern = 1 star + space + 1 star -> till n-1
            if (row == 1 || row == n) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            }else{
                for(int col = 1; col <= 2*row - 1; col++){
                    if(col == 1 || col == 2*row - 1){          //after the starting spaces, the first column and (2*r - 1)column
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();

        }

        sc.close();
    }

}
// or I can print a star and then the spaces according to some formula (in a for loop) and then 1 star
// after the starting spaces 
// space between formula = 2*row - 3