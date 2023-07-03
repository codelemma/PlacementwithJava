import java.util.*;
public class ZeroOnePattern {
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
                r=i+j;
                if(r%2==0)
                {
                    System.out.print("1 ");
                }
                else if(r%2!=0)
                {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
    }

}
