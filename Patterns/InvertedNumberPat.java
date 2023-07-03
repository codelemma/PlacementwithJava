/* 
Enter the number of rows
5
12345
1234
123
12
1 
*/

import java.util.*;
public class InvertedNumberPat {
    public static void main(String [] args)
    {
        System.out.print("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j+"");
            }
            System.out.print("\n");
        }

    }
}
