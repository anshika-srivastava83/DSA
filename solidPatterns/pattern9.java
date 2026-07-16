package solidPatterns;

import java.util.*;

public class pattern9 {
    public static void main(String[] args) {
        // solid diamond

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numer of rows: ");
        int n = sc.nextInt();

        int mid = (n + 1) / 2;

        //space + stars -> (1 to =mid) & (mid+1 to n)

        //first half (1->mid)
        //space = mid - row      stars = 2*row-1

        for(int row = 1; row<=mid; row++){
            //space 
            for(int col=1; col<=mid-row; col++)
                System.out.print("  ");

            //stars
            for(int col = 1; col<= 2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        

        //second half (mid+1 -> n)
        //space = row - mid      stars = (n-r) + ((n-r)+1) = 2*(n-r)+1
        for(int row = mid+1; row<=n; row++){
            //space
            for(int col=1; col<=row-mid;col++)
                System.out.print("  ");

            //stars
            for(int col = 1; col<= 2*(n-row)+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();

    }
}
