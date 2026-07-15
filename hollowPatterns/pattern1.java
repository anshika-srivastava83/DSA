package hollowPatterns;

import java.util.*;

public class pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of columns: ");
        int m = sc.nextInt();

        // my logic : checking the rows first and then the columns 
        for (int row = 1; row <= n; row++) {
            // star + space + star
            if (row == 1 || row == n) {
                for (int col = 1; col <= m; col++) {
                    System.out.print("* ");
                }
            } else {
                for (int col = 1; col <= m; col++) {
                    if (col == 1 || col == m) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");         //using two spaces so the stars align with the spaces 
                    }
                }
            }
            System.out.println();
        }

               // other logic : see the border and fill them with stars 
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= m; col++) {

        //         if (row == 1 || row == n || col == 1 || col == m) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        //}
        sc.close();
    }

}
