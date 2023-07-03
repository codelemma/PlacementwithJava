/*
 * Enter the number of rows
4
*
* *
* * *
* * * *
* * *
* *
*

*/

import java.util.*;
public class InvertingPATT {
    public static void main(String [] args)
    {
        System.out.print("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
