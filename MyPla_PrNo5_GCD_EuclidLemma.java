/*
 * Enter the first number:
270
Enter the second number:
192
The Greatest Common Divisor of 270 and 192 is :6
 */
import java.util.*;
public class MyPla_PrNo5_GCD_EuclidLemma {
    public static void main(String[] args)
    {
        System.out.println("Enter the first number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y = sc.nextInt();
        int res = GreatestCommonDivisor(x,y);
        System.out.print("The Greatest Common Divisor of "+ x +" and "+ y +" is :"+res);
    }
    public static int GreatestCommonDivisor(int n,int m) {
        while(n!=m) {
            if(n>m){
                n = n-m;
            }
            else {
                m = m-n;
            }
        }
        return n;
    }
}
