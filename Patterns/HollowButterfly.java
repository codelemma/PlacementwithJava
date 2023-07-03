/*
01 
21 22
31 32 33
41 42 43 44
51 52 53 54 55
61 62 63 64 65 66
HEllO! Enter the number of rows
5
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *
 */
import java.util.*;
public class HollowButterfly {
    public static void main(String []args)
    {
        System.out.print("HEllO! Enter the number of rows");
        Scanner sc=  new Scanner(System.in);
        int n =  sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i==1)||(j==i||j==1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=0;k<2*n-2*i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if((i==1)||(j==i||j==1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.print("\n");
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if((i==1)||(j==i||j==1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=0;k<2*n-2*i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if((i==1)||(j==i||j==1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.print("\n");
        }
    }
    
}
