/*11 12 13 14 15 16 // i==1              15 (j==n)
                                      24 25
                                   33 34 35
                j+i=(n+1)       42 43 44 45   
                             51 52 53 54 55 (i==n) 

                             11 12 13 14 15 16 (i==1)
                             21 22 23 24 25 
                             31 32 33 34 
                 j==1        41 42 43 i+j=n+1
                             51 52 
                             61
//j==1 || i+j=n+1
===============================================================================
OUTPUT BE LIKE!
Enter the number of rows
8
       ********
      *      *
     *      *
    *      *
   *      *
  *      *
 *      *
********

*/

import java.util.*;
public class HollowRohmbus {
    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
             
            }
            for(int k=n;k>n-i;k--)
            {
                if(i==n||k==n){
                System.out.print("*");}
                else {
                    System.out.print(" ");
                }
            }
            for(int j=n;j>i;j--)
            {
                if((i==1)||(i+1==j)){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
}
