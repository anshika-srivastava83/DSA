package hollowPatterns;

import java.util.*;

public class pattern2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of rows: ");
        int n = sc.nextInt();

        // hollow right angled triangle
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            }else{
                for( int col = 1; col<= row ; col++){
                    if(col == 1 || col == row){
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
