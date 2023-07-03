import java.util.*;
public class PascalsTriangle 
 {
            public static void main(String [] args)
        {
        System.out.print("Enter the number of Rows");
        Scanner sx = new Scanner(System.in);
        int i,k;
        int n = sx.nextInt();
        for(i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                int c = factorial(i)/(factorial(i-k)*factorial(k));
                System.out.print(" "+c);
            }
            System.out.print("\n");
            }
        }
     public static int factorial(int i)
        {
            if (i == 0)
                return 1;
            return i * factorial(i - 1);
        }
}
