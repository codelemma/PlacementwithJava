import java.util.*;
public class MyPla_PrNo5_GCD_EuclidsMostOptimizedSolution {
    public static void main(String[] args)
    {
        System.out.println("Enter the first number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y = sc.nextInt();
        int res = GreatestCommonDivisorEuclidsOptimized(x,y);
        System.out.print("The Greatest Common Divisor of "+ x +" and "+ y +" is :"+res);
    }
    public static int GreatestCommonDivisorEuclidsOptimized(int p,int q) {
        if(q==0){
            return p;
        }
        else return GreatestCommonDivisorEuclidsOptimized(q ,p % q);
    }
}
