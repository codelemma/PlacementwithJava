/*
Enter the number of rows
8
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  * 
 *  *  *  *  *  *
 *  *  *  *  *  *  *
 */
import java.util.*;

public class Halfpyramid {
    public static void main(String [] args)
    {
        System.out.print("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }


    }

}
