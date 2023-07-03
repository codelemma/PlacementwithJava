/*
 Enter the number of rows
6
                *
             *  *
          *  *  *
       *  *  *  *
    *  *  *  *  *
 *  *  *  *  *  *
 */


import java.util.*;

public class Halfrotatedpyramid {
    
    public static void main(String []args)
    {
        System.out.print("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {    
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

    }
}
