/*
A naive Approach to solve gcd problem
 * Enter the first number:
1024
Enter the second number:
256
The Greatest Common Divisor of 1024 and 256 is :256
 */
import java.util.*;
public class MyPla_PrNo5_GreatestCommonDivisor {
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
    public static int GreatestCommonDivisor(int num1,int num2) {
        int temp = (num1<num2?num2:num1);
        for(int i=temp;i>0;i--)
        {
            if(num1%i==0 && num2%i==0){
                temp = i;
                break;

            }
        }
        return temp;
    }

}
