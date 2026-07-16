package solidPatterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int row = 1; row<=n; row++){
            //we divide columns in two parts : spaces + stars
            // spaces = n - row, stars = n (constant)

            //spaces 
            for(int col = 1; col <= n-row; col++){
                System.out.print("  ");
            }
            //stars
            for(int col=1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
