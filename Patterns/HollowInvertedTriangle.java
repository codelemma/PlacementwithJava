import java.util.*;
public class HollowInvertedTriangle {
    public static void main(String[] args)
    {
        System.out.print("Enter the number of Rows");
        Scanner sx = new Scanner(System.in);
        int n = sx.nextInt();
        //System.out.print(n);
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                if((i==1||j==n)||(i+1==j)){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
