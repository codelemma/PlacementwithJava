/*
 * Enter the number of rows
5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

import java.util.*;
public class FloyedsTriangle {
    public static void main(String [] args)
    {
        System.out.print("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                counter++;
                System.out.print(counter+" ");
            }
            System.out.print("\n");
        }

    }
}
