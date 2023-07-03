/*
 Enter the number of rows
5
*****
****
***
**
*

 */

import java.util.*;

public class InvertedHalfPyramid {
  public static void main(String []args)   
  {
    System.out.print("Enter the number of rows");
    Scanner  sc  = new Scanner(System.in);
    int n = sc.nextInt();
    for(int k=0;k<n;k++)
    {
        for(int i=0;i<n-k;i++)
        {
            System.out.print(" * ");
        }
        System.out.print("\n");
    }
  }
 
}
